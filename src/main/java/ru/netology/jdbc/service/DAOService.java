package ru.netology.jdbc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.jdbc.repository.DAORepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DAOService {

    private final DAORepository repository;

    public List<String> getProducts(String name) {
        return repository.getProductsName(name);
    }
}
