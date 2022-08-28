package com.portfolio.miportfolio.controller;

import com.portfolio.miportfolio.iUsuarioService.IHeaderService;
import com.portfolio.miportfolio.model.Header;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin(origins = "http//localhost:4200")
public class HeaderController {

    @Autowired
    private IHeaderService interHeader;

    @GetMapping("/Header/traer")
    public List<Header> getHeaders() {
        return interHeader.getHeader();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/Header/crear")
    public String createHeader(@RequestBody Header header) {
        interHeader.saveHeader(header);
        return "Los datos se crearon correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/Header/borrar/{id}")
    public String deleteHeader(@PathVariable Long id) {

        interHeader.deleteHeader(id);
        return "El dato del header fue eliminado correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("Header/editar/{id}")

    public Header editHeader(@PathVariable Long id,
            @RequestParam("linkedin") String nuevoLinkedin,
            @RequestParam("gitbhub") String nuevoGithub) {
        
        Header header = interHeader.findHeader(id);

        header.setLinkedin(nuevoLinkedin);
        header.setGithub(nuevoGithub);
        
        interHeader.saveHeader(header);
        return header;
    }

}
