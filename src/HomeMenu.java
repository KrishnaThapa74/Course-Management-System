public class HomeMenu {
    public void homeMenu() //home menu buttons to choose for  different options.
    {
        System.out.println("------------------Welcome to course Management System--------------------------");
        System.out.println("Main Menu For Course Management System");
        System.out.println("Press (1) For Students");
        System.out.println("Press (2) For Instructor");
        System.out.println("Press (3) For Course Administrator");
        System.out.println("Press (4) For Exit");
        System.out.print("Options = ");
    }
    public void studentHomeMenu() // displays the student Home options menus
    {
        System.out.println("Press (1) Enroll Students\n" +
                "Press (2) To Display Modules Instructors\n" +
                "Press (3) To Exit\n");
        System.out.print(" Options = ");
    }
    public void instructorHomeMenu() //displays the instructor  Home options menus
    {
        System.out.println("Press (1) To Display Student Details\n" +
                "Press (2) To Displaying Modules Details\n" +
                "Press (3) To Total Module Marks\n" +
                "Press (4) To  Exit\n");
        System.out.print("Options = ");
    }
    public void admininstratorHomeMenu() //displays the administrator home options menus
    {
        System.out.println("Press (1) To create New Module\n" +
                "Press (2) To New Course\n" +
                "Press (3) To Remove Course\n" +
                "Press (4) To Change Module Name\n" +
                "Press (5) To Change Course Name\n" +
                "Press (6) To Create Result\n" +
                "Press (7) To Exit\n");
        System.out.print(" Options = ");

    }
}

