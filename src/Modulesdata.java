public class Modulesdata {//creating Module data with name, module instructor,course assigned in module and module marks

    String AssignedMark;
    String CourseModuleName;
    String AssignedCourseModule;
    String AssignedCourseInstructor;
     //Module data with name, module instructor,course assigned in module and module marks
    public Modulesdata( String ModuleName, String ModuleInstructor, String AssignCourseModule, String ModuleMarks) {
        AssignedCourseModule = AssignCourseModule;
        CourseModuleName = ModuleName;
        AssignedCourseInstructor = ModuleInstructor;
        AssignedMark =ModuleMarks;

    }
    //gets Assigned mark of different modules
    public String getAssignedMark() {
        return AssignedMark;
    }
    //sets Assigned mark of different modules
    public void setAssignedMark(String AssignedMark) {
        this.AssignedMark = AssignedMark;
    }
    //gets Name of course module
    public String getCourseModuleName() {
        return CourseModuleName;
    }
    //sets Name of course module
    public void setCourseModuleName(String CourseModuleName) {
        this.CourseModuleName = CourseModuleName;
    }
    //gets  course assigned in Module.
    public String getModuleAssignedCourse() {
        return AssignedCourseModule;
    }
    //gets  course assigned in Module.
    public void setAssignedCourseModule(String AssignedCourseModule) {
        this.AssignedCourseModule = AssignedCourseModule;
    }
    //gets  course assigned by instructor.
    public String getAssignedCourseInstructor() {
        return AssignedCourseInstructor;
    }
    //sets  course assigned by instructor.
    public void setAssignedCourseInstructor(String AssignedCourseInstructor) {
        this.AssignedCourseInstructor = AssignedCourseInstructor;
    }

}

