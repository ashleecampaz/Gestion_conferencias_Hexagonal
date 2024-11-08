/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.domain;

import com.conference.gestion_conferencias.Application.IChairPersistence;
import com.conference.gestion_conferencias.Application.IChairQuery;
import com.conference.gestion_conferencias.Application.IChairRegister;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class ChairService implements IChairRegister, IChairQuery {
    
    //puerto de salida que se ocupa de la persistencia 
    private final IChairPersistence chairPersistence; 

    public ChairService(IChairPersistence chairPersistence) {
        this.chairPersistence = chairPersistence;
    }
   
    
    private boolean IsEmailRegistered(String email){
      List<String> emails = chairPersistence.findAllEmails();
      for(String e:emails){
          if(e.equals(email)){
              return true; 
          }
      }
      return false; 
    }

    @Override
    public Chair createChair(Chair c) {
         if(!IsEmailRegistered(c.getEmail())){
            Chair chair = chairPersistence.createChair(c); 
            return chair; 
        }
        return null; 
    }

    @Override
    public List<Chair> findAll() {
        return chairPersistence.findAll();
    }

    @Override
    public Chair findById(Long id) {
       return chairPersistence.findById(id); 
    }
}
