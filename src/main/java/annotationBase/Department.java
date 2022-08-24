package annotationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("springApp")
public class Department {
    private Student student;

    public Department(Student student) {
        this.student = student;
    }
    @Autowired
    public void validateDepartmentName(){
        System.out.println("department name : Science ");
    }
    @Autowired
    public void getDepartmentData(){
        System.out.println("Inside the department data ");
    }
}
