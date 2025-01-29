package br.unioeste.so_manager.so_manager.phone.employee;

import br.unioeste.so_manager.so_manager.employee.Employee;
import br.unioeste.so_manager.so_manager.phone.DDD;
import br.unioeste.so_manager.so_manager.phone.DDI;
import br.unioeste.so_manager.so_manager.phone.Phone;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class EmployeePhone extends Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;
}
