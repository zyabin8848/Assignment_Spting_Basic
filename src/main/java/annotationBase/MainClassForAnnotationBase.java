package annotationBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassForAnnotationBase {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Institute institute = context.getBean("institute" , Institute.class);
        institute.getInfo();

    }
}
