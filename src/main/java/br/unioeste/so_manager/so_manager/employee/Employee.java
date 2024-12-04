package br.unioeste.so_manager.so_manager.employee;

import br.unioeste.so_manager.so_manager.adress.Address;
import br.unioeste.so_manager.so_manager.email.Email;
import br.unioeste.so_manager.so_manager.phone.Phone;
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

    @Column(unique=true)
    private String cpf;

    private String addressNumber;

    private String addressComplement;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany
    private List<Email> emails;

    @OneToMany
    private List<Phone> phones;
}
