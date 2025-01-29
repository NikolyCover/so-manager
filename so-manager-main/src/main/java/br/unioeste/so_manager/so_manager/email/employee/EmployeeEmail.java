package br.unioeste.so_manager.so_manager.email.employee;

import br.unioeste.so_manager.so_manager.email.Email;
import br.unioeste.so_manager.so_manager.employee.Employee;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class EmployeeEmail extends Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;
}
