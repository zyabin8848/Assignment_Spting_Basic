package annotationBase;

import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Institute institute(){
        return new Institute(springApp());
    }
    @Bean
    public Department springApp(){
        return new Department(student());

    }@Bean
    public Student student(){
        return new Student();
    }
}
/* @bean is the good to go the next level programming if the programing is good to go there is nonthings
* chalamge
*
*
*
*
* */