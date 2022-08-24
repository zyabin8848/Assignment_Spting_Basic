package annotationBase;

import org.springframework.stereotype.Component;


@Component("springApp")
public class Institute {
    Department department;

    public Institute(Department department) {
        this.department = department;

    }


}
