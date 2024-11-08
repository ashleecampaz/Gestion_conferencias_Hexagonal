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
public class Event {
    private String name;
    private Long chair_id;
    private List<Long> programCommitte;
    private Long id;

    public Event(String name, Long chair_id, List<Long> programCommitte) {
        this.name = name;
        this.chair_id = chair_id;
        this.programCommitte = programCommitte;
    }
    
    public Event(){}
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getChair_id() {
        return chair_id;
    }

    public void setChair_id(Long chair_id) {
        this.chair_id = chair_id;
    }

    public List<Long> getProgramCommitte() {
        return programCommitte;
    }

    public void setProgramCommitte(List<Long> programCommitte) {
        this.programCommitte = programCommitte;
    }
    
    
}
