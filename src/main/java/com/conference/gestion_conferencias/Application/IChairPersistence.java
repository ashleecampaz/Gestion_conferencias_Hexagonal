/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.Chair;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public interface IChairPersistence {
    List<String> findAllEmails(); 
    List<Chair> findAll();
    Chair findById(Long id);
    Chair createChair(Chair c);
}
