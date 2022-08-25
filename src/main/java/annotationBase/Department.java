package annotationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
    private Student student;
    @Autowired
    public Department(Student student) {
        this.student = student;
    }

    public void validateDepartmentName(){
        student.validateStudentName();
        System.out.println("department name : Science ");
    }

    public void getDepartmentData(){
        student.validateStudentId();
        System.out.println("Inside the department data ");
    }
}
