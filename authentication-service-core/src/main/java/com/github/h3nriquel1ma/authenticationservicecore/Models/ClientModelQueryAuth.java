package com.github.h3nriquel1ma.authenticationservicecore.Models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "clients")
public class ClientModelQueryAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "client_id")
    private UUID clientID;

    @Column(name = "client_full_name")
    private String clientFullName;

    @Column(name = "client_cpf")
    private String clientCPF;

    @Column(name = "client_email")
    private String clientEmail;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "client_birth_date")
    private String clientBirthDate;

    @Column(name = "client_username")
    private String clientUserName;

    @Column(name = "client_password")
    private String clientPassword;
}
