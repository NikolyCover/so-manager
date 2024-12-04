package br.unioeste.so_manager.so_manager.email.client;

import br.unioeste.so_manager.so_manager.client.Client;
import br.unioeste.so_manager.so_manager.email.Email;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @Builder @ToString
public class ClientEmail extends Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Client client;
}
