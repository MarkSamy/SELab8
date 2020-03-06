package edu.mum.cs.cs425.studentmgmt.demo.repository;

import edu.mum.cs.cs425.studentmgmt.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
