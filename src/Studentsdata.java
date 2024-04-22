public class Studentsdata { //public class of student with name,Contact,Address, course chosen,enrollment date and level chosen by student
    String StudentName;
    String StudentContact;
    String StudentAddress;
    String StudentChosenCourse;
    String StudentEnrolledDate;
    String StudentChosenLevel;

    // Creating public class of student data with name,Contact,Address, course chosen,enrollment date and level chosen by student.
    public Studentsdata(String StudentName,  String StudentContact, String StudentAddress, String StudentChosenCourse,String StudentEnrolledDate, String StudentChosenLevel) {
        this.StudentName = StudentName;
        this.StudentContact = StudentContact;
        this.StudentAddress = StudentAddress;
        this.StudentChosenCourse = StudentChosenCourse;
        this.StudentEnrolledDate = StudentEnrolledDate;
        this.StudentChosenLevel = StudentChosenLevel;
    }

    public Studentsdata(String FullName, String course, String level) {
        this.StudentName = FullName; //full name of student
        this.StudentChosenCourse = course; //student chosen course
        this.StudentChosenLevel = level; //level chosen by student
    }
    // gets the name of student
    public String getStudentName() {
        return StudentName;
    }
    // sets the name of student
    public void setStudentName(String StudentName) {

        this.StudentName = StudentName;
    }
    //gets the course chosen by student
    public String getStudentChosenCourse() {

        return StudentChosenCourse;//return of course chosen by student
    }
    //sets the course chosen by student
    public void setStudentChosenCourse(String StudentChosenCourse) {
        this.StudentChosenCourse = StudentChosenCourse;
    }
     //gets the phone number of student
    public String getStudentContact() {

        return StudentContact; //return of contact number of student
    }
    //sets the phone number of student
    public void setStudentContact(String StudentContact) {

        this.StudentContact = StudentContact;
    }
    //gets the address of student
    public String getStudentAddress() {

        return StudentAddress; //return of Address of student
    }
    //sets the address of student
    public void setStudentAddress(String StudentAddress) {

        this.StudentAddress = StudentAddress;
    }
    //gets the enrollment date  of student
    public String getStudentEnrolledDate() {

        return StudentEnrolledDate;//return of enrollment date  of student
    }
    //sets the enrollment date  of student
    public void setStudentEnrolledDate(String StudentEnrolledDate) {
        this.StudentEnrolledDate = StudentEnrolledDate;
    }

    //gets the level chosen by the student
    public String getStudentChosenLevel() {

        return StudentChosenLevel;//return of level chosen by student
    }
    //sets the level chosen by the student
    public void setStudentChosenLevel(String StudentChosenLevel) {
        this.StudentChosenLevel = StudentChosenLevel;
    }

}