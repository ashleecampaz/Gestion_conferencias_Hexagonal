/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.config;

import com.conference.gestion_conferencias.Application.IChairPersistence;
import com.conference.gestion_conferencias.Application.IChairQuery;
import com.conference.gestion_conferencias.Application.IEventPersistence;
import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberPersistence;
import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberQuery;
import com.conference.gestion_conferencias.domain.ChairService;
import com.conference.gestion_conferencias.domain.EventService;
import com.conference.gestion_conferencias.domain.ProgramCommitteeMemberService;
import com.conference.gestion_conferencias.infrastructure.access.ChairRepository;
import com.conference.gestion_conferencias.infrastructure.access.EventRepository;
import com.conference.gestion_conferencias.infrastructure.access.ProgramCommitteeMemberRepository;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IChairRepository;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IEventRepository;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IProgramCommitteMemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ashlee Campaz
 */
@Configuration
public class BeanConfiguration {
    @Bean 
    public ChairService chairService (IChairPersistence chairPersistence){
        return new ChairService(chairPersistence); 
    }
    @Bean 
    public ChairRepository ChairRepository (ModelMapper mapper, IChairRepository repository){
        return new ChairRepository(repository,mapper);
    }
    
    @Bean
    public ProgramCommitteeMemberService programCommitteeMemberService (IProgramCommitteeMemberPersistence pcmPersistence){
        return new ProgramCommitteeMemberService( pcmPersistence); 
    }
    @Bean 
    public ProgramCommitteeMemberRepository programCommitteeMemberRepository (ModelMapper mapper, IProgramCommitteMemberRepository repository){
        return new ProgramCommitteeMemberRepository(repository,mapper);
    }

    @Bean
    public EventService eventService(IEventPersistence persistence, IChairQuery chairQuery, IProgramCommitteeMemberQuery commiteeMemberQuery) {
        return new EventService(persistence,chairQuery,commiteeMemberQuery); 
    }
    
    @Bean
    public EventRepository eventRepository (IEventRepository repositorio, ModelMapper modelMapper ){
        return new EventRepository(repositorio,modelMapper); 
    }
    
}
