package conversorMoeda;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ConversorMoeda {


    private static final String API_URL = "https://api.exchangeratesapi.io/latest?base=";
    


    public double converterMoeda(String moedaOrigem, String moedaDestino, double valor) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(API_URL + moedaOrigem).toUriString();

        ExchangeRateResponse exchangeRateResponse = restTemplate.getForObject(url, ExchangeRateResponse.class);
        if (exchangeRateResponse != null && exchangeRateResponse.getRater().containsKey(moedaDestino)) {
            return valor * exchangeRateResponse.getRater().get(moedaDestino);
        }
        throw new IllegalArgumentException("Invalid currency code");
    }

}
