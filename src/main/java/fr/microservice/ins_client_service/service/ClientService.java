package fr.microservice.ins_client_service.service;

import fr.microservice.ins_client_service.dto.ClientDTO;

public interface ClientService {
    ClientDTO creerClient(ClientDTO clientDTO);
}
