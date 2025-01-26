package com.BuscarApi.demo.conversorMoeda;

import lombok.Data;

@Data
public class ConversorResultado {

    private Double valorConvertido;
    private Double varBid;
    private String moedaOrigem;
    private String moedaDestino;
    private String nome;
    private Double high;
    private Double low;
    private Double pctChange;
    private Double bid;
    private Double ask;
    private Integer timestamp;
    private String createDate;
}
