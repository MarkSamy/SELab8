package edu.mum.cs.cs425.studentmgmt.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.mum.cs.cs425.studentmgmt.demo.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.demo.model.Student;
import edu.mum.cs.cs425.studentmgmt.demo.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyStudentMgmtApp implements CommandLineRunner{

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Student !!!");
        Student student = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45,
                LocalDate.of(2019, 5, 24));
        Transcript transcript = new Transcript(1, "BS Computer Science");
        Classroom classroom = new Classroom(1, "McLaughlin building", "M105");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        classroom.setStudentList(studentList);
        student.setTranscript(transcript);
        student.setClassroom(classroom);
        Student savedStudent = studentRepository.save(student);
        System.out.println(savedStudent.toString());
    }

}
