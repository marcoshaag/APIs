package com.BuscarApi.demo.conversorMoeda;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ConversorMoeda {



    private static final String API_URL = "https://economia.awesomeapi.com.br/json/last/";

    public ConversorResultado converterMoeda(String moedaOrigem, String moedaDestino, Double valor) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(API_URL + moedaOrigem + "-" + moedaDestino).toUriString();

        ExchangeRateResponse exchangeRateResponse = restTemplate.getForObject(url, ExchangeRateResponse.class);
        if (exchangeRateResponse != null && exchangeRateResponse.getCurrencyData().containsKey(moedaOrigem + moedaDestino)) {
            ExchangeRateResponse.CurrencyData data = exchangeRateResponse.getCurrencyData().get(moedaOrigem + moedaDestino);
            ConversorResultado result = new ConversorResultado();
            result.setValorConvertido(valor * data.getBid());
            result.setVarBid(data.getVarBid());
            result.setMoedaOrigem(data.getCode());
            result.setMoedaDestino(data.getCodein());
            result.setNome(data.getName());
            result.setHigh(data.getHigh());
            result.setLow(data.getLow());
            result.setPctChange(data.getPctChange());
            result.setBid(data.getBid());
            result.setAsk(data.getAsk());
            result.setCreateDate(data.getCreateDate());
            return result;
        }
        throw new IllegalArgumentException("Moeda Inválida ou não encontrada");
    }

}
