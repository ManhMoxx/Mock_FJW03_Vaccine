package com.spring.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EmployeeId")
    private String employeeId;
    @Basic
    @Column(name = "Address")
    private String address;
    @Basic
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "EmployeeName")
    private String employeeName;
    @Basic
    @Column(name = "Gender")
    private int gender;
    @Basic
    @Column(name = "Image")
    private String image;
    @Basic
    @Column(name = "Password")
    private String password;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "Position")
    private String position;
    @Basic
    @Column(name = "Username")
    private String username;
    @Basic
    @Column(name = "WorkingPlace")
    private String workingPlace;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (gender != employee.gender) return false;
        if (employeeId != null ? !employeeId.equals(employee.employeeId) : employee.employeeId != null) return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null)
            return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        if (employeeName != null ? !employeeName.equals(employee.employeeName) : employee.employeeName != null)
            return false;
        if (image != null ? !image.equals(employee.image) : employee.image != null) return false;
        if (password != null ? !password.equals(employee.password) : employee.password != null) return false;
        if (phone != null ? !phone.equals(employee.phone) : employee.phone != null) return false;
        if (position != null ? !position.equals(employee.position) : employee.position != null) return false;
        if (username != null ? !username.equals(employee.username) : employee.username != null) return false;
        if (workingPlace != null ? !workingPlace.equals(employee.workingPlace) : employee.workingPlace != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + gender;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (workingPlace != null ? workingPlace.hashCode() : 0);
        return result;
    }
}
