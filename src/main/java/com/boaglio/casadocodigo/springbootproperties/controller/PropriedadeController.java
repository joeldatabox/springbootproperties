package com.boaglio.casadocodigo.springbootproperties.controller;

import com.boaglio.casadocodigo.springbootproperties.model.Propriedade;
import com.boaglio.casadocodigo.springbootproperties.repository.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Joel Rodrigues Moreira on 21/12/17.
 * @project springbootproperties
 */
@RestController
@RequestMapping("/api")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository repository;

    @RequestMapping(value = "/find/{filtro}", method = RequestMethod.GET)
    List<Propriedade> findByFiltro(@PathVariable("filtro") String filtro) {
        return repository.findByFiltro(filtro);
    }

}