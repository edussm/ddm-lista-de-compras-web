package br.fpu.lista.de.compras.service;

import java.util.List;

import net.sf.jasperreports.engine.JRException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fpu.lista.de.compras.model.Produto;

@RestController
@RequestMapping("/ajax/report")
public class AjaxController {
    @Autowired
    private ApiService apiService;

//    @Secured({ "ROLE_demo" })
//    @RequestMapping(method = RequestMethod.POST)
//    public List<Produto> generateReport(@RequestBody List<Produto> cities) throws JRException {
//	apiService.generateReport(cities);
//	return cities;
//    }

}
