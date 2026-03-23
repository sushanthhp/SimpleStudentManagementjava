package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class FileUtil {

    private static final String FILE_NAME = "students.dat";

    // Save students to file
    public static void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(students);

        } catch (IOException e) {
            System.out.println("Error saving students to file");
        }
    }

    // Load students from file
    @SuppressWarnings("unchecked")
    public static List<Student> loadStudents() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (List<Student>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students from file");
            return new ArrayList<>();
        }
    }
}
