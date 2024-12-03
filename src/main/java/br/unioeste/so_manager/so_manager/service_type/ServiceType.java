package br.unioeste.so_manager.so_manager.service_type;

import jakarta.persistence.*;

public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
