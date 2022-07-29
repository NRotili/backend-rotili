/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ngr.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkill {
    
    @NotBlank
    private String tituloS;
    @NotBlank
    private int porcentajeS;
    
    public dtoSkill() {
    }

    public dtoSkill(String tituloS, int porcentajeS) {
        this.tituloS = tituloS;
        this.porcentajeS = porcentajeS;
    }

    public String getTituloS() {
        return tituloS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }
    
}
