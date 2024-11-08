/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.access;

import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberPersistence;
import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IProgramCommitteMemberRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ashlee Campaz
 */
public class ProgramCommitteeMemberRepository implements IProgramCommitteeMemberPersistence {
    
    private IProgramCommitteMemberRepository repository; 
    
    @Override
    public List<String> findAllEmails() {
        List<EntityProgramCommitteMember>  EntityMembers = (List<EntityProgramCommitteMember>) repository.findAll(); 
        List<String> emails = new ArrayList();
        
        for(EntityProgramCommitteMember e:EntityMembers){
            emails.add(e.getEmail());
        }
        return emails; 
    }

    @Override
    public List<ProgramCommitteeMember> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProgramCommitteeMember findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProgramCommitteeMember createProgramCommitteeMember(ProgramCommitteeMember pcm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
