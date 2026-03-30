package fr.microservice.ins_client_service.service;

import fr.microservice.ins_client_service.dto.ClientDTO;
import fr.microservice.ins_client_service.entity.Client;
import fr.microservice.ins_client_service.mapper.ClientMapper;
import fr.microservice.ins_client_service.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public ClientDTO creerClient(ClientDTO clientDTO) {
        if (clientRepository.existsByEmail(clientDTO.getEmail())) {
            throw new RuntimeException("Email déjà utilisé : " + clientDTO.getEmail());
        }
        Client client = clientMapper.toEntity(clientDTO);
        return clientMapper.toDTO(clientRepository.save(client));
    }


}

