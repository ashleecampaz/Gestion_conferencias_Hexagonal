/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.access;

import com.conference.gestion_conferencias.Application.IChairPersistence;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IChairRepository;
import com.conference.gestion_conferencias.domain.Chair;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 * @author Ashlee Campaz
 */

public class ChairRepository implements IChairPersistence {
    
    
    private final IChairRepository repository; 
    
    private final ModelMapper modelMapper;

    public ChairRepository(IChairRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
    
    
    @Override
    public List<String> findAllEmails() {
        List<EntityChair>  Entitychairs = (List<EntityChair>) repository.findAll(); 
        List<String> emails = new ArrayList();
        
        for(EntityChair e:Entitychairs){
            emails.add(e.getEmail());
        }
        return emails; 
    }

    @Override
    public List<Chair> findAll() {
        List<EntityChair>  Entitychairs = (List<EntityChair>) repository.findAll(); 
        List<Chair> chairs= modelMapper.map(Entitychairs, new TypeToken<List<Chair>>(){
        }.getType());
        return chairs; 
    }

    @Override
    public Chair findById(Long id) {
        EntityChair entitychair = repository.findById(id).orElse(null);
        Chair chair = modelMapper.map(entitychair, new TypeToken<Chair>(){
        }.getType());
        return chair; 
    }

    @Override
    @Transactional
    public Chair createChair(Chair c) {
        EntityChair chair = modelMapper.map(c, new TypeToken<EntityChair>(){
        }.getType());
        EntityChair entitychair = repository.save(chair); 
        Chair createdChair = modelMapper.map(entitychair, new TypeToken<Chair>(){
        }.getType()); 
        return createdChair;  
    }
    
}
