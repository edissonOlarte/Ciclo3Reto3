/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.CabinInterface;
import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Cabin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author USUARIO
 */

@Repository

public class CabinRepository {
     @Autowired
    private CabinInterface extencionesCrud;
    
    public List<Cabin> getAll(){
        return (List<Cabin>) extencionesCrud.findAll();
    }
    
    public Optional<Cabin> getCabin(int id){
        return extencionesCrud.findById(id);
    }
    
    public Cabin save(Cabin cabin){
        return extencionesCrud.save(cabin);
    }
}
