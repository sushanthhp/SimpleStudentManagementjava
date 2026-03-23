import java.util.*;
import model.Student;
import service.StudentService;
import exception.DuplicateStudentException;
import exception.StudentNotFoundException;
public class Main {

    public static void main(String[] args)
    {

        StudentService s1 =new StudentService();
        Scanner sc= new Scanner(System.in);
        int n=0;
        
        while(n!=6)
        {
            System.out.println("===== Student Management System =====\r\n" + //
                        "1. Add Student\r\n" + //
                        "2. View All Students\r\n" + //
                        "3. View Student By ID\r\n" + //
                        "4. Update Student\r\n" + //
                        "5. Delete Student\r\n" + //
                        "6. Exit\r\n" + //
                        "Enter your choice:\r\n" 
                        );
            n =sc.nextInt();
            switch(n)
            {
                case 1:{
                    try
                    {
                        System.out.println("Enter the id of the Student:");
                        int id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the name of the Student:");
                        String name=sc.nextLine();
                        System.out.println("Enter the Age of the Student:");
                        int age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the Department of the Student:");
                        String department=sc.nextLine();
                        System.out.println("Enter the Mark of the Student:");
                        double marks=sc.nextDouble();
                        Student s=new Student(id,name,age,department,marks);
                        s1.addStudent(s);
                        System.out.println("Student added successfully");
                    }
                    catch (DuplicateStudentException e) {
                    System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2:
                    List<Student> students = s1.getAllStudents();
                    if (students.isEmpty()) {
                    System.out.println("No students found");
                        } else {
                            for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    {
                    System.out.println("Enter the Id of the Student:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    try{
                        Student s=s1.getStudentById(id);
                        System.out.println(s);
                    }
                    catch(StudentNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4:{
                    try{
                    System.out.println("Enter the id of the Student:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the Student:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Age of the Student:");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Department of the Student:");
                    String department=sc.nextLine();
                    System.out.println("Enter the Mark of the Student:");
                    double marks=sc.nextDouble();
                    Student s=new Student(id,name,age,department,marks);
                    s1.updateStudent(id,s);
                    } catch(StudentNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 5:
                    {
                    try{
                        System.out.println("Enter the ID for Deletion:");
                        int id=sc.nextInt();
                        sc.nextLine();
                        s1.deleteStudent(id);
                        System.out.println("Student details deleted Successfully");
                    }catch(StudentNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }break;
                }
                case 6:
                    System.out.println("Main Menu Exited");
                    return;
                        
                    

    
        }
        
    }  
        sc.close();
    }   
}

