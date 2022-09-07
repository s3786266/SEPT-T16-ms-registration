package com.rmit.sept.msregistration.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name="email", nullable=false, unique=true)
    private String email;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name = "password", nullable=false)
    private String password;

    @Column(name="dob", nullable=false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date DoB;

    @Column(name="account_active", nullable=false)
    private boolean accountActive;

    @Column(name="address")
    private String address;

    @Column(name="mobile_number", unique=true)
    private String mobileNumber;

    @Column(name="role", nullable=false)
    private String role;
}
