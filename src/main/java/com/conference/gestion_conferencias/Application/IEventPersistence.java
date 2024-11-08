/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.Event;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public interface IEventPersistence {
    List<Event> findAll();
    Event findById(Long id);
    Event createEvent(Event e);
}
