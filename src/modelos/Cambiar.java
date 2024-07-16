package modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cambiar {
    public Data cambio(String baseCurrency, String quoteCurrency, double amount) {
        String url = "https://v6.exchangerate-api.com/v6/7e95e36516d214f6bff687ec/pair/"+
                baseCurrency+"/"+quoteCurrency+"/"+amount;
        //System.out.println("url es "+ url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
            //System.out.println("response "+ response.body());
            return  new Gson().fromJson(response.body(), Data.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
