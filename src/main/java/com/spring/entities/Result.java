package com.spring.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Result {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "InjectionResultId")
    private String injectionResultId;
    @Basic
    @Column(name = "CustomerId")
    private String customerId;
    @Basic
    @Column(name = "InjectionDate")
    private Date injectionDate;
    @Basic
    @Column(name = "InjectionPlace")
    private String injectionPlace;
    @Basic
    @Column(name = "NextInjectionDate")
    private Date nextInjectionDate;
    @Basic
    @Column(name = "NumberOfInjection")
    private String numberOfInjection;
    @Basic
    @Column(name = "Prevention")
    private String prevention;
    @Basic
    @Column(name = "VaccineId")
    private String vaccineId;

    public String getInjectionResultId() {
        return injectionResultId;
    }

    public void setInjectionResultId(String injectionResultId) {
        this.injectionResultId = injectionResultId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getInjectionDate() {
        return injectionDate;
    }

    public void setInjectionDate(Date injectionDate) {
        this.injectionDate = injectionDate;
    }

    public String getInjectionPlace() {
        return injectionPlace;
    }

    public void setInjectionPlace(String injectionPlace) {
        this.injectionPlace = injectionPlace;
    }

    public Date getNextInjectionDate() {
        return nextInjectionDate;
    }

    public void setNextInjectionDate(Date nextInjectionDate) {
        this.nextInjectionDate = nextInjectionDate;
    }

    public String getNumberOfInjection() {
        return numberOfInjection;
    }

    public void setNumberOfInjection(String numberOfInjection) {
        this.numberOfInjection = numberOfInjection;
    }

    public String getPrevention() {
        return prevention;
    }

    public void setPrevention(String prevention) {
        this.prevention = prevention;
    }

    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;

        if (injectionResultId != null ? !injectionResultId.equals(result.injectionResultId) : result.injectionResultId != null)
            return false;
        if (customerId != null ? !customerId.equals(result.customerId) : result.customerId != null) return false;
        if (injectionDate != null ? !injectionDate.equals(result.injectionDate) : result.injectionDate != null)
            return false;
        if (injectionPlace != null ? !injectionPlace.equals(result.injectionPlace) : result.injectionPlace != null)
            return false;
        if (nextInjectionDate != null ? !nextInjectionDate.equals(result.nextInjectionDate) : result.nextInjectionDate != null)
            return false;
        if (numberOfInjection != null ? !numberOfInjection.equals(result.numberOfInjection) : result.numberOfInjection != null)
            return false;
        if (prevention != null ? !prevention.equals(result.prevention) : result.prevention != null) return false;
        if (vaccineId != null ? !vaccineId.equals(result.vaccineId) : result.vaccineId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = injectionResultId != null ? injectionResultId.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (injectionDate != null ? injectionDate.hashCode() : 0);
        result = 31 * result + (injectionPlace != null ? injectionPlace.hashCode() : 0);
        result = 31 * result + (nextInjectionDate != null ? nextInjectionDate.hashCode() : 0);
        result = 31 * result + (numberOfInjection != null ? numberOfInjection.hashCode() : 0);
        result = 31 * result + (prevention != null ? prevention.hashCode() : 0);
        result = 31 * result + (vaccineId != null ? vaccineId.hashCode() : 0);
        return result;
    }
}
