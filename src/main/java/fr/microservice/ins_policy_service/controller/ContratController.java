package fr.microservice.ins_policy_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/contrats")
public class ContratController {
    @GetMapping
    public String hello() { return "Hello from Contrat service !"; }
}
