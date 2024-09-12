package Homework10WithScanner;


public class Courses {
    public String coursName;
    private String program;
    private int duration;
    private String description;
   Proffesors proffesors;

    public Courses(String coursName, String program,int duration,String description){
        this.coursName = coursName;
        this.program = program;
        this.duration = duration;
        this.description = description;


    }
    public void setProffesor(Proffesors proffesors){

        this.proffesors = proffesors;
    }

    public void informations(){
        System.out.println("Course: " + coursName);
        System.out.println("Program: " + program);
        System.out.println("Duration: "+ duration + " hours");
        System.out.println("Description: " + description);

        if(proffesors !=null){
            System.out.println("The course is taught by: ");
            proffesors.viewProffesors();
        }
        else{
            System.out.println("This course does not have a teacher yet.");
        }
    }
}
