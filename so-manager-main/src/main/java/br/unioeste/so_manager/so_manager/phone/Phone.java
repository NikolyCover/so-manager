package br.unioeste.so_manager.so_manager.phone;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
public abstract class Phone {
    private String number;

    @ManyToOne
    @JoinColumn(name = "ddd_ddd")
    private DDD ddd;

    @ManyToOne
    @JoinColumn(name = "ddi_ddi")
    private DDI ddi;
}
