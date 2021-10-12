package week3;
import java.util.ArrayList;
//semih burhan - getir
public class Courses {

    String courseName = null;
    int courseCredit = 0;
    int studentCount = 0;

    public Courses(String courseName,int courseCredit,int studentCount){
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.studentCount = studentCount;
    }

    int courseNumber=1;
    ArrayList<Student> countStudent=new ArrayList<>();

    public void studentCourse (Student student){
        if(courseNumber<20){
            for(int i=20; i>courseNumber; courseNumber++){
                countStudent.add(student);
            }
        }
        else
            System.out.println("A maximum of 20 students can register for a course.!");
    }
}