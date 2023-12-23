package com.spring.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Schedule {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "InjectionSchedule")
    private String injectionSchedule;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "EndDate")
    private Date endDate;
    @Basic
    @Column(name = "Place")
    private String place;
    @Basic
    @Column(name = "StartDate")
    private Date startDate;
    @Basic
    @Column(name = "VaccineId")
    private String vaccineId;

    public String getInjectionSchedule() {
        return injectionSchedule;
    }

    public void setInjectionSchedule(String injectionSchedule) {
        this.injectionSchedule = injectionSchedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

        Schedule schedule = (Schedule) o;

        if (injectionSchedule != null ? !injectionSchedule.equals(schedule.injectionSchedule) : schedule.injectionSchedule != null)
            return false;
        if (description != null ? !description.equals(schedule.description) : schedule.description != null)
            return false;
        if (endDate != null ? !endDate.equals(schedule.endDate) : schedule.endDate != null) return false;
        if (place != null ? !place.equals(schedule.place) : schedule.place != null) return false;
        if (startDate != null ? !startDate.equals(schedule.startDate) : schedule.startDate != null) return false;
        if (vaccineId != null ? !vaccineId.equals(schedule.vaccineId) : schedule.vaccineId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = injectionSchedule != null ? injectionSchedule.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (vaccineId != null ? vaccineId.hashCode() : 0);
        return result;
    }
}
