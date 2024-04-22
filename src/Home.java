import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Home{
    public static void main(String[] args) throws IOException {//throws of IOException

        HomeMenu allMenus = new HomeMenu();//For  all the home Menus.
        Insert InsertToFile=new Insert(); //opening of the insert with write file.
        Readdata readSpecificData= new Readdata();//creating the read object.
        Readdata readFiles = new Readdata();// creating the  new read object.
        Editdata changeFiles=new Editdata();//creating of  edit object.
        boolean returnState = true;//setting of  rerunState to true.

        //For creating of the array list with collection of course,Student and modules.
        ArrayList<Courses> collectionOfCourse = new ArrayList<Courses>();
        ArrayList<Modulesdata> collectionOfModules = new ArrayList<Modulesdata>();
        ArrayList<Studentsdata> collectionOfStudent = new ArrayList<Studentsdata>();


        //reading of array list with collection of courses,collection of students,collection of modules.
        readFiles.readAllCourses(collectionOfCourse);
        readFiles.readAllModule(collectionOfModules);
        readFiles.readAllStudent(collectionOfStudent);

     //Using of looping
        while (returnState) {

            Scanner inputOfUser = new Scanner(System.in); //use of scanner with user input.
            allMenus.homeMenu();//For calling of Home menu.
            char choosingOption = inputOfUser.next().charAt(0);//for getting choice from the user.
            switch (choosingOption) { //use of switch options
                case '1'://for choosing of the case 1 (options of student)
                    boolean returnStudent = true; //setting of  return of student to true
                    while (returnStudent) { //use of loop
                        allMenus.studentHomeMenu();
                        char choosingOptionOfStudent = inputOfUser.next().charAt(0);
                        switch (choosingOptionOfStudent) {

                            case '1': //For options 1 of student portion.
                                System.out.println("Please Fill Up the form to enroll the student" );
                                System.out.print("Name of Student = ");//enter student name
                                String StudentName = inputOfUser.next();
                                System.out.print("Student Contact number  = ");//enter student contact number
                                String StudentContact = inputOfUser.next();
                                System.out.print("Address of Student  = ");//enter student address
                                String StudentAddress = inputOfUser.next();
                                System.out.print("Student Chosen Course = ");//enter student chosen course
                                String StudentChosenCourse = inputOfUser.next();
                                System.out.print("Student enroll date = ");//enter student chosen course
                                String StudentEnrollDate = inputOfUser.next();
                                System.out.print("Level(4/5/6)= ");//enter student level.
                                String StudentChosenLevel = inputOfUser.next();

                               //for looping of collection of course
                                for(int i=0;i<collectionOfCourse.size();i++) {
                                    Courses allCoursesInCollege = collectionOfCourse.get(i);// for getting of course
                                    if (allCoursesInCollege.getCollegeCourse().equals(StudentChosenCourse)) { //for checking of course to be matched
                                        //for insert of data in course txt file.
                                        InsertToFile.writeDataToStudentData(StudentName,StudentContact,StudentEnrollDate, StudentAddress, StudentChosenCourse, StudentChosenLevel, "D:\\Assignment\\src\\StudentData.txt");
                                        System.out.println("Student Enrolled Successfully!!");//printing of  confirmation message
                                        break; // end of loop
                                    }
                                    else
                                    {
                                        System.out.println("Student Enrolled Failed!!");//gives the failed message.
                                    }
                                }

                                //For option 2 of student portion
                            case '2':

                                String courseOfInstructor=inputOfUser.next();//For input text.
                                System.out.print("Course Name = ");//input of course name.
                                String AssignedCourseModule = inputOfUser.next();
                                System.out.print("Instructor Name  = ");//input of instructor name.
                                String AssignedCourseInstructor = inputOfUser.next();


                             //Use of loop for module portion
                                for(int loop=0;loop<collectionOfModules.size();loop++) {
                                    Modulesdata modulesInCollege= (Modulesdata) collectionOfModules.get(loop); // gets modules from the text file through data.
                                    if(modulesInCollege.getModuleAssignedCourse().equals(courseOfInstructor)) { //checking of name
                                        System.out.println("Course Name: "+modulesInCollege.getModuleAssignedCourse()+"\n Instructor Name: "+modulesInCollege.getAssignedCourseInstructor());
                                        break;

                                    }
                                }
                                break;

                                //For option 3 of student portion
                            case '3':
                                //Exit of student portion part.
                                returnStudent = false; // setting of return student failed

                                break;
                            default:
                                System.out.println(  "Exit"); //Message

                                break;

                        }

                    }
                    break; //break portion of student part.

                     // For choosing option 2 of Instructor portion.
                        case '2':
                            boolean returnInstructor = true; //setting of return instructor true.
                            while (returnInstructor) { //use of loop
                                allMenus.instructorHomeMenu(); //for calling of menus
                                char optionChoosingForTutors = inputOfUser.next().charAt(0);

                                switch (optionChoosingForTutors) { //use of option from user.
                                    case '1'://for choosing case 1 of Instructor portion.
                                        System.out.println("Student details  Of College");
                                        System.out.println(readSpecificData.readTextFromStudentData(collectionOfStudent));
                                        break;
                                    case '2': //for choosing case 2 of Instructor portion.
                                        System.out.println("All the modules of the college");
                                        System.out.println(readSpecificData.readTextFromModuleData(collectionOfModules));
                                        break;
                                    case '3'://for choosing case 3 of Instructor portion.
                                        //Displays the inputs  names of modules, instructors, course,marks and grade.
                                        System.out.println(  "Give Marks" );
                                        System.out.print("Module Name= ");
                                        String changingModule = inputOfUser.next();
                                        System.out.print("Instructor Name= ");
                                        String changingTeacher = inputOfUser.next();
                                        System.out.print("Course Name= ");
                                        String changingCourse = inputOfUser.next();
                                        System.out.print("Previous Mark= ");
                                        String changingGrade = inputOfUser.next();
                                        System.out.print("Grade to give= ");
                                        String lastGrade = inputOfUser.next();

                                        //creating of data with string. of first and last module.
                                        String firstModuleInfo = changingModule + " " + changingTeacher + " " + changingCourse + " " + changingGrade;
                                        String lastModuleInfo = changingModule + " " + changingTeacher + " " + changingCourse + " " + lastGrade;

                                        for (int loop = 0; loop < collectionOfModules.size(); loop++) {//use of loop for instructor portion
                                            //Getting the module data with collection of module.
                                            Modulesdata modulesAtCollege = (Modulesdata) collectionOfModules.get(loop);
                                            String textToEdit = modulesAtCollege.getModuleAssignedCourse() + " " + modulesAtCollege.getAssignedCourseInstructor() + " " + modulesAtCollege.getCourseModuleName() + " " + modulesAtCollege.getAssignedMark();
                                            if (firstModuleInfo.equals(textToEdit)) {
                                                changeFiles.changeData(textToEdit, lastModuleInfo, "src\\ModuleData.txt");//change of  the data on the file.
                                                System.out.println("Grade Inserted");//successful message
                                            }
                                        }

                                        break;

                                    case '4': //for choosing case 4 of Instructor portion.
                                        //setting of return instructor failed.
                                        returnInstructor = false;//End of program

                                        break;
                                    default:
                                        System.out.println( "Exit");

                                        break;
                                }
                            }
                            break;

                //For option 3 of administrator portion.
                case '3':
                    allMenus.admininstratorHomeMenu();//calling of administrator home menu..
                    char optionChoosingForAdmin = inputOfUser.next().charAt(0);
                    switch (optionChoosingForAdmin) { //use of switch menu of admin.
                        case '1'://for choice of user

                            System.out.println(  "Add/Assign new course");//adding of new course
                            System.out.print("Name of course to insert  = ");//Name of course for adding
                            String AssignedCourseModule = inputOfUser.next();
                            System.out.print(" Course Instructor name to assign = ");//For assigning of course administrator.
                            String ModuleInstructor = inputOfUser.next();
                            String ModuleName=inputOfUser.next();
                            System.out.print(" Module name= ");//For pick up of module name
                            System.out.print("Mark of module= ");//For providing the mark of module.
                            String ModuleMarks = inputOfUser.next();

                            //use of loop of the courses.
                            for(int i=0;i<collectionOfCourse.size();i++) {
                                Courses coursesAtCollege = collectionOfCourse.get(i);//for getting of collection of designed course.
                               //checking of courses if condition for matching
                                if (coursesAtCollege.getCollegeCourse().equals(AssignedCourseModule)) {

                                    //inserting of the module
                                    InsertToFile.writeDataToModuleData(ModuleName,ModuleInstructor,AssignedCourseModule, ModuleMarks, "src\\ModuleData.txt");
                                    System.out.println("Module Inserted");
                                }
                                else
                                {
                                    System.out.println(" The course you searched is not found");//error message
                                }
                            }
                            break;
                        //For option 2 of administrator portion
                        case '2':
                            System.out.println(  "Create and add a new course" );//adding of new course
                            System.out.print("Course to add= ");//adding of new course
                            String CourseName = inputOfUser.next();
                            System.out.print("Module/course One Name= ");//First module name
                            String AddFirstModule=inputOfUser.next();
                            System.out.print("Module/course Two Name= ");//second module name
                            String AddSecondModule=inputOfUser.next();
                            System.out.print("Module/course Three Name= ");//third module name
                            String AddThirdModule=inputOfUser.next();

                            //Use of loop
                            for (int loop = 0; loop < collectionOfModules.size(); loop++) {
                                Modulesdata modulesOfCollege = (Modulesdata) collectionOfModules.get(loop);

                                //use of condition for checking if the course is inserted or not.
                                if (modulesOfCollege.getModuleAssignedCourse().equals(AddFirstModule) || modulesOfCollege.getModuleAssignedCourse().equals(AddSecondModule) || modulesOfCollege.getModuleAssignedCourse().equals(AddThirdModule))
                                {
                                    //insert into the CourseData txt file.
                                   InsertToFile.writeDataToCourseData(CourseName, AddFirstModule, AddSecondModule, AddThirdModule,  "src\\CourseData.txt");
                                    System.out.println("Course inserted");//printing of confirmation message
                                    break;
                                }
                                else
                                {
                                    System.out.println("There is no such course");//printing by displaying error message
                                    break;
                                }
                            }
                            break;
                        //For option 3 of administrator portion
                        case '3':
                            System.out.println(  "Remove Course from College" );//removing of course
                            System.out.print("Deleting Course name = ");//Deleting the course name
                            String courseToRemove = inputOfUser.next();

                            //use of loop until finding of course.
                            for (int loop = 0; loop < collectionOfCourse.size(); loop++) {
                                Courses courseAtCollege = (Courses) collectionOfCourse.get(loop);
                                //use of condition  for checking if course matches or not.
                                if (courseToRemove.equals(courseAtCollege.getCollegeCourse())) {

                                    //changes the course to remove from college of different files
                                    changeFiles.changeData(courseToRemove, "", "src\\CourseData.txt");//writing  the file on courseData.txt
                                    changeFiles.changeData(courseToRemove, "", "src\\ModuleData.txt");//writing  the file on ModuleData.txt
                                    changeFiles.changeData(courseToRemove, "", "src\\ReportData.txt");//writing  the file on ReportData.txt
                                    changeFiles.changeData(courseToRemove, "", "src\\StudentData.txt");//writing  the file on StudentData.txt


                                    System.out.println("Course  has been Deleted");//printing of confirmation message
                                }
                            }
                            break;

                        //For option 4 of administrator portion
                        case '4':
                            System.out.println(  "Change Course Name" );//changing of the course name
                            System.out.print("Course Name to change = ");//Entering of the course name to be changed.
                            String CourseNamechange = inputOfUser.next();
                            System.out.print("Course Name to change into= ");//changing the course name into another name,
                            String changeCourseinto = inputOfUser.next();

                            //use of loop
                            for (int loop = 0; loop < collectionOfCourse.size(); loop++) {
                                Courses allCourse = (Courses) collectionOfCourse.get(loop);

                                //use of condition  for checking if course name matches or not.
                                if (CourseNamechange.equals(allCourse.getCollegeCourse())) {
                                    //changing  the course name of different files
                                    changeFiles.changeData(CourseNamechange, changeCourseinto, "src\\CourseData.txt");//writing  the file on courseData.txt
                                    changeFiles.changeData(CourseNamechange, changeCourseinto, "src\\ModuleData.txt");//writing  the file on ModuleData.txt
                                    changeFiles.changeData(CourseNamechange, changeCourseinto, "src\\StudentData.txt");//writing  the file on StudentData.txt
                                    changeFiles.changeData(CourseNamechange, changeCourseinto, "src\\ReportData.txt");//writing  the file on ReportData.txt

                                    System.out.println("Course name changed");//printing of confirmation message
                                }

                            }
                            break;

                        //For option 5 of administrator portion
                        case '5':
                            System.out.println(  "Change Module Name");//changing of module name
                            System.out.print("Module Name = ");//entering of module name that you want to change.
                            String changeModuleName = inputOfUser.next();
                            System.out.print("Module Name to edit into= ");//changing the module name that you want to change into.
                            String changeModuleinto = inputOfUser.next();

                            //use of loop
                            for (int loop = 0; loop < collectionOfModules.size(); loop++) {
                                Modulesdata moduleAtCollege = (Modulesdata) collectionOfModules.get(loop);

                                //use of condition  for checking if course name matches or not.
                                if (changeModuleName.equals(moduleAtCollege.getModuleAssignedCourse())) {
                                    changeFiles.changeData(changeModuleName, changeModuleinto, "src\\ModuleData.txt");//writing  the file on ModuleData.txt
                                    changeFiles.changeData(changeModuleName, changeModuleinto, "src\\CourseData.txt");//writing  the file on courseData.txt
                                    changeFiles.changeData(changeModuleName, changeModuleinto, "src\\StudentData.txt");//writing  the file on StudentData.txt
                                    System.out.println("Module name Changed");//printing of confirmation message
                                }
                            }
                            break;

                        //For option 6 of administrator portion
                        case '6':

                            System.out.println("Student Lists ");//priting the students lists
                            System.out.println(readSpecificData.readTextFromStudentData(collectionOfStudent));
                            System.out.println("Final Result");//printing the final result
                            System.out.print("Name of student = ");//entering name of student
                            String studentName = inputOfUser.next();
                            System.out.print("Level = ");//entering the level that student is studying at
                            String studentLevelResult = inputOfUser.next();


                            //use of for loop
                            for (int i = 0; i < collectionOfStudent.size(); i++) {
                                Studentsdata studentAtCollege = collectionOfStudent.get(i);

                                //use of condition  for checking if student name matches or not.
                                if (studentAtCollege.getStudentName().equals(studentName)&&studentAtCollege.getStudentChosenLevel().equals(studentLevelResult)) {

                                    //check for the conditions
                                    if (!studentLevelResult.equals("5")) {

                                        System.out.print("First Module Marks = ");//entering of first module marks
                                        String FirstModule = inputOfUser.next();
                                        System.out.print("Second Module Marks  = ");//entering of second module marks
                                        String SecondModule = inputOfUser.next();
                                        System.out.print("Third Module Marks  = ");//entering of third module marks
                                        String ThirdModule = inputOfUser.next();

                                        String finalResultOfStudent = "";

                                        //use of condition  for checking if student is qualified  or not.
                                        if (FirstModule.equals("E") || FirstModule.equals("D") || FirstModule.equals("F")) {
                                            finalResultOfStudent = "Not_Qualified";
                                        } else if (SecondModule.equals("F") || SecondModule.equals("D") || SecondModule.equals("E")) {
                                            finalResultOfStudent = "Not_Qualified";
                                        } else if (ThirdModule.equals("F") || ThirdModule.equals("D") || ThirdModule.equals("E")) {
                                            finalResultOfStudent = "Not_Qualified";
                                        } else {
                                            finalResultOfStudent = "Qualified";
                                        }
                                        //Inserting of file on the result of report data.
                                        InsertToFile.writeDataToReportData(studentName, studentLevelResult, FirstModule, SecondModule, ThirdModule,  "ReportData.txt");
                                        System.out.println(   "Result\n" +
                                                //For printing of result
                                                "Level: " + studentLevelResult +
                                                "\nName: " + studentName +
                                                "\nFirst Module : " + FirstModule +
                                                "\nSecond Module : " + SecondModule +
                                                "\nThird Module : " + ThirdModule +
                                                "\nFinal Result: " + finalResultOfStudent);
                                    } else {

                                        System.out.print("First Module Marks = ");//getting first module marks from user
                                        String FirstModule = inputOfUser.next();
                                        System.out.print("Second Module Marks = ");//getting second module marks from user
                                        String SecondModule = inputOfUser.next();
                                        System.out.print("Third Module Marks = ");//getting third module marks from user
                                        String ThirdModule = inputOfUser.next();
                                        String finalResultOfStudent = "";

                                        //condition to check if the student is qualified or not
                                        if (FirstModule.equals("F") || FirstModule.equals("D") || FirstModule.equals("E")) {
                                            finalResultOfStudent = "Not_Qualified";
                                        } else if (SecondModule.equals("F") || SecondModule.equals("D") || SecondModule.equals("E")) {
                                            finalResultOfStudent = "Not_Qualified";
                                        } else if (ThirdModule.equals("F") || ThirdModule.equals("D") || ThirdModule.equals("E")) {
                                            finalResultOfStudent = "Not_Qualified";
                                        } else {
                                            finalResultOfStudent = "Qualified";
                                        }
                                        //Insert of student data to the report data file.
                                        InsertToFile.writeDataToReportData(studentName,FirstModule, studentLevelResult, SecondModule, ThirdModule,  "src\\ReportData.txt");
                                        System.out.println(   "Result\n" +
                                                "\nLevel:\n" + studentLevelResult +
                                                "\nName:\n" + studentName+
                                                "\n First Module :\n" + FirstModule +
                                                "\n second Module:\n" + SecondModule +
                                                "\n Third Module :\n" + ThirdModule +
                                                "\nFinal Result:\n" + finalResultOfStudent);
                                    }
                                }
                            }
                            break;

                        //For option 7 of administrator portion
                        case '7':

                            break;
                        default:
                            System.out.println(  "Invalid Option");//error message

                            break;
                    }
                    break;

                //For option 4 to end of program.
                case '4':
                    // For displaying of parting of message
                    System.out.println("Thank for visiting to course management system");
                    System.exit(0);//End of program

                    break;
                default:
                    System.out.println("Invalid");//error message
                    break;
            }
        }
    }
}
