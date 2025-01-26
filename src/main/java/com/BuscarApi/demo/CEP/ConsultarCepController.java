package com.BuscarApi.demo.CEP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class ConsultarCepController {

    @Autowired
    private ConsultaCep consultaCep;

    @PostMapping("/buscar")
    public Endereco buscarEndereco(@RequestParam String cep) {
        return consultaCep.buscarEndereco(cep);
    }
}
