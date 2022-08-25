package annotationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {


    public void validateStudentId(){
        System.out.println(" Student ID : 45");
    }

    public void validateStudentName(){
        System.out.println("Student  Name : zyabin");
    }

    public void getStudentData(){
        System.out.println("Inside the student data ");
    }

}
