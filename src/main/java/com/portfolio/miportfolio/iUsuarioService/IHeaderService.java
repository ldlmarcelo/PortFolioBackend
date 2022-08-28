
package com.portfolio.miportfolio.iUsuarioService;

import com.portfolio.miportfolio.model.Header;
import java.util.List;


public interface IHeaderService {
    
    public List<Header> getHeader();
    public void saveHeader(Header header);
    public void deleteHeader (Long id);
    public  Header findHeader (Long id); 
}
