package com.portfolio.miportfolio.iUsuarioService;

import com.portfolio.miportfolio.model.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersona();

    public void savePersona(Persona user);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);
}
