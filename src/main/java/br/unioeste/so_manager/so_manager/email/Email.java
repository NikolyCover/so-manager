package br.unioeste.so_manager.so_manager.email;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Email {
    @Column(unique = true)
    private String address;
}
