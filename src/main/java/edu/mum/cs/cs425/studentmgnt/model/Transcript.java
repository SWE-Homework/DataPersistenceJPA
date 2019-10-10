package edu.mum.cs.cs425.studentmgnt.model;

import javax.persistence.*;

@Entity
@Table(name="Transcripts")
public class Transcript {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long transcriptId;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private String degreeTitle;

    @OneToOne
    @JoinColumn(name = "studentId", nullable = false)
    private Student student;

    public Transcript(){}

    public long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}
