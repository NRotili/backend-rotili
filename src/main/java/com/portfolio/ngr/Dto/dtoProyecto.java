/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ngr.Dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author NRotili
 */
public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String fechaP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String fechaP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }
    
    
}
