package fr.microservice.ins_client_service.controller;

import fr.microservice.ins_client_service.dto.ClientDTO;
import fr.microservice.ins_client_service.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping
    public ResponseEntity<ClientDTO> creerClient(@RequestBody ClientDTO clientDTO) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(clientService.creerClient(clientDTO));
    }

   /* @GetMapping
    public String hello() { return "Hello from Client service !"; }*/
}
