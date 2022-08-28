package com.portfolio.miportfolio.service;

import com.portfolio.miportfolio.iUsuarioService.IHeaderService;
import com.portfolio.miportfolio.model.Header;
import com.portfolio.miportfolio.repository.HeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService {

    @Autowired
    private HeaderRepository headerRepository;

    @Override
    public List<Header> getHeader() {
        List<Header> listHeader = headerRepository.findAll();
        return listHeader;
    }

    @Override
    public void saveHeader(Header header) {
        headerRepository.save(header);
    }

    @Override
    public void deleteHeader(Long id) {
        headerRepository.deleteById(id);
    }

    @Override
    public Header findHeader(Long id) {
        Header header = headerRepository.findById(id).orElse(null);
        return header;
    }

}
