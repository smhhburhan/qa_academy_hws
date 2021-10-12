package week3;
import java.util.ArrayList;
//semih burhan - getir
public class Teacher extends Person{

    public Teacher(){
        super();
    }

    int courseNumber=1;
    ArrayList<Courses> numberOfCourseTeacher=new ArrayList<>();

    public void teacherCourse (Courses courseTeacher){
        if(courseNumber<3){
            for(int i=3; i>courseNumber; courseNumber++){
                numberOfCourseTeacher.add(courseTeacher);
            }
        }
        else
            System.out.println("The maximum course number is 3 for each of teacher!");
    }
}