package com.spring.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Vaccine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VaccineId")
    private String vaccineId;
    @Basic
    @Column(name = "Contraindication")
    private String contraindication;
    @Basic
    @Column(name = "Indication")
    private String indication;
    @Basic
    @Column(name = "NumberOfInjection")
    private int numberOfInjection;
    @Basic
    @Column(name = "Origin")
    private String origin;
    @Basic
    @Column(name = "TimeBeginNextInjection")
    private Date timeBeginNextInjection;
    @Basic
    @Column(name = "TimeEndNextInjection")
    private Date timeEndNextInjection;
    @Basic
    @Column(name = "Usage")
    private String usage;
    @Basic
    @Column(name = "VaccineName")
    private String vaccineName;
    @Basic
    @Column(name = "VaccineType_Id")
    private String vaccineTypeId;

    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getContraindication() {
        return contraindication;
    }

    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public int getNumberOfInjection() {
        return numberOfInjection;
    }

    public void setNumberOfInjection(int numberOfInjection) {
        this.numberOfInjection = numberOfInjection;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getTimeBeginNextInjection() {
        return timeBeginNextInjection;
    }

    public void setTimeBeginNextInjection(Date timeBeginNextInjection) {
        this.timeBeginNextInjection = timeBeginNextInjection;
    }

    public Date getTimeEndNextInjection() {
        return timeEndNextInjection;
    }

    public void setTimeEndNextInjection(Date timeEndNextInjection) {
        this.timeEndNextInjection = timeEndNextInjection;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineTypeId() {
        return vaccineTypeId;
    }

    public void setVaccineTypeId(String vaccineTypeId) {
        this.vaccineTypeId = vaccineTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vaccine vaccine = (Vaccine) o;

        if (numberOfInjection != vaccine.numberOfInjection) return false;
        if (vaccineId != null ? !vaccineId.equals(vaccine.vaccineId) : vaccine.vaccineId != null) return false;
        if (contraindication != null ? !contraindication.equals(vaccine.contraindication) : vaccine.contraindication != null)
            return false;
        if (indication != null ? !indication.equals(vaccine.indication) : vaccine.indication != null) return false;
        if (origin != null ? !origin.equals(vaccine.origin) : vaccine.origin != null) return false;
        if (timeBeginNextInjection != null ? !timeBeginNextInjection.equals(vaccine.timeBeginNextInjection) : vaccine.timeBeginNextInjection != null)
            return false;
        if (timeEndNextInjection != null ? !timeEndNextInjection.equals(vaccine.timeEndNextInjection) : vaccine.timeEndNextInjection != null)
            return false;
        if (usage != null ? !usage.equals(vaccine.usage) : vaccine.usage != null) return false;
        if (vaccineName != null ? !vaccineName.equals(vaccine.vaccineName) : vaccine.vaccineName != null) return false;
        if (vaccineTypeId != null ? !vaccineTypeId.equals(vaccine.vaccineTypeId) : vaccine.vaccineTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vaccineId != null ? vaccineId.hashCode() : 0;
        result = 31 * result + (contraindication != null ? contraindication.hashCode() : 0);
        result = 31 * result + (indication != null ? indication.hashCode() : 0);
        result = 31 * result + numberOfInjection;
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        result = 31 * result + (timeBeginNextInjection != null ? timeBeginNextInjection.hashCode() : 0);
        result = 31 * result + (timeEndNextInjection != null ? timeEndNextInjection.hashCode() : 0);
        result = 31 * result + (usage != null ? usage.hashCode() : 0);
        result = 31 * result + (vaccineName != null ? vaccineName.hashCode() : 0);
        result = 31 * result + (vaccineTypeId != null ? vaccineTypeId.hashCode() : 0);
        return result;
    }
}
