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
     @NotBlank
    private String urlP;
      @NotBlank
    private String empresaP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String fechaP, String urlP, String empresaP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.urlP = urlP;
        this.empresaP = empresaP;
    }

    public String getUrlP() {
        return urlP;
    }

    public void setUrlP(String urlP) {
        this.urlP = urlP;
    }

    public String getEmpresaP() {
        return empresaP;
    }

    public void setEmpresaP(String empresaP) {
        this.empresaP = empresaP;
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
