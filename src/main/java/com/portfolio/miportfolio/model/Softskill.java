
package com.portfolio.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Softskill {
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Long id;
    private String habilidad;
    private int porcentaje;
}
