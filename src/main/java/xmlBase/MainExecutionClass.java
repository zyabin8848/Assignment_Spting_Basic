package xmlBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExecutionClass {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Institute institute =  context.getBean(Institute.class,"springApp");
        institute.department.validdataDepartmentName();
        institute.department.student.validateStudentName();
        institute.department.student.getStudentData();
        institute.department.getDepartmentData();


    }

}
