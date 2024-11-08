/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de entrada para registrar miembros del comite del programa
 */
public interface IProgramCommitteMemberRegister {
    ProgramCommitteeMember createProgramCommitteeMember(ProgramCommitteeMember pcm); 
}
