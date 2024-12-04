package br.unioeste.so_manager.so_manager.service;

import br.unioeste.so_manager.so_manager.service_type.ServiceType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amountCharged;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;
}
