package com.vivek.pojo;

import java.math.BigDecimal;

public class RateModel {

    private final String locationID;
    private final String rateClass;
    private final String currency;
    private final String tpType;
    private final String valueType;
    private final String termType;
    private final String term;
    private final String other;
    private final BigDecimal rate;
    private final Long calculationId;

    private final BigDecimal attribute_1;
    private final BigDecimal attribute_2;
    private final BigDecimal attribute_3;
    private final BigDecimal attribute_4;
    private final BigDecimal attribute_5;
    private final BigDecimal factor_1;
    private final BigDecimal factor_2;
    private final BigDecimal factor_3;
    private final BigDecimal factor_4;


    public RateModel(String locationID, String rateClass,
                     String currency, String tpType, String valueType,
                     String termType, String term, String other,
                     BigDecimal rate, Long calculationId,
                     BigDecimal attribute_1, BigDecimal attribute_2,
                     BigDecimal attribute_3, BigDecimal attribute_4,
                     BigDecimal attribute_5, BigDecimal factor_1,
                     BigDecimal factor_2, BigDecimal factor_3,
                     BigDecimal factor_4) {
        this.locationID = locationID;
        this.rateClass = rateClass;
        this.currency = currency;
        this.tpType = tpType;
        this.valueType = valueType;
        this.termType = termType;
        this.term = term;
        this.other = other;
        this.rate = rate;
        this.calculationId = calculationId;
        this.attribute_1 = attribute_1;
        this.attribute_2 = attribute_2;
        this.attribute_3 = attribute_3;
        this.attribute_4 = attribute_4;
        this.attribute_5 = attribute_5;
        this.factor_1 = factor_1;
        this.factor_2 = factor_2;
        this.factor_3 = factor_3;
        this.factor_4 = factor_4;
    }

    public String getLocationID() {
        return locationID;
    }

    public String getRateClass() {
        return rateClass;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTpType() {
        return tpType;
    }

    public String getValueType() {
        return valueType;
    }

    public String getTermType() {
        return termType;
    }

    public String getTerm() {
        return term;
    }

    public String getOther() {
        return other;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public Long getCalculationId() {
        return calculationId;
    }

    public BigDecimal getAttribute_1() {
        return attribute_1;
    }

    public BigDecimal getAttribute_2() {
        return attribute_2;
    }

    public BigDecimal getAttribute_3() {
        return attribute_3;
    }

    public BigDecimal getAttribute_4() {
        return attribute_4;
    }

    public BigDecimal getAttribute_5() {
        return attribute_5;
    }

    public BigDecimal getFactor_1() {
        return factor_1;
    }

    public BigDecimal getFactor_2() {
        return factor_2;
    }

    public BigDecimal getFactor_3() {
        return factor_3;
    }

    public BigDecimal getFactor_4() {
        return factor_4;
    }
}
