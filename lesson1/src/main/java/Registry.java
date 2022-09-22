import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {

    private IPatient patient;

    public Registry() {
        System.out.println("Registry is opened.");
    }

    public IPatient getPatient() {
        return patient;
    }

    @Autowired(required = false)
    @Qualifier("patient")
    public void setPatient(IPatient patient) {
        this.patient = patient;
    }

    public void patientIncoming() {
        System.out.println("Patient incoming.");
        patient.toRoom();
    }
}
