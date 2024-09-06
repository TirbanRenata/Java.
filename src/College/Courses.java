package College;


public class Courses {
    private String coursName;
    private String program;
    private int duration;
    private String description;
    private Proffesors proffesor;

    public Courses(String coursName, String program, int duration, String description) {
        this.coursName = coursName;
        this.program = program;
        this.duration = duration;
        this.description = description;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setProfessor(Proffesors proffesors) {
        this.proffesor = proffesors;
    }

    public void informations() {
        System.out.println("Course: " + coursName);
        System.out.println("Program: " + program);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Description: " + description);

        if (proffesor != null) {
            System.out.println("The course is taught by: ");
            proffesor.viewProffesors();
        } else {
            System.out.println("This course does not have a teacher yet.");
        }
    }

}

