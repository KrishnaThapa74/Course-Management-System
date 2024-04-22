public class Courses {//creating public class for different courses
    String CollegeCourse; //college course
    String FirstCourseModule; //First college Module
    String SecondCourseModule; //Second college Module
    String ThirdCourseModule; //Third college Module

    // gets the name of college course
    public String getCollegeCourse() {
        return CollegeCourse; //return of college course
    }
    // sets the name of college course
    public void setCollegeCourse(String CollegeCourse) {
        this.CollegeCourse = CollegeCourse;
    }
   //Creating CourseName with 3 different types of courses.
    public Courses(String CourseName, String FirstModule, String SecondModule, String ThirdModule) {
        this.CollegeCourse = CourseName;
        this.FirstCourseModule = FirstModule;
        this.SecondCourseModule = SecondModule;
        this.ThirdCourseModule = ThirdModule;
    }

    // gets the first  college course module
    public String getFirstCourseModule() {
        return FirstCourseModule;//return of  first college course module
    }
    // sets the first  college course module
    public void setFirstCourseModule(String FirstCourseModule) {
        this.FirstCourseModule = FirstCourseModule;
    }
    // gets the second  college course module
    public String getSecondCourseModule() {
        return SecondCourseModule;//return of second college course module
    }
    // sets the second  college course module
    public void setSecondCourseModule(String SecondCourseModule) {
        this.SecondCourseModule = SecondCourseModule;
    }
    // gets the third  college course module
    public String getThirdCourseModule() {
        return ThirdCourseModule;//return of  third college course module
    }
    // sets the Third  college course module
    public void setThirdCourseModule(String ThirdCourseModule) {
        this.ThirdCourseModule = ThirdCourseModule;
    }

}
