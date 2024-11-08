/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.gestion_conferencias.Application;

import com.conference.gestion_conferencias.domain.Chair;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 * @brief puerto de entrada para mostrar informacion del chair
 */
public interface IChairQuery {
    List<Chair> findAll();
    Chair findById(Long id);   
}
