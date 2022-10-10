package com.nouks.dynamicannotations.domain.model;

import org.hibernate.annotations.Formula;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private long grossIncome;
    private int taxInPercents;
    @Formula("grossIncome * taxInPercents / 100")
    private long tax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(long grossIncome) {
        this.grossIncome = grossIncome;
    }

    public int getTaxInPercents() {
        return taxInPercents;
    }

    public void setTaxInPercents(int taxInPercents) {
        this.taxInPercents = taxInPercents;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }
}
