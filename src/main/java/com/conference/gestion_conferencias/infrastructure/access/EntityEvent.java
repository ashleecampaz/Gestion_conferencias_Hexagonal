/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.infrastructure.access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
@Entity
@Table (name = "Event")
public class EntityEvent implements Serializable{
    private String name;
    private Long chair_id;
    private List<Long> programCommitte;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
