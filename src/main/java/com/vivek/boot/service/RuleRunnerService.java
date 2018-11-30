package com.vivek.boot.service;

import com.vivek.pojo.RateModel;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class RuleRunnerService {


    private KieContainer kieContainer;

    @Autowired
    public RuleRunnerService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    /**
     * @should calculate Rates
     * @param rateModel
     * @return
     */
    public BigDecimal calculateRate(RateModel rateModel) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("rateModel", rateModel);
        kieSession.insert(rateModel);
        kieSession.fireAllRules();
        kieSession.dispose();
        return rateModel.getRate();
    }
}
