import webservice.Employee;
import webservice.EmployeeServiceImpl;
import webservice.EmployeeServiceImplService;

public class Main {
    public static void main(String[] args) {
       EmployeeServiceImpl webservice = new EmployeeServiceImplService().getEmployeeServiceImplPort();
       Employee employee = webservice.getEmployeeById("1");
       System.out.println("Werknemer id: "+employee.getId());
       System.out.println("Werknemer naam: "+employee.getName());
    }
}
