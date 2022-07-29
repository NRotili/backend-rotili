
package com.portfolio.ngr.Repository;

import com.portfolio.ngr.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

    
}
