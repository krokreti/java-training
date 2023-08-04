package com.example.practicingapi.resource;

import com.example.practicingapi.models.Boleto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class BoletoResource {

@GetMapping(value = "/boleto")
    private Object getBoleto() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders defaultHeaders = new HttpHeaders();
        defaultHeaders.set("Authorization", "Bearer 1301865f-c6bc-38f3-9f49-666dbcfc59c3");
        defaultHeaders.set("client_id", "9b5e603e428cc477a2841e2683c92d21");
        defaultHeaders.set("Content-Type", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(defaultHeaders);
        String uri = "https://sandbox.sicoob.com.br/sicoob/sandbox/cobranca-bancaria/v2/boletos?numeroContrato=25546454&modalidade=1";
        ResponseEntity<Object> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                Object.class
                );
        Object data = response.getBody();
        return data;
    }

}
