/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;

import java.util.List;



/**
 *
 * @author johan
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById(long id);
    public void savePersona (Persona persona);
    public void delete (long id);
    List<Persona> findByApellido1(String apellido1);   
    public Persona findByNombre(String username); 
}
