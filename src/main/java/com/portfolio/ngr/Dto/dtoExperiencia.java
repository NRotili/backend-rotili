
package com.portfolio.ngr.Dto;


import java.util.Date;
import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private Date inicioE;
    private Date finE;


    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, Date inicioE, Date finE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE = inicioE;
        this.finE = finE;   
    }

    public Date getInicioE() {
        return inicioE;
    }

    public void setInicioE(Date inicioE) {
        this.inicioE = inicioE;
    }

    public Date getFinE() {
        return finE;
    }

    public void setFinE(Date finE) {
        this.finE = finE;
    }

    

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
}