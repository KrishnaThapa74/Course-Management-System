import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Insert{
    //insert of different  data in courses.
    public void writeDataToCourseData(String CourseName, String AddFirstModule, String SecondModule, String ThirdModule,  String pathOfTextFile) {
        try {
            //It helps to print the object of writer.
            PrintWriter writeText = new PrintWriter(new BufferedWriter(new FileWriter(pathOfTextFile, true)));
            writeText.println("\n"+CourseName+" "+AddFirstModule+" "+SecondModule+" "+ThirdModule+" ");//insert data into files.
            writeText.close(); // writer close
        } catch (Exception e) { //catches the exceptions
            System.out.println("text  cannot be written in file because of " + e);//Error message
        }
    }
    //insert of different  data in modules.
    public void writeDataToModuleData(String ModuleName,String AssignedCourseModule, String ModuleInstructor,  String ModuleMarks, String pathOfTextFile) {
        try {
            // //It helps to print the object of writer.
            PrintWriter writeText = new PrintWriter(new BufferedWriter(new FileWriter(pathOfTextFile, true)));
            writeText.println(" "+ModuleName+ AssignedCourseModule+" "+ModuleInstructor+" "+ModuleMarks);//insert data into files.
            writeText.close(); // writer close
        } catch (Exception e) {   //catches the exceptions
            System.out.println("text  cannot be written in file because of " + e); //Error message
        }
    }
    //insert of different  data of student.
    public void writeDataToStudentData(String StudentName, String StudentContact, String StudentEnrollDate, String StudentAddress, String StudentChosenCourse, String StudentChosenLevel, String pathOfTextFile) {
        try {
            //It helps to print the object of writer.
            PrintWriter writeText = new PrintWriter(new BufferedWriter(new FileWriter(pathOfTextFile, true)));
            writeText.println(StudentName+" " +StudentEnrollDate+""+StudentContact+" "+StudentAddress+" "+" "+StudentChosenCourse+" "+StudentChosenLevel);//insert data into files.
            writeText.close();// writer close
        } catch (Exception e) {   //catches the exceptions
            System.out.println("text  cannot be written in file because of" + e); //Error message
        }
    }
    //insert of different  data of to publish the report card.
    public void writeDataToReportData(String StudentName, String studentLevelResult, String FirstModule, String SecondModule, String ThirdModule,  String pathOfTextFile) {
        try {
            //It helps to print the object of writer.
            PrintWriter writeText = new PrintWriter(new BufferedWriter(new FileWriter(pathOfTextFile, true)));
            writeText.println(StudentName+" "+studentLevelResult+" "+" "+FirstModule+" "+SecondModule+" "+ThirdModule);//insert data into files.
            writeText.close();// writer close
        } catch (Exception e) {   //catches the exceptions
            System.out.println("text  cannot be written in file because of " + e);//Error message
        }
    }

}

