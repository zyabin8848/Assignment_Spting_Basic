package annotationBase;

import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Department springApp(){
        return new Department(student());

    }@Bean
    public Student student(){
        return new Student();
    }
}
