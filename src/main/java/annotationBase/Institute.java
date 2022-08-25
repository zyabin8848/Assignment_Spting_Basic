package annotationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("institute")
public class Institute {
    Department department;

    @Autowired
    public Institute(Department department) {
        this.department = department;

    }
    public void getInfo(){
        department.getDepartmentData();
    }


}
