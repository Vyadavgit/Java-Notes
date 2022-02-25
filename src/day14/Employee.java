package day14;

import java.util.logging.Logger;

public class Employee extends Person{
    @Override
    public void getDescription(){
        Logger.getGlobal().info("Description of Employee");
    }
}
