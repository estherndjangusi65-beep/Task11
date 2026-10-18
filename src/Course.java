public class Course {
    String courseName;
    int registeredStudents;
    static int totalStudents= 0;

   public Course(String name, int students){
        courseName = name;
        registeredStudents = students;
        totalStudents += students;
    }

    void showStats(int passed){
       double passPercentage= passed * 100.0 / registeredStudents;

        System.out.println("Course Name  : " + courseName);
        System.out.println("Students     : " + registeredStudents);
        System.out.println("Pass % : " + passPercentage);
    }
}
