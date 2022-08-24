package xmlBase;

public class Department {
    Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void validdataDepartmentName(){
        System.out.println("Inside the department name method");
    }
    public void getDepartmentData(){
        System.out.println("Inside the department data method");
    }

}
