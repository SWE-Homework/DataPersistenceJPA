package edu.mum.cs.cs425.studentmgnt.repository;

import edu.mum.cs.cs425.studentmgnt.model.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomMgmt extends CrudRepository<Classroom,Long> {
}
