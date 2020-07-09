package com.example.salutationservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SalutationConfiguration.class)
public class SalutationConfigurationTest {

    @Autowired
    private SalutationService salutationService;

    @Test
    public void testConfiguredCorrectly() {
        assertThat(salutationService).isNotNull();
        assertThat(salutationService.prefixSalutationToCandidate(SalutationType.SIR,"Brian Blessed"))
                  .isEqualTo("Sir Brian Blessed");
    }
}
