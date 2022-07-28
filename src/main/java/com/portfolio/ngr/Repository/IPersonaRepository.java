
package com.portfolio.ngr.Repository;

import com.portfolio.ngr.Entity.Persona;
import com.portfolio.ngr.Service.ImpPersonaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

    public void save(ImpPersonaService aThis);
    
}
