package model;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private double salary;
    private int vacationDays;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // getters e setters (ou use Lombok @Data para gerar automaticamente)
}
