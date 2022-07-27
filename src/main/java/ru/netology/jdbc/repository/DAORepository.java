package ru.netology.jdbc.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor
public class DAORepository {

    private EntityManager entityManager;

    public List<String> getProductsName (String name) {
        return entityManager.createQuery("select o.productName  from Order o " +
                        " join Customer c  on c.id = o.customer.id " +
                        " where lower(c.name) = lower(:name) ")
                .setParameter("name", name)
                .getResultList();
    }

}
