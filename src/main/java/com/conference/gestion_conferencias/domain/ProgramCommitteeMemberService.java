/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.domain;

import com.conference.gestion_conferencias.Application.IProgramCommitteMemberRegister;
import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberPersistence;
import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberQuery;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class ProgramCommitteeMemberService implements IProgramCommitteeMemberQuery,IProgramCommitteMemberRegister {
    
    IProgramCommitteeMemberPersistence persistence; 
    

    @Override
    public List<ProgramCommitteeMember> findAll() {
        return persistence.findAll();
    }

    @Override
    public ProgramCommitteeMember findById(Long id) {
        return persistence.findById(id);
    }

    @Override
    public ProgramCommitteeMember createProgramCommitteeMember(ProgramCommitteeMember pcm) {
        return persistence.createProgramCommitteeMember(pcm); 
    }
    
}
