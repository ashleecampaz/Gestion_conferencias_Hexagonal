/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.Chair;
import com.conference.gestion_conferencias.domain.Event;
import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de entrada para crear un chair
 */
public interface IChairRegister {
    
    Chair createChair(Chair c);
    
}
