package br.unioeste.so_manager.so_manager.client;

import br.unioeste.so_manager.so_manager.adress.Address;
import br.unioeste.so_manager.so_manager.email.client.ClientEmail;
import br.unioeste.so_manager.so_manager.phone.Phone;
import br.unioeste.so_manager.so_manager.phone.client.ClientPhone;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String cpf;

    private String addressNumber;

    private String addressComplement;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<ClientEmail> emails;

    @OneToMany(mappedBy = "client")
    private List<ClientPhone> phones;
}
