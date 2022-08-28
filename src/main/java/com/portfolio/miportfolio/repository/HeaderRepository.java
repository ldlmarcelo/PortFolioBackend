
package com.portfolio.miportfolio.repository;

import com.portfolio.miportfolio.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Long>{
    
}
