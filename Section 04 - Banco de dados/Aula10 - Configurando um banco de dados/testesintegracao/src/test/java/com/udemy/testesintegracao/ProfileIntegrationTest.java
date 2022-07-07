package com.udemy.testesintegracao;

import com.udemy.testesintegracao.config.EnvironmentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ProfileIntegrationTest {

    @Autowired
    private EnvironmentConfig environmentConfig;

    @Test
    void teste() {
        environmentConfig.someMethod();
    }
}
