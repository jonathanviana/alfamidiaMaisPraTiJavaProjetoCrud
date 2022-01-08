package com.alfamidia.maisprati.java.projeto.crud.user;

import javax.persistence.*;

@Entity
@Table(name = "userdb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(length = 25, nullable = false, name = "first_name")
    private String firstName;

    @Column(length = 25, nullable = false, name = "last_name")
    private String lastName;

    @Column(length = 20, nullable = false)
    private String phone;

    @Column(length = 10, nullable = false)
    private String birthdate;

    @Column(length = 10, nullable = false)
    private String registrationDate;

    @Column(length = 10, nullable = false)
    private String updateDate;

    @Column(length = 5, nullable = false)
    private Double finalGrade;

    private boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", finalGrade=" + finalGrade +
                ", enabled=" + enabled +
                '}';
    }
}



