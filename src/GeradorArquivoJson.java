import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivoJson {
    public void gerarArquivoJson(String json, Gson gson){
        try {
            FileWriter fileWriter = new FileWriter("CEP.json");
            fileWriter.write(gson.toJson(json));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Problema ao escrever no arquivo");
        }

    }
}
