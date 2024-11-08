/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.Event;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de entrada para registrar eventos
 */
public interface IEventRegister {
    Event createEvent(Event e);
    
}