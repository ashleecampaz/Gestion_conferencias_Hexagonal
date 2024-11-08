/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.Chair;
import com.conference.gestion_conferencias.domain.Event;
import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de salida para mostrar informacion de eventos
 */
public interface IEventQuery {
    List<Event> findAll();
    Event findById(Long id); 
    Chair getChair(Long id);
    List<ProgramCommitteeMember> getCommitteeMembers(Long id); 
}
