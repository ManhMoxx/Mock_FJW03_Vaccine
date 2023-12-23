package com.spring.entities;

import javax.persistence.*;

@Entity
public class VaccineType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VaccineTypeId")
    private String vaccineTypeId;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "VaccineTypeName")
    private String vaccineTypeName;

    public String getVaccineTypeId() {
        return vaccineTypeId;
    }

    public void setVaccineTypeId(String vaccineTypeId) {
        this.vaccineTypeId = vaccineTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVaccineTypeName() {
        return vaccineTypeName;
    }

    public void setVaccineTypeName(String vaccineTypeName) {
        this.vaccineTypeName = vaccineTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaccineType that = (VaccineType) o;

        if (vaccineTypeId != null ? !vaccineTypeId.equals(that.vaccineTypeId) : that.vaccineTypeId != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (vaccineTypeName != null ? !vaccineTypeName.equals(that.vaccineTypeName) : that.vaccineTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vaccineTypeId != null ? vaccineTypeId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (vaccineTypeName != null ? vaccineTypeName.hashCode() : 0);
        return result;
    }
}
