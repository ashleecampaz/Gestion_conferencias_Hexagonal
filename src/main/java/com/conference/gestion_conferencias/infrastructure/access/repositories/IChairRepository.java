/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.access.repositories;

import com.conference.gestion_conferencias.infrastructure.access.EntityChair;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ashlee Campaz
 */
@Repository
public interface IChairRepository extends CrudRepository<EntityChair, Long>{
    
}
