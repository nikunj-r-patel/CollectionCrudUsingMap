package mapServices;
import java.util.Scanner;
import mapEntity.EmployeeData;
public interface EmployeeMapService {
	public int addEmployeeToMap(int employeeId, EmployeeData employeeData);
	public boolean findEmployee(int empId);
	public int removeEmployeData(int empId);
	public EmployeeData getEmployeeData(int empId);
	public EmployeeData updateEmployeeData(int empId, Scanner userInput);
	public int showAllEmployeesList();
	public int sortEmployeeById();
	public int sortEmployeeByName();
	public int sortEmployeeByAge();
	public int sortEmployeeBySalary();

}
