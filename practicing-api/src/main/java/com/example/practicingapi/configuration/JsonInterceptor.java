//package com.example.practicingapi.configuration;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.client.ClientHttpRequestExecution;
//import org.springframework.http.client.ClientHttpRequestInterceptor;
//import org.springframework.http.client.ClientHttpResponse;
//
//import java.io.IOException;
//
//public class JsonInterceptor implements ClientHttpRequestInterceptor {
//    @Override
//    public ClientHttpResponse intercept(HttpRequest request, byte[] body,
//                                        ClientHttpRequestExecution execution) throws IOException {
//
//        HttpHeaders defaultHeaders = new HttpHeaders();
//        defaultHeaders.set("Authorization", "Bearer 1301865f-c6bc-38f3-9f49-666dbcfc59c3");
//        defaultHeaders.set("client_id", "9b5e603e428cc477a2841e2683c92d21");
//        defaultHeaders.set("Content-Type", "application/json");
//
//        return execution.execute(request, body);
//    }
//}
