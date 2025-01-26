package com.BuscarApi.demo.conversorMoeda;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorMoedaController {


    @Autowired
    private ConversorMoeda conversorMoeda;

    @GetMapping("/conversor")
    public ConversorResultado converterMoeda(@RequestParam String moedaOrigem, @RequestParam String moedaDestino, @RequestParam double valor) {
        return conversorMoeda.converterMoeda(moedaOrigem, moedaDestino, valor);
    }
}
