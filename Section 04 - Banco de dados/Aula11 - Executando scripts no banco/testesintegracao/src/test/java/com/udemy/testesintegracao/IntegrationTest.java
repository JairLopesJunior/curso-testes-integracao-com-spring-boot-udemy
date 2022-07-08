package com.udemy.testesintegracao;

import com.udemy.testesintegracao.service.TextService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class IntegrationTest {

    @Autowired
    private TextService textService;

    @Test
    void test() {
        textService.someMethod();
    }
}
