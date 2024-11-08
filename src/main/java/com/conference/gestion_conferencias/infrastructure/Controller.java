/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure;

import com.conference.gestion_conferencias.Application.IChairQuery;
import com.conference.gestion_conferencias.Application.IChairRegister;
import com.conference.gestion_conferencias.Application.IConferenceRest;
import com.conference.gestion_conferencias.Application.IEventQuery;
import com.conference.gestion_conferencias.Application.IEventRegister;
import com.conference.gestion_conferencias.Application.IProgramCommitteMemberRegister;
import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberQuery;
import com.conference.gestion_conferencias.domain.Chair;
import com.conference.gestion_conferencias.domain.Event;
import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;
import com.conference.gestion_conferencias.infrastructure.access.EntityChair;
import com.conference.gestion_conferencias.infrastructure.access.EntityEvent;
import com.conference.gestion_conferencias.infrastructure.access.EntityProgramCommitteMember;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ashlee Campaz
 */
@RestController
@RequestMapping("/Gestion_Conferencias")
public class Controller {
    
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IChairRegister chairRegister; 
    @Autowired
    private IChairQuery chairQuery;
    
    @Autowired
    private IEventQuery eventQuery;
    @Autowired
    private IEventRegister eventRegister; 
    @Autowired
    private IProgramCommitteMemberRegister committeMemberRegister;
    @Autowired
    private IProgramCommitteeMemberQuery committeMemberQuery;
    
    @PostMapping(value = "/chairs")
    public ResponseEntity<EntityChair>  createChair(@RequestBody EntityChair ec) {
        Chair chair= modelMapper.map(ec, new TypeToken<Chair>(){
        }.getType());
        Chair createdChair = chairRegister.createChair(chair);
        
        EntityChair entityCreated = modelMapper.map(createdChair, new TypeToken<EntityChair>(){
        }.getType());
        if (entityCreated!=null)
             return  new ResponseEntity<EntityChair>(entityCreated, HttpStatus.ACCEPTED);
        return new ResponseEntity<EntityChair>(entityCreated, HttpStatus.NOT_ACCEPTABLE);
    }
    
    @PostMapping(value = "/events")
    public EntityEvent createEvent(@RequestBody EntityEvent e) {
        Event event =  modelMapper.map(e, new TypeToken<Event>(){
        }.getType());
        
        Event createdEvent = eventRegister.createEvent(event); 

        if(createdEvent!=null)
            return  null;
        EntityEvent entityEvent =  modelMapper.map(createdEvent, new TypeToken<EntityEvent>(){
        }.getType());
        return entityEvent;
    }
    
    @PostMapping(value = "/pogramCommitteMembers")
    public EntityProgramCommitteMember createPogramCommitteMember(@RequestBody EntityProgramCommitteMember pcm) {
        ProgramCommitteeMember committeMember =  modelMapper.map(pcm, new TypeToken<ProgramCommitteeMember>(){
        }.getType());
        
        ProgramCommitteeMember createdMember = committeMemberRegister.createProgramCommitteeMember(committeMember);

        if(createdMember!=null)
            return  null;
        EntityProgramCommitteMember entityMember =  modelMapper.map(createdMember, new TypeToken<EntityProgramCommitteMember>(){
        }.getType());
        return entityMember;
    }
    
    @GetMapping(value = "event/{id}/pogramCommitteMembers")
    public List<EntityProgramCommitteMember> getProgramCommitMembers(@PathVariable Long eventId) {
       Event event = eventQuery.findById(eventId); 
       if(event!=null)
           return null;
       List<ProgramCommitteeMember>  committeeMembers= eventQuery.getCommitteeMembers(eventId); 
       List<EntityProgramCommitteMember> entityCommitteeMembers = modelMapper.map(committeeMembers, new TypeToken<List<ProgramCommitteeMember>>(){
        }.getType());
       return entityCommitteeMembers; 
    }
    
    @GetMapping(value = "event/{id}/chair")
    public ResponseEntity<EntityChair> getChair(@PathVariable Long eventId) {
        Event event = eventQuery.findById(eventId);
        if(event==null)
            return null; 
        Long chair_id = event.getChair_id(); 
        Chair event_chair = chairQuery.findById(chair_id); 
        EntityChair entityChair= modelMapper.map(event_chair, new TypeToken<EntityChair>(){
        }.getType());
        return new ResponseEntity<EntityChair>(entityChair, HttpStatus.OK);
    }
   

    @GetMapping(value = "/events")
    public List<EntityEvent> getEvents() {
        List<Event> events = eventQuery.findAll();
        List<EntityEvent> entityEvents= modelMapper.map(events, new TypeToken<List<EntityChair>>(){
        }.getType());
        return entityEvents; 
    }
    
}
