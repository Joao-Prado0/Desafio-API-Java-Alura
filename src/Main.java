import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        EntradaUsuario entradaUsuario = new EntradaUsuario();
        while (true){

            String busca = entradaUsuario.lerEntradaUsuaro(scanner);
            if(busca.equalsIgnoreCase("0")){
                System.out.println("Enncerrando...");
                break;
            }

            String url = "https://viacep.com.br/ws/"+ busca + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            CEP cep = gson.fromJson(json,CEP.class);
            System.out.println(json);
            System.out.println(cep);
        }
    }
}