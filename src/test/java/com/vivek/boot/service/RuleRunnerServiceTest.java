package com.vivek.boot.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import com.vivek.pojo.RateModel;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class RuleRunnerServiceTest {

    RuleRunnerService ruleRunnerService;
    KieContainer kieContainer;

    @Before
    public void setUp() {
        kieContainer = Mockito.mock(KieContainer.class);
        ruleRunnerService = new RuleRunnerService(kieContainer);

    }
    /**
     * @verifies calculate Rates
     * @see RuleRunnerService#calculateRate(com.vivek.pojo.RateModel)
     */
    @Test
    public void calculateRate_shouldCalculateRates() throws Exception {

        RateModel rateModel = new RateModel(null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);
        BigDecimal totalCharge = ruleRunnerService.calculateRate(rateModel);

        assertNotNull(totalCharge);
        assertEquals(BigDecimal.valueOf(70), totalCharge);
    }
}
