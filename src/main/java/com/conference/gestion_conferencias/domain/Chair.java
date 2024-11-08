/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class Chair {
    private String name;
    private String lastName;
    private String email;
    private Long id;

    public Chair(String name, String lastName, String email) {
       this.name = name;
       this.lastName = lastName;
       this.email = email;
   }
   
   public Chair(){
   }
    
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

    @Override
    public String toString() {
        return "Chair{" + "name=" + name + ", lastName=" + lastName + ", email=" + email + ", id=" + id + '}';
    }
    
    
}
