package br.unioeste.so_manager.so_manager.employee;

import br.unioeste.so_manager.so_manager.adress.Address;
import br.unioeste.so_manager.so_manager.email.employee.EmployeeEmail;
import br.unioeste.so_manager.so_manager.phone.Phone;
import br.unioeste.so_manager.so_manager.phone.employee.EmployeePhone;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String addressNumber;

    private String addressComplement;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeEmail> emails;

    @OneToMany(mappedBy = "employee")
    private List<EmployeePhone> phones;
}
