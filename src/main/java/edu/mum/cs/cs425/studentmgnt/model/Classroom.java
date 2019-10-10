package edu.mum.cs.cs425.studentmgnt.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long classroomId;

    private String buildingName;

    @Column(nullable = false)
    private String roomNumber;

    @OneToMany(mappedBy = "classroom",cascade=CascadeType.PERSIST )
    private List<Student> students;

    public Classroom(){   }

    public List<Student> getStudents() {
        return students;
    }



    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
