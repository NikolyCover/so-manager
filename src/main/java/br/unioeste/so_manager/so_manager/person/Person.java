package br.unioeste.so_manager.so_manager.person;

import br.unioeste.so_manager.so_manager.address.PersonAddress;
import br.unioeste.so_manager.so_manager.email.Email;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@MappedSuperclass
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Person {
    private String name;

    private String socialName;

    @ElementCollection
    @CollectionTable
    private List<Email> emails;

    @ElementCollection
    @CollectionTable
    private List<String> phones;

    @OneToOne
    @JoinColumn(name = "person_address_id")
    private PersonAddress address;
}
