import java.util.ArrayList;
import java.util.Scanner;

class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByLastName(String lastName) {
        for (Student student : students) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }

    public void editStudentById(int id, String newFirstName, String newLastName) {
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                // Sử dụng phương thức getter để truy cập firstName và lastName
                student.setFirstName(newFirstName);
                student.setLastName(newLastName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void printStudentList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
