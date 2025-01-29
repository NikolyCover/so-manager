package br.unioeste.so_manager.so_manager.client;

import br.unioeste.so_manager.so_manager.person.IndividualPerson;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString
@EqualsAndHashCode(callSuper = true)
public class Client extends IndividualPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}