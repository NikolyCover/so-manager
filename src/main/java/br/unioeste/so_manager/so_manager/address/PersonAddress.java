package br.unioeste.so_manager.so_manager.address;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class PersonAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addressNumber;

    private String addressComplement;

    @ManyToOne
    private Address address;
}
