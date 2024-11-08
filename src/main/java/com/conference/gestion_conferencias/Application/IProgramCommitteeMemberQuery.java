/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de salida para mostrar informacion de los miembros de comite del programa
 */
public interface IProgramCommitteeMemberQuery {
    List<ProgramCommitteeMember> findAll();
    ProgramCommitteeMember findById(Long id); 
}
