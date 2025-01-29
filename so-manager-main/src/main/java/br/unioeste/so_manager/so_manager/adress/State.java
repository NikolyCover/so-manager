package br.unioeste.so_manager.so_manager.adress;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class State {
    @Id
    private String abbreviation;
    private String name;
}