import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("patient")
@Scope("prototype")
public class Patient implements IPatient {
    @Value("John")
    private String name;

    @Override
    public void toRoom() {
        System.out.println("Patient " + name + " goes to room 214");
    }
}
