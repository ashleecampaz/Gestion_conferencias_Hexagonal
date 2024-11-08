/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.domain;

import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class ProgramCommitteeMember {
    private String name;
    
    private String lastName;
    
    private String email;
    
    private List<String> researchField;
    
    private Long researcher_id; 

    public ProgramCommitteeMember(String name, String lastName, String email, List<String> researchField) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.researchField = researchField;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getResearchField() {
        return researchField;
    }

    public void setResearchField(List<String> researchField) {
        this.researchField = researchField;
    }

    public Long getResearcher_id() {
        return researcher_id;
    }

    public void setResearcher_id(Long researcher_id) {
        this.researcher_id = researcher_id;
    }
    
    
    
}
