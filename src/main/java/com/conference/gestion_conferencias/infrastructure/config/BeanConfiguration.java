/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.config;

import com.conference.gestion_conferencias.Application.IChairPersistence;
import com.conference.gestion_conferencias.domain.ChairService;
import com.conference.gestion_conferencias.infrastructure.access.ChairRepository;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IChairRepository;
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
}
