package br.unioeste.so_manager.so_manager.email;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Email {
    @Column(unique = true)
    private String address;
}
