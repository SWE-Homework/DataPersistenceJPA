package edu.mum.cs.cs425.studentmgnt;

import edu.mum.cs.cs425.studentmgnt.model.Classroom;
import edu.mum.cs.cs425.studentmgnt.model.Student;
import edu.mum.cs.cs425.studentmgnt.model.Transcript;
import edu.mum.cs.cs425.studentmgnt.repository.ClassRoomMgmt;
import edu.mum.cs.cs425.studentmgnt.repository.StudentMgmtApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
    @Autowired
    private StudentMgmtApp studentMgmt;

    @Autowired
    private ClassRoomMgmt classroomMgmt;

    public static void main(String[] args) {

        SpringApplication.run(MyStudentMgmtAppApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Student st1=new Student();

        //*******Student object******//
        st1.setFirstName("Anna2");
        st1.setMiddleName("Lynn");
        st1.setStudentNumber("000-61-0001");
        st1.setLastName("Smith");
        st1.setCgpa(3.5);
        st1.setDateOfEnrollment(LocalDate.of(2019,5,24));

        //******Transcript object*****//
        Transcript tr=new Transcript();
        tr.setDegreeTitle("Compro");
        tr.setStudent(st1);
        st1.setTranscript(tr);

        //*******Classroom object*******//
        Classroom cr=new Classroom();
        cr.setBuildingName("McLaughlin building");
        cr.setRoomNumber("M105");

        //cr.addStudent(st1);

        List<Student> listStudents=new ArrayList<>();
        listStudents.add(st1);

        cr.setStudents(listStudents);

        st1.setClassroom(cr);





        classroomMgmt.save(cr);
        studentMgmt.save(st1);
    }
}
