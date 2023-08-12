package mapServiceImpl;
import java.util.Scanner;
import mapEntity.EmployeeData;
import mapServiceRepo.EmployeeMapRepo;
import mapServices.EmployeeMapService;
public class EmployeeMapServiceImpl implements EmployeeMapService{
	@Override
	public int addEmployeeToMap(int employeeId, EmployeeData employeeData) {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.addEmployeeToMap(employeeId,employeeData);
	}
	@Override
	public boolean findEmployee(int empId) {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.findEmployee(empId);
	}
	@Override
	public int removeEmployeData(int empId) {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.removeEmployeData(empId);
	}
	@Override
	public EmployeeData getEmployeeData(int empId) {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.getEmployeeData(empId);
	}
	@Override
	public EmployeeData updateEmployeeData(int empId, Scanner userInput) {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.updateEmployeeData(empId,userInput);
	}
	@Override
	public int showAllEmployeesList() {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.showAllEmployeesList();
	}
	@Override
	public int sortEmployeeById() {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.sortEmployeeById();
	}
	@Override
	public int sortEmployeeByName() {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.sortEmployeeByName();
	}
	@Override
	public int sortEmployeeByAge() {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.sortEmployeeByAge();
	}
	@Override
	public int sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		return EmployeeMapRepo.sortEmployeeBySalary();
	}
}
