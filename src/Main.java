import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement system = new StudentManagement();

        system.addStudent(new Student("Truong Giang", "Ha", 1));
            system.addStudent(new Student("Van Minh", "Pham", 2));
            system.addStudent(new Student("Nhu Phuc", "Nguyen", 3));
            system.addStudent(new Student("Ngoc Son", "Dang", 4));

            int choice;
            do {
            System.out.println("\n1. Add Student\n2. Find Student by Last Name\n3. Edit Student\n4. Print Student List\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    system.addStudent(new Student(firstName, lastName, id));
                    break;
                case 2:
                    System.out.print("Enter last name to search: ");
                    String searchLastName = scanner.nextLine();
                    Student foundStudent = system.findStudentByLastName(searchLastName);
                    if (foundStudent != null) {
                        System.out.println("Found student: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new first name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter new last name: ");
                    String newLastName = scanner.nextLine();
                    system.editStudentById(editId, newFirstName, newLastName);
                    break;
                case 4:
                    System.out.println("Student List:");
                    system.printStudentList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
