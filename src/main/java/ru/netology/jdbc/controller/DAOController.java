package ru.netology.jdbc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.service.DAOService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DAOController {

    private final DAOService service;

    @GetMapping("/products/fetch-product")
    public List<String> getProduct(@RequestParam("name") String name) {
        return service.getProducts(name);
    }
}
