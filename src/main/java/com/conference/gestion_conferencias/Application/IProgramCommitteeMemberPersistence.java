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
 */
public interface IProgramCommitteeMemberPersistence {
    List<String> findAllEmails(); 
    List<ProgramCommitteeMember> findAll();
    ProgramCommitteeMember findById(Long id);
    ProgramCommitteeMember createProgramCommitteeMember(ProgramCommitteeMember pcm);
}
