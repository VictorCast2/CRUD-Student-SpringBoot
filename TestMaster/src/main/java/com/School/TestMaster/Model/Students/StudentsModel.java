package com.School.TestMaster.Model.Students;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Students")
public class StudentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Basic
    @NonNull
    private String FirstName;
    private String LastName;

    @Basic
    @NonNull
    private String Note30;
    private String Note70;
}