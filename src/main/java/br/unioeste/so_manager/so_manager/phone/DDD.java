package br.unioeste.so_manager.so_manager.phone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class DDD {
    @Id
    private String ddd;
}
