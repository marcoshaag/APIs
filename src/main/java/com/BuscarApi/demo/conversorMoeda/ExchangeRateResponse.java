package com.BuscarApi.demo.conversorMoeda;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ExchangeRateResponse {

    private Map<String, CurrencyData> currencyData = new HashMap<>();

    @JsonAnySetter
    public void setCurrencyData(String key, CurrencyData value) {
        this.currencyData.put(key, value);
    }

    @Data
    public static class CurrencyData {
        private Double varBid;
        private String code;
        private String codein;
        private String name;
        private Double high;
        private Double low;
        private Double pctChange;
        private Double bid;
        private Double ask;
        private Integer timestamp;
        private String createDate;
    }


}