package br.com.alura.screenmatch.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Titulo {
    // Defina a classe do objeto Titulo aqui

    public static void main(String[] args) {
        Titulo titulo = new Titulo();

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        System.out.println(json);

        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String jsonPretty = gsonPretty.toJson(titulo);

        System.out.println(jsonPretty);
    }
}
