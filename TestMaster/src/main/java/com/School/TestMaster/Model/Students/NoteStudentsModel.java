package com.School.TestMaster.Model.Students;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NoteStudents")
public class NoteStudentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdNoteStudents;

    @Basic
    private String Note30;
    private String Note70;

    @ManyToOne
    @JoinColumn(name = "StudentId", foreignKey = @ForeignKey(name = "FkStudent"))
    private StudentsModel studentModel;;

}