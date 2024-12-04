package br.unioeste.so_manager.so_manager.service;

import br.unioeste.so_manager.so_manager.service_order.ServiceOrder;
import br.unioeste.so_manager.so_manager.service_type.ServiceType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amountCharged;

    @ManyToOne
    private ServiceType serviceType;

    @ManyToMany(mappedBy = "services")
    private List<ServiceOrder> serviceOrder;
}
