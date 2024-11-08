/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.infrastructure.access.EntityChair;
import com.conference.gestion_conferencias.infrastructure.access.EntityEvent;
import com.conference.gestion_conferencias.infrastructure.access.EntityProgramCommitteMember;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de entrada y salida para la gestion de solicitudes API REST
 */
public interface IConferenceRest {
    
    public EntityChair createChair(EntityChair ec);
    public EntityEvent createEvent(EntityEvent e);
    public EntityProgramCommitteMember createPogramCommitteMember (EntityProgramCommitteMember pcm);
    public List<EntityProgramCommitteMember> getProgramCommitMembers(Long eventId);
    public List<EntityChair> getChairs(Long eventId);
    public List<EntityEvent> getEvents(); 
}
