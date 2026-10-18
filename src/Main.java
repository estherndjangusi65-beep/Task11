public class Main {
    public static void main(String[] args) {
        Course c1= new Course("Database", 200);
        Course c2= new Course("Java", 650);
        Course c3= new Course("NETWORK", 450);

        c1.showStats(150);
        c2.showStats(500);
        c3.showStats(400);

        System.out.println("University-wide enrolment statistics");
        System.out.println("Total Student : " + Course.totalStudents);

    }
}