package org.joaov_sha;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.joaov_sha.model.PessoaRecord;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        Path path = Path.of("src/main/resources/Pessoa.json");

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            PessoaRecord p = gson.fromJson(reader, PessoaRecord.class);
            System.out.println(p.toString());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}