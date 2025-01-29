package br.unioeste.so_manager.so_manager.service_order;

import br.unioeste.so_manager.so_manager.client.Client;
import br.unioeste.so_manager.so_manager.employee.Employee;
import br.unioeste.so_manager.so_manager.service.Service;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @Builder @ToString
public class ServiceOrder {
    @Id
    private String number;

    private LocalDate orderDate;

    @Lob
    private String description;

    @ManyToMany
    private List<Service> services;

    @ManyToOne
    private Employee responsible;

    @ManyToOne
    private Client client;

    @Transient
    public Double getTotalAmount() {
        return services != null
                ? services.stream().mapToDouble(Service::getAmountCharged).sum()
                : 0.0;
    }
}
