package com.portfolio.ngr.Interface;

import com.portfolio.ngr.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer personas
    public List<Persona> getPersona();
    
    //Guardar persona
    public void savePersona(Persona persona);
    
    //Eliminar persona por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
    
}
