package br.unioeste.so_manager.so_manager.phone;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "ddd_ddd")
    private DDD ddd;

    @ManyToOne
    @JoinColumn(name = "ddi_ddi")
    private DDI ddi;
}
