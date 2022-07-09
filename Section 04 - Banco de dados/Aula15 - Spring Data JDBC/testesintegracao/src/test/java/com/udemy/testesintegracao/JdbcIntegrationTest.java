package com.udemy.testesintegracao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
public class JdbcIntegrationTest {

//    @Autowired
//    private ProductRepository productRepository;

    @AfterEach
    public void cleanUp() {
//        productRepository.deleteAll();
    }

    @Test
    @Sql(statements = "insert into product (id, name, price) values(1, 'Mouse', 15)")
    public void findByNameIgnoreCaseReturnProduct() {
//        Product product = productRepository.findByNameIgnoreCase();
//        Assertions.assertThat(product.getName()).isEqualTo("Mouse");
//        Assertions.assertThat(product.getPrice()).isEqualTo(15);
    }

    @Test
    @Sql(statements = "insert into product (id, name, price) values(1, 'Scanner', 40)")
    @Sql(statements = "insert into product (id, name, price) values(2, 'Mouse', 15)")
    public void returnProductSortByPriceAcendent() {
//        List<Product> products = productRepository.findAllOrderedByPriceAsc();
//        Assertions.assertThat(products).extracting(Product::getName).containsExactly("Mouse", "Scanner");
    }
}
