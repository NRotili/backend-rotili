package com.portfolio.ngr.Repository;

import com.portfolio.ngr.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSkill extends JpaRepository<Skill, Integer>{
    public Optional<Skill> findByTituloS(String tituloS);
    public boolean existsByTituloS(String tituloS);
}
