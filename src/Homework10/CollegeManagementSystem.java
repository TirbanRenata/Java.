package Homework10;

public class CollegeManagementSystem {
    public static  void main(String ... args){

        Proffesors proffesor1 = new Proffesors("Vasile","Popescu","M",45, "15-09-1979","1790915789909","Str.Primariei,nr.10");
        Proffesors proffesor2 = new Proffesors("Ion","Andrei","M",30,"10-04-1994","1940410091167","Str.Principala,nr.2");
        Proffesors proffesor3 = new Proffesors("Maria","Ana","F",35,"11-10-1989","6891011051545","Str.Bisericii,nr.66");
        Proffesors proffesor4 = new Proffesors("Ioana","Andreaa","F",40,"14-07-1984","6840714567831","Str.Vasile Alecsandri,nr.9");

        Students student1 = new Students("Andreea","Toma","F",18,"12-12-2006","6061212061266","Str.Mioritei, nr.89");
        Students student2 = new Students("Renata","Tirban","F",20,"13-05-2004","6040513071234","Str. Principala, nr.88");
        Students student3 = new Students("Nicolae","Tig","M",19,"04-12-2005","1051204060606","Str.Tineretului, nr.22");
        Students student4 = new Students("Robert","George","M",19,"06-02-2005","1050206333333","Str.Universitatii,nr.7");
        Students student5 = new Students("Iulia","Delia","F",20,"11-11-2004","6041111676767","Str.Sextil Puscariu, nr.1A");

        Courses math = new Courses("Math",
                "Monday and Wednesday, 10:00-12:00",
                2,
                "Course focused on algebra, geometry, and trigonometry.");
        math.setProffesor(proffesor2);
        math.informations();
        System.out.println();

        student1.viewStudents();
        System.out.println();
        student2.viewStudents();

        System.out.println("--------------");

        Courses computerScience = new Courses("Computer Science",
                "Tuesday and Thursday, 14:00-16:00",
                2,
                "Course covering the basics of programming and algorithms.");
        computerScience.setProffesor(proffesor1);
        computerScience.informations();
        System.out.println();

        student3.viewStudents();
        System.out.println();
        student4.viewStudents();

        System.out.println("--------------");

        Courses physics = new Courses(  "Physics",
                "Monday and Wednesday, 13:00-15:00",
                2,
                "Study of mechanics, thermodynamics, and electromagnetism.");

        physics.setProffesor(proffesor3);
        physics.informations();
        System.out.println();

        student1.viewStudents();
        System.out.println();
        student5.viewStudents();

        System.out.println("--------------");

        Courses chemistry = new Courses("Chemistry",
                "Wednesday and Friday, 09:00-11:00",
                2,
                "Introduction to organic and inorganic chemistry.");

        chemistry.setProffesor(proffesor4);
        chemistry.informations();
        System.out.println();

        student2.viewStudents();
        System.out.println();
        student4.viewStudents();

        System.out.println("--------------");

        Courses biology = new Courses( "Biology",
                "Monday and Thursday, 11:00-13:00",
                2,
                "Exploring cell biology, genetics, and ecology.");

        biology.setProffesor(proffesor2);
        biology.informations();
        System.out.println();

        student1.viewStudents();
        System.out.println();
        student5.viewStudents();

        System.out.println("--------------");


        Courses geography = new Courses( "Geography",
                "Tuesday and Friday, 12:00-14:00",
                2,
                "A course on physical geography and human geography.");

        geography.setProffesor(proffesor1);
        geography.informations();
        System.out.println();

        student1.viewStudents();
        System.out.println();
        student4.viewStudents();

        System.out.println("--------------");

        Courses english = new Courses( "English",
                "Monday and Wednesday, 15:00-17:00",
                2,
                "Focus on literature, grammar, and writing skills.");
        english.setProffesor(proffesor3);
        english.informations();
        System.out.println();

        student1.viewStudents();
        System.out.println();
        student4.viewStudents();
        student2.viewStudents();
        System.out.println();
        student3.viewStudents();

        System.out.println("--------------");


        Courses history = new Courses( "History",
                "Tuesday and Thursday, 10:00-12:00",
                2,
                "World history from ancient to modern times.");
        history.setProffesor(proffesor4);
        history.informations();
        System.out.println();

        student4.viewStudents();
        System.out.println();
        student5.viewStudents();







    }
}
