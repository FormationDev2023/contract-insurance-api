package fr.microservice.ins_client_service.mapper;

import fr.microservice.ins_client_service.dto.ClientDTO;
import fr.microservice.ins_client_service.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO clientDTO);
}
