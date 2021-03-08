package com.sure3odds.userservice.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sure_users")
public class UserEntity {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sure_users_seq")
    @SequenceGenerator(name = "sure_users_seq", sequenceName = "sure_users_seq", initialValue = 1, allocationSize = 1)
    private Long id;


    private Long usertypeId;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String firstname;

    private String lastname;

    @Column(unique = true)
    private String uniqueid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Africa/Lagos")
    private LocalDate datejoined;

    private Long statusId;

    @Lob
    private String device_token;

    public UserEntity() {
    }

    public UserEntity(Long id, Long usertypeId, String email, String phone, String password, String firstname, String lastname, String uniqueid, LocalDate datejoined, Long statusId, String device_token) {
        this.id = id;
        this.usertypeId = usertypeId;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.uniqueid = uniqueid;
        this.datejoined = datejoined;
        this.statusId = statusId;
        this.device_token = device_token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsertypeId() {
        return usertypeId;
    }

    public void setUsertypeId(Long usertypeId) {
        this.usertypeId = usertypeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public LocalDate getDatejoined() {
        return datejoined;
    }

    public void setDatejoined(LocalDate datejoined) {
        this.datejoined = datejoined;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getDevice_token() {
        return device_token;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }
}
