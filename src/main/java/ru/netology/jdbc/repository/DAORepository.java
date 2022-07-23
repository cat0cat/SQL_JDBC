package ru.netology.jdbc.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DAORepository {

    private final NamedParameterJdbcTemplate template;
    private final String FILE_NAME = "script.sql";
    private final String scriptName;

    public DAORepository(NamedParameterJdbcTemplate template) {
        this.template = template;
        this.scriptName = read(FILE_NAME);
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductsName (String name) {
        List <String> res = template.queryForList(scriptName, Map.of("name",name), String.class);
        System.out.println(res);
        return res;
    }

}
