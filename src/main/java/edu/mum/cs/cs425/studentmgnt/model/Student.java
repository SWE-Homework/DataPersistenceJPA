package edu.mum.cs.cs425.studentmgnt.model;

import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Sutdents")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;

    @Column(nullable = false)
    private String studentNumber;

    @Column(nullable = false)
    private String firstName;
    private String middleName;

    @Column(nullable = false)
    private String lastName;
    private double cgpa;
    private LocalDate dateOfEnrollment;

    @OneToOne(mappedBy = "student", cascade = CascadeType.PERSIST)
    private Transcript transcript;

    @ManyToOne
    @JoinColumn(name="classroom",nullable =false )
    private Classroom classroom;

    public Student(){}

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
}
