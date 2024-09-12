package College;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CollegeManagementSystem college = new CollegeManagementSystem();

        Students student1 = new Students("Andreea", "Toma", "F", 18, "12-12-2006", "6061212061266", "Str.Mioritei, nr.89");
        Students student2 = new Students("Renata", "Tirban", "F", 20, "13-05-2004", "6040513071234", "Str. Principala, nr.88");
        Students student3 = new Students("Nicolae", "Tig", "M", 19, "04-12-2005", "1051204060606", "Str.Tineretului, nr.22");
        Students student4 = new Students("Robert", "George", "M", 19, "06-02-2005", "1050206333333", "Str.Universitatii,nr.7");
        Students student5 = new Students("Iulia", "Delia", "F", 20, "11-11-2004", "6041111676767", "Str.Sextil Puscariu, nr.1A");

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
        college.addStudent(student4);
        college.addStudent(student5);

        Proffesors professor1 = new Proffesors("Vasile", "Popescu", "M", 45, "15-09-1979", "1790915789909", "Str.Primariei,nr.10");
        Proffesors professor2 = new Proffesors("Ion", "Andrei", "M", 30, "10-04-1994", "1940410091167", "Str.Principala,nr.2");
        Proffesors professor3 = new Proffesors("Maria", "Ana", "F", 35, "11-10-1989", "6891011051545", "Str.Bisericii,nr.66");
        Proffesors professor4 = new Proffesors("Ioana", "Andreaa", "F", 40, "14-07-1984", "6840714567831", "Str.Vasile Alecsandri,nr.9");

        college.addProfessor(professor1);
        college.addProfessor(professor2);
        college.addProfessor(professor3);
        college.addProfessor(professor4);

        Courses math = new Courses("Math", "Monday and Wednesday, 10:00-12:00", 2, "Course focused on algebra, geometry, and trigonometry.");
        Courses computerScience = new Courses("Computer Science", "Tuesday and Thursday, 14:00-16:00", 2, "Basics of programming and algorithms.");
        Courses physics = new Courses("Physics", "Monday and Wednesday, 13:00-15:00", 2, "Study of mechanics, thermodynamics, and electromagnetism.");
        Courses chemistry = new Courses("Chemistry", "Wednesday and Friday, 09:00-11:00", 2, "Introduction to organic and inorganic chemistry.");
        Courses biology = new Courses("Biology", "Monday and Thursday, 11:00-13:00", 2, "Exploring cell biology, genetics, and ecology.");
        Courses geography = new Courses("Geography", "Tuesday and Friday, 12:00-14:00", 2, "A course on physical geography and human geography.");
        Courses english = new Courses("English", "Monday and Wednesday, 15:00-17:00", 2, "Focus on literature, grammar, and writing skills.");
        Courses history = new Courses("History", "Tuesday and Thursday, 10:00-12:00", 2, "World history from ancient to modern times.");

        college.addCourse(math);
        college.addCourse(computerScience);
        college.addCourse(physics);
        college.addCourse(chemistry);
        college.addCourse(biology);
        college.addCourse(geography);
        college.addCourse(english);
        college.addCourse(history);

        college.assignProfessorToCourse("Math", professor2);
        college.assignProfessorToCourse("Computer Science", professor1);
        college.assignProfessorToCourse("Physics", professor3);
        college.assignProfessorToCourse("Chemistry", professor4);
        college.assignProfessorToCourse("Biology", professor1);
        college.assignProfessorToCourse("Geography", professor3);
        college.assignProfessorToCourse("English", professor2);
        college.assignProfessorToCourse("History", professor4);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== College Management System ===");
            System.out.println("1. View Courses");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Add Professor");
            System.out.println("5. Remove Professor");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("This is the list of courses: ");
                    college.listCourses();
                    System.out.println("Choose a course to view its details or type 'exit' to quit:");
                    String courseChoice = scanner.nextLine();
                    if (courseChoice.equals("exit")) {
                        break;
                    }
                    Courses selectedCourse = college.getCourseByName(courseChoice);
                    if (selectedCourse != null) {
                        selectedCourse.informations();
                        System.out.println();
                    }else{
                        System.out.println("The course does not found.Please choose another option.");
                    }
                    break;

                case "2":
                    System.out.println("Enter the student's first name: ");
                    String studentFirstName = scanner.nextLine();
                    System.out.println("Enter the student's last name: ");
                    String studentLastName = scanner.nextLine();
                    System.out.println("Enter the student's sex (M/F): ");
                    String studentSex = scanner.nextLine();
                    System.out.println("Enter the student's age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the student's date of birth (DD-MM-YYYY): ");
                    String studentBirth = scanner.nextLine();
                    System.out.println("Enter the student's CNP: ");
                    String studentCNP = scanner.nextLine();
                    System.out.println("Enter the student's address: ");
                    String studentAddress = scanner.nextLine();
                    Students student = new Students(studentFirstName, studentLastName, studentSex, studentAge, studentBirth, studentCNP, studentAddress);
                    college.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case "3":
                    System.out.print("Enter the last name of the student to remove: ");
                    String studentToRemove = scanner.nextLine();
                    Students studentToBeRemoved = college.getStudentByLastName(studentToRemove);
                    if (studentToBeRemoved != null) {
                        college.removeStudent(studentToBeRemoved);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    System.out.println("Enter the professor's first name: ");
                    String professorFirstName = scanner.nextLine();
                    System.out.println("Enter the professor's last name: ");
                    String professorLastName = scanner.nextLine();
                    System.out.println("Enter the professor's sex (M/F): ");
                    String professorSex = scanner.nextLine();
                    System.out.println("Enter the professor's age: ");
                    int professorAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the professor's date of birth (DD-MM-YYYY): ");
                    String professorBirth = scanner.nextLine();
                    System.out.println("Enter the professor's CNP: ");
                    String professorCNP = scanner.nextLine();
                    System.out.println("Enter the professor's address: ");
                    String professorAddress = scanner.nextLine();
                    Proffesors newProfessor = new Proffesors(professorFirstName, professorLastName, professorSex, professorAge, professorBirth, professorCNP, professorAddress);
                    college.addProfessor(newProfessor);
                    System.out.println("Professor added successfully.");
                    break;

                case "5":
                    System.out.println("Enter the professor's first name to remove: ");
                    String removeProfessorFirstName = scanner.nextLine();
                    System.out.println("Enter the professor's last name to remove: ");
                    String removeProfessorLastName = scanner.nextLine();
                    Proffesors professorToRemove = college.getProfessorByFullName(removeProfessorFirstName, removeProfessorLastName);
                    if (professorToRemove != null) {
                        college.removeProfessor(removeProfessorFirstName, removeProfessorLastName);
                    } else {
                        System.out.println("Professor not found.");
                    }
                    break;

                case "6":
                    running = false;
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
        scanner.close();
        System.out.println("Program ended.");
    }
}
