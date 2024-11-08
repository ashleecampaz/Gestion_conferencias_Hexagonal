/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.access;

import com.conference.gestion_conferencias.Application.IEventPersistence;
import com.conference.gestion_conferencias.domain.Event;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IEventRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 *
 * @author Ashlee Campaz
 */
public class EventRepository implements IEventPersistence{

    private final IEventRepository repositorio; 
    private final ModelMapper modelMapper;
    
    public EventRepository(IEventRepository repositorio, ModelMapper modelMapper ) {
        this.repositorio = repositorio;
        this.modelMapper = modelMapper; 
    }
    
    
    
    @Override
    public List<Event> findAll() {
        List<EntityEvent> entityEvents = (List<EntityEvent>) repositorio.findAll();
        List<Event>  events = modelMapper.map(entityEvents, new TypeToken<List<Event>>(){
        }.getType());
        
        return events; 
    }

    @Override
    public Event findById(Long id) {
        EntityEvent entityEvent = repositorio.findById(id).orElse(null);
        Event event =  modelMapper.map(entityEvent, new TypeToken<Event>(){
        }.getType());
        
        return event; 
    }

    @Override
    public Event createEvent(Event e) {
        
        EntityEvent entityEvent =  modelMapper.map(e, new TypeToken<EntityEvent>(){
        }.getType());
        
        EntityEvent createdEntityEvent = repositorio.save(entityEvent); 
        
        Event createdEvent = modelMapper.map(createdEntityEvent, new TypeToken<Event>(){
        }.getType());
        
        return createdEvent; 
    }
    
}
