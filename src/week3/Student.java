package week3;
import java.util.ArrayList;
//semih burhan - getir
public class Student extends Person{

    int year = 0;
    public Student(){
        super();
        this.year=year;
    }

    int creditNumber=0;
    ArrayList<Courses> course2=new ArrayList<>();

    public void studentCourse (Courses courseStudent){

        if(creditNumber<20){
            for(int i=20; i>creditNumber; creditNumber++) {
                course2.add(courseStudent);
            }
        }
        else
            System.out.println("The maximum credit is 20 for each of student!");
    }
}