/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author johan
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{

    public List<Persona> findByApellido1(String apellido1);

    Persona findByNombre(String nombre);
}
