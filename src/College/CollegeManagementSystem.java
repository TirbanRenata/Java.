package College;

import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {
    private List<Students> students;
    private List<Proffesors> professors;
    private List<Courses> courses;

    public CollegeManagementSystem() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public void removeStudent(Students student) {
        students.remove(student);
    }

    public Students getStudentByLastName(String lastName) {
        for (Students student : students) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public void addProfessor(Proffesors professor) {
        professors.add(professor);
    }

    public void removeProfessor(String firstName, String lastName) {
        Proffesors professor = getProfessorByFullName(firstName, lastName);
        if (professor != null) {
            professors.remove(professor);
            System.out.println("Professor removed.");
        } else {
            System.out.println("Professor not found.");
        }
    }

    public Proffesors getProfessorByFullName(String firstName, String lastName) {
        for (Proffesors professor : professors) {
            if (professor.getFirstName().equals(firstName) &&
                    professor.getLastName().equals(lastName)) {
                return professor;
            }
        }
        return null;
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }

    public void assignProfessorToCourse(String courseName, Proffesors professor) {
        Courses course = getCourseByName(courseName);
        if (course != null) {
            course.setProfessor(professor);
        }
    }

    public Courses getCourseByName(String courseName) {
        for (Courses course : courses) {
            if (course.getCoursName().equals(courseName)) {
                return course;
            }
        }
        return null;
    }

    public void listCourses() {
        for (Courses course : courses) {
            System.out.println(course.getCoursName());
        }
    }
}
