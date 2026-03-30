package fr.microservice.ins_client_service.entity;

import fr.microservice.ins_client_service.entity.enums.Segment;
import fr.microservice.ins_client_service.entity.enums.Statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "numero_client", unique = true, nullable = false, updatable = false)
    private String numeroClient;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;

    @Column(unique = true, nullable = false)
    private String email;

    private String telephone;

    private String adresse;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Segment segment = Segment.STANDARD;


    @Column(name = "score_risque_global")
    private Double scoreRisqueGlobal = 0.0;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Statut statut = Statut.ACTIF;

    @Column(name = "date_creation", updatable = false)
    private LocalDateTime dateCreation;


    @Column(name = "deleted")
    private boolean deleted = false;

    @Column(name = "date_suppression")
    private LocalDateTime dateSuppression;





}







