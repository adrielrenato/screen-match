package br.com.alura.screenmatch.api;

import br.com.alura.screenmatch.api.desafio2.Pessoa;
import com.google.gson.Gson;

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
