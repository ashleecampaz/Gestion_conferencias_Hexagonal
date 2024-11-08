/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.domain;

import com.conference.gestion_conferencias.Application.IChairQuery;
import com.conference.gestion_conferencias.Application.IEventPersistence;
import com.conference.gestion_conferencias.Application.IEventQuery;
import com.conference.gestion_conferencias.Application.IEventRegister;
import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberQuery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class EventService implements IEventQuery, IEventRegister{

    private final IEventPersistence persistence; 
    private final IChairQuery chairQuery; 
    private final IProgramCommitteeMemberQuery commiteeMemberQuery; 

    public EventService(IEventPersistence persistence, IChairQuery chairQuery, IProgramCommitteeMemberQuery commiteeMemberQuery) {
        this.persistence = persistence;
        this.chairQuery = chairQuery;
        this.commiteeMemberQuery = commiteeMemberQuery;
    }
    
    @Override
    public List<Event> findAll() {
       return persistence.findAll();
    }

    @Override
    public Event findById(Long id) {
        return persistence.findById(id); 
    }

    @Override
    public Chair getChair(Long id) {
        Event event = persistence.findById(id);
        return chairQuery.findById(event.getChair_id()); 
    }

    @Override
    public List<ProgramCommitteeMember> getCommitteeMembers(Long id) {
        Event event = persistence.findById(id);
        List<Long> committeeMembers_ids = event.getProgramCommitte();
        List<ProgramCommitteeMember> committeeMembers = new ArrayList(); 
        for(Long l:committeeMembers_ids){
            committeeMembers.add(commiteeMemberQuery.findById(l));
        }
        return committeeMembers; 
    }

    @Override
    public Event createEvent(Event e) {
       return persistence.createEvent(e); 
    }
    
}
