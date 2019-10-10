package edu.mum.cs.cs425.studentmgnt.repository;


import edu.mum.cs.cs425.studentmgnt.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMgmtApp extends CrudRepository<Student,Long> {


}
