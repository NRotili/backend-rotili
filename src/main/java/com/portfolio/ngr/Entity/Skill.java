/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ngr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author NRotili
 */
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloS;
    private int porcentajeS;

    public Skill() {
    }

    public Skill(String tituloS, int porcentajeS) {
        this.tituloS = tituloS;
        this.porcentajeS = porcentajeS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloS() {
        return tituloS;
    }

    public void setTituloS(String tituloS) {
        this.tituloS = tituloS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(int porcentajeS) {
        this.porcentajeS = porcentajeS;
    }
}
