import java.util.ArrayList;
import java.util.Scanner;

public class Student_Information_System{
    static Scanner sc = new Scanner(System.in);

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("\n ===STUDENT INFORMATION SYSTEM=== ");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    add_student();
                    break;
                case 2:
                    view_students();
                    break;
                case 3:
                    search_student();
                    break;
                case 4:
                    update_student();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    run = false;
                    System.out.println("Thank you for using Student Information System.");
                    break;
                default:
                    System.out.println("Invalid Choice ! Please try again.");
            }
        }
        sc.close();
    }
    public static void add_student(){
        sc.nextLine();
        System.out.println("=== Add new Student ===");

        System.out.println("Student Name :");
        String stu_name = sc.nextLine();

        System.out.println("Student grade :");
        int grade = sc.nextInt();

        System.out.println("Student age :");
        int age = sc.nextInt();

        System.out.println("Student Id :");
        int stu_Id = sc.nextInt();

        sc.nextLine();

        System.out.println("Student Contact :");
        String contact = sc.nextLine();

        Student student  = new Student(stu_name  ,grade , age , stu_Id , contact);
//        System.out.println(student);
        students.add(student);
        System.out.println("Student added successfully!");
    }
    public static void view_students(){
        System.out.println("All Students : ");
        if(students.isEmpty()){
            System.out.println("No Students added or found !");
            return;
        }
        System.out.printf("%-8s %-15s %-5s %-7s %-15s\n",
                "ID", "Name", "Age", "Grade", "Contact");

        for(Student student : students){
            student.display_stu_info();
        }
    }
    public static void search_student(){
        System.out.println("=== Search Student ===");
        System.out.println("Enter Student Id or Name :");
        int stu_id = sc.nextInt();

        boolean found = false;
        for(Student student : students){
            if(student.getStudentId() == stu_id){
                student.display_stu_info();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found.");
        }
    }
    public static void update_student() {
        System.out.println("=== Update Student Information ===");
        boolean found  = false;
        int id = sc.nextInt();
        for(Student student : students){
            if(id == student.getStudentId()){
                found = true;

                boolean exit = true;
                while(exit) {

                    System.out.println("Enter to change the Info :\n 1.Name \n 2.Grade \n 3. Age \n 4. Studenty Id \n 5. Contact \n 6. Exit");
                    int a = sc.nextInt();
                    switch(a) {
                        case 1:
                        System.out.println("Update name :");
                        String name = sc.nextLine();
                        student.setName(name);
                        break;

                        case 2:
                        System.out.println("Update Grade :");
                        int grade = sc.nextInt();
                        student.setGrade(grade);
                        break;

                        case 3:
                        System.out.println("Update Age :");
                        int age = sc.nextInt();
                        student.setAge(age);
                        break;

                        case 4:
                        System.out.println("Update Student Id :");
                        int stu_id = sc.nextInt();
                        student.setStudentId(stu_id);
                        break;

                        case 5:
                        System.out.println("Update Contact :");
                        String contact = sc.nextLine();
                        student.setContact(contact);
                        break;

                        case 6:
                            exit = false;
                            break;
                        default:
                            System.out.println("Invalid Choice ! Please try again.");
                    }
                }
            }
            else{
                System.out.println("Student not found!");
                return;
            }
        }
    }
    public static void deleteStudent() {
        System.out.println("=== Delete Student ===");
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
