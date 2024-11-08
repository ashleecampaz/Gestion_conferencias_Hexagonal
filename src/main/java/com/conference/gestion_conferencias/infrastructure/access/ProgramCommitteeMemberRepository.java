/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.access;

import com.conference.gestion_conferencias.Application.IProgramCommitteeMemberPersistence;
import com.conference.gestion_conferencias.domain.Chair;
import com.conference.gestion_conferencias.domain.ProgramCommitteeMember;
import com.conference.gestion_conferencias.infrastructure.access.repositories.IProgramCommitteMemberRepository;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 * @author Ashlee Campaz
 */
public class ProgramCommitteeMemberRepository implements IProgramCommitteeMemberPersistence {
    
    private final IProgramCommitteMemberRepository repository; 
    
    private final ModelMapper modelMapper;

    public ProgramCommitteeMemberRepository(IProgramCommitteMemberRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
     
     
    
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
       List<EntityProgramCommitteMember>  EntityMembers = (List<EntityProgramCommitteMember>) repository.findAll(); 
       List<ProgramCommitteeMember> members = modelMapper.map(EntityMembers, new TypeToken<List<ProgramCommitteeMember>>(){
        }.getType());
       return members;
    }

    @Override
    public ProgramCommitteeMember findById(Long id) {
        EntityProgramCommitteMember entityMember = repository.findById(id).orElse(null);
        
        ProgramCommitteeMember member = modelMapper.map(entityMember, new TypeToken<ProgramCommitteeMember>(){
        }.getType());
        return member;
    }

    @Override
    public ProgramCommitteeMember createProgramCommitteeMember(ProgramCommitteeMember pcm) {
       
       EntityProgramCommitteMember entityMember= modelMapper.map(pcm, new TypeToken<EntityProgramCommitteMember>(){
        }.getType());
       
       EntityProgramCommitteMember createdEntityMember = repository.save(entityMember);
       
       ProgramCommitteeMember member = modelMapper.map(createdEntityMember, new TypeToken<ProgramCommitteeMember>(){
        }.getType());
       
       return member; 
    }
    
}
