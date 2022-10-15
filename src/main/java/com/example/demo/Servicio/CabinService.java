/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Repositorio.CabinRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Modelo.Cabin;
/**
 *
 * @author USUARIO
 */

@Service

public class CabinService {
      @Autowired
    private CabinRepository cabinRepository;
    
    public List<Cabin> getAll(){
        return cabinRepository.getAll();
    }
    
    public Optional<Cabin> getCabin(int id){
        return cabinRepository.getCabin(id);
    }
    
    public Cabin save (Cabin cabin){
        if (cabin.getId() == null){
            return cabinRepository.save(cabin);
        } else {
            Optional<Cabin> cabin1 = cabinRepository.getCabin(cabin.getId());
            if(cabin1.isEmpty()){
                return cabinRepository.save(cabin);
            } else {
                return cabin;
            }
        }
    }
}
