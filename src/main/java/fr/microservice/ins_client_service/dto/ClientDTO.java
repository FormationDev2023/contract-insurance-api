package fr.microservice.ins_client_service.dto;

import fr.microservice.ins_client_service.entity.enums.Segment;
import fr.microservice.ins_client_service.entity.enums.Statut;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ClientDTO {

    private UUID id;
    private String numeroClient;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String adresse;
    private Segment segment;
    private Double scoreRisqueGlobal;
    private Statut statut;
    private LocalDateTime dateCreation;
}
