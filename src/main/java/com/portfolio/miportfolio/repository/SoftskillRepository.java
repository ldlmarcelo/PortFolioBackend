package com.portfolio.miportfolio.repository;

import com.portfolio.miportfolio.model.Softskill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftskillRepository extends JpaRepository<Softskill, Long> {

}
