package mapController;
import java.util.HashSet;
import java.util.Scanner;
import mapEntity.EmployeeData;
import mapServiceImpl.EmployeeMapServiceImpl;
import mapServices.EmployeeMapService;
import mapUtility.AddSkills;
import mapUtility.Menu;

public class EmployeeMapController {
	public static void main(String[] args) {
		EmployeeMapService empMapService = new EmployeeMapServiceImpl();
		Scanner userInput = new Scanner(System.in);
		Menu menuOfOperations = new Menu();
		int choiceOfOperation = 7;
		do {
			menuOfOperations.menu();
			choiceOfOperation = userInput.nextInt();
			switch (choiceOfOperation) {
			case 1:
				System.out.println("please enter datas of the employee as below ");
				System.out.println("enter Employee ID");
				int empId = userInput.nextInt();
				System.out.println("enter Employee NAME");
				String empName = userInput.next();
				System.out.println("enter Employee AGE");
				int empAge = userInput.nextInt();
				System.out.println("enter Employee SALARY");
				double empSalary = userInput.nextDouble();
				System.out.println("enter Employee JOINDATE");
				String empJoinDate = userInput.next();
				System.out.println("enter Employee Skills");
				AddSkills addSkills = new AddSkills();
				HashSet<String> empSkills = addSkills.getSkills();
				EmployeeData employeeData = new EmployeeData(empName, empAge, empSalary, empJoinDate, empSkills);
				empMapService.addEmployeeToMap(empId, employeeData);
				System.out.println("employee" + empId + " is added in MAP");
				break;
			case 2:
				System.out.println("enter the employee id you want to remove");
				int empIdToRemove = userInput.nextInt();
				empMapService.removeEmployeData(empIdToRemove);
				break;
			case 3:
				System.out.println("enter the employee id you want to update");
				int empIdToUpdate = userInput.nextInt();
				empMapService.updateEmployeeData(empIdToUpdate, userInput);
				break;
			case 4:
				System.out.println("enter the employee id you want to find");
				int empIdToFind = userInput.nextInt();
				empMapService.getEmployeeData(empIdToFind);
				break;
			case 5:
				empMapService.showAllEmployeesList();
				break;
			case 6:
				int selectSortingOption = 5;
				System.out.println("select the sorting operation as below");
				System.out.println("1 to sort by Id(keys)");
				System.out.println("2 to sort by name");
				System.out.println("3 to sort by age");
				System.out.println("4 to sort by salary");
				Scanner sortingOption = new Scanner(System.in);
				selectSortingOption = sortingOption.nextInt();
				switch (selectSortingOption) {
				case 1:
					empMapService.sortEmployeeById();
					break;
				case 2:
					empMapService.sortEmployeeByName();
					break;
				case 3:
					empMapService.sortEmployeeByAge();
					break;
				case 4:
					empMapService.sortEmployeeBySalary();
					break;
				default:
					System.out.println("there are no other sorting methods only 1,2,3");
					break;
				}
				break;
			case 7:
				System.out.println("thank you!! for using me.....");
				break;
			default:
				System.out.println(" Please select the operations as given above");
				break;
			}
		} while (choiceOfOperation != 7);
	}
}
