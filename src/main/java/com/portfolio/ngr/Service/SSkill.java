/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ngr.Service;

import com.portfolio.ngr.Entity.Skill;
import com.portfolio.ngr.Repository.RSkill;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NRotili
 */
@Service
@Transactional
public class SSkill {
     @Autowired
     RSkill rSkill;
     
     public List<Skill> list(){
         return rSkill.findAll();
     }
     
     public Optional<Skill> getOne(int id){
         return rSkill.findById(id);
     }
     
     public Optional<Skill> getByTituloS(String tituloS){
         return rSkill.findByTituloS(tituloS);
     }
     
     public void save(Skill skill){
         rSkill.save(skill);
     }
     
     public void delete(int id){
         rSkill.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rSkill.existsById(id);
     }
     
     public boolean existsByTituloS(String tituloS){
         return rSkill.existsByTituloS(tituloS);
     }
}
