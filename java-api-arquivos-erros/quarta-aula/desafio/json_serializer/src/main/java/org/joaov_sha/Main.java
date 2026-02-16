package org.joaov_sha;

import org.joaov_sha.model.Titulo;
import org.joaov_sha.model.Veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Titulo t = new Titulo("Matrix", "1999-05-21");
        Veiculo v = new Veiculo("Viper SRT 10", "Dodge", "2011");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(t));
        System.out.println(gson.toJson(v));
    }
}