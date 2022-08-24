package annotationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("springApp")
public class Student {
    @Autowired
    public void validateStudentId(){
        System.out.println(" Student ID : 45");
    }
    @Autowired
    public void validateStudentName(){
        System.out.println("Student  Name : zyabin");
    }
    @Autowired
    public void getStudentData(){
        System.out.println("Inside the student data ");
    }

}
