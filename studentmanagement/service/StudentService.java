package service;


import java.util.List;

import exception.DuplicateStudentException;
import exception.StudentNotFoundException;
import model.Student;
import util.FileUtil;

public class StudentService {

    private List<Student> students;

    

    public StudentService()
     {
        this.students = FileUtil.loadStudents();
    }


    public void addStudent(Student student) throws DuplicateStudentException {
        for (Student existingStudent : students) {
            if (existingStudent.getId() == student.getId()) {
                throw new DuplicateStudentException(
                    "Student with ID " + student.getId() + " already exists"
                );
            }
        }
        students.add(student);
        FileUtil.saveStudents(students);

    }
    public List<Student> getAllStudents()
    {
        return students;
    }
    public Student getStudentById(int id) throws StudentNotFoundException
    {
        for( Student student: students)
        {
            if(student.getId()==id)
            {
                return student;
            }
        }
        throw new StudentNotFoundException(
                "Student with ID"+id +"not found"
            );
    }
    public void updateStudent(int id, Student updatedStudent) throws StudentNotFoundException
    {
        Student existingStudent = getStudentById(id);
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setMarks(updatedStudent.getMarks());
        FileUtil.saveStudents(students);

    }
    public void deleteStudent(int id) throws StudentNotFoundException
    {
        Student existingStudent=getStudentById(id);
        students.remove(existingStudent);
        FileUtil.saveStudents(students);

    }

    
}
