package br.unioeste.so_manager.so_manager.phone.client;

import br.unioeste.so_manager.so_manager.client.Client;
import br.unioeste.so_manager.so_manager.phone.DDD;
import br.unioeste.so_manager.so_manager.phone.DDI;
import br.unioeste.so_manager.so_manager.phone.Phone;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class ClientPhone extends Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Client client;
}
