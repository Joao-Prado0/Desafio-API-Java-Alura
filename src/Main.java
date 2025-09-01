
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        EntradaUsuario entradaUsuario = new EntradaUsuario();
        BuscaCEP buscaCEP = new BuscaCEP();

        while (true){
            String busca = entradaUsuario.lerEntradaUsuaro(scanner);

            if(busca.equalsIgnoreCase("0")){
                System.out.println("Enncerrando...");
                break;
            }

            String url = "https://viacep.com.br/ws/"  + busca + "/json/";
            try {
                String json = buscaCEP.buscarEndereco(url);
                CEP cep = gson.fromJson(json,CEP.class);
                GeradorArquivoJson gerador = new GeradorArquivoJson();
                gerador.gerarArquivoJson(json,gson);

                System.out.println(json);
                System.out.println(cep);
            }catch (RuntimeException e){
                System.err.println("Erro ao buscar CEP ou salvat o arquivo" + e.getMessage());
            }

        }
    }
}