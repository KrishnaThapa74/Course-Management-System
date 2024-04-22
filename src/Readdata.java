import java.io.*;
import java.util.ArrayList;

public class Readdata { //class for reading of different data.
    //Read all the data of courses.
    public void readAllCourses(ArrayList<Courses> CoursesCollection) throws IOException { //throws IOException
        //creates a buffer reader object
        BufferedReader readFromFile = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("src\\CourseData.txt"))));
        String dummyText;
        while ((dummyText = readFromFile.readLine()) != null) {
            String keyOfAttributes[] = dummyText.split(" ");//spliting of text
            CoursesCollection.add(new Courses(keyOfAttributes[0], keyOfAttributes[1], keyOfAttributes[2], keyOfAttributes[3]));//adding the content
        }
    }

    //Read all the data of students.
    public void readAllStudent(ArrayList<Studentsdata> StudentCollection) throws IOException {//throws IOException
        //creates a buffer reader object
        BufferedReader readFromFile = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("src\\StudentData.txt"))));
        String dummyText;
        while ((dummyText = readFromFile.readLine()) != null) {
            String keyOfAttributes[] = dummyText.split(" "); //Spliting of text
            StudentCollection.add(new Studentsdata(keyOfAttributes[0], keyOfAttributes[1], keyOfAttributes[2], keyOfAttributes[3], keyOfAttributes[4], keyOfAttributes[5]));//adding the content
        }
    }

    //Read all the data of Module.
    public void readAllModule(ArrayList<Modulesdata> ModuleCollection) throws IOException {//throws IOException
        //creates a buffer reader object
        BufferedReader readFromFile = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("src\\ModuleData.txt"))));
        String dummyText;
        while ((dummyText = readFromFile.readLine()) != null) {
            String keyOfAttributes[] = dummyText.split(" ");//spliting of text
            ModuleCollection.add(new Modulesdata(keyOfAttributes[0], keyOfAttributes[1], keyOfAttributes[2],keyOfAttributes[3]));//adding the content
        }
    }
    //Read all the data from Student.
    public String readTextFromStudentData(ArrayList<Studentsdata> Studentcollection)
    {
        String finalReturningText="";
        for (int i = 0; i < Studentcollection.size(); i++) {
            Studentsdata singleDataOfStudent = (Studentsdata) Studentcollection.get(i);
            finalReturningText =(Studentcollection.size()-i)+". Name: "+singleDataOfStudent.getStudentName()+ " \n Contact number: "+singleDataOfStudent.getStudentContact()+ "\n Address: "+singleDataOfStudent.getStudentAddress()+ "\n Course: "+singleDataOfStudent.getStudentChosenCourse()+ " \n  Enrolled Date : "+singleDataOfStudent.getStudentEnrolledDate()+" \n Level" +
                    ": "+singleDataOfStudent.getStudentChosenLevel()+"\n"+finalReturningText;//adding the content
        }
        return  finalReturningText ;//returning of Final Text from students
    }
    //Read all the data from Module.
    public String readTextFromModuleData(ArrayList<Modulesdata>Modulecollection )
    {
        String finalReturningText="";
        for (int i = 0; i < Modulecollection.size(); i++) {
            Modulesdata singleDataOfCourse = (Modulesdata) Modulecollection.get(i);
            finalReturningText =" Instructor: "+singleDataOfCourse.getModuleAssignedCourse()+" Courses: "+singleDataOfCourse.getModuleAssignedCourse()+" Total Marks obtained: "+singleDataOfCourse.getAssignedMark()+" \n"+finalReturningText;//adding the content
        }
        return  finalReturningText ; //returning of Final Text from modules
    }
}

