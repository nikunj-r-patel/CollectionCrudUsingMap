package mapServiceRepo;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Map.Entry;
import mapEntity.EmployeeData;
import mapUtility.AddSkills;
import mapUtility.SortEmpsByAge;
import mapUtility.SortEmpsByName;

public class EmployeeMapRepo {
	static Map<Integer, EmployeeData> empMap = new LinkedHashMap<Integer, EmployeeData>();
	EmployeeData employeeData = new EmployeeData();
	public static int addEmployeeToMap(int employeeId, EmployeeData employeeData) {
		// TODO Auto-generated method stub
		if (empMap.put(employeeId, employeeData) == null) {
			System.out.println("employee " + employeeId + "is unique Key");
		} else {
			System.err.println("key " + employeeId + "was allready in Map and replaced latest values");
		}
		return 0;
	}
	public static boolean findEmployee(int empId) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, EmployeeData> iterationToFind : empMap.entrySet()) {
			if (iterationToFind.getKey() == empId) {
				return true;
			}
		}
		return false;
	}
	public static int removeEmployeData(int empId) {
		// TODO Auto-generated method stub
		int keyToRemove = 0;
		for (Map.Entry<Integer, EmployeeData> iterationToRemove : empMap.entrySet()) {
			if (iterationToRemove.getKey() == empId) {
				keyToRemove = iterationToRemove.getKey();
			}
		}
		if (empMap.remove(keyToRemove) != null) {
			System.out.println("the employee " + empId + " is removed from MAP");
		} else {
			System.out.println("the key " + empId + " is not in MAP");
		}
		return 0;
	}
	public static EmployeeData getEmployeeData(int empId) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, EmployeeData> iterationToRemove : empMap.entrySet()) {
			if (iterationToRemove.getKey() == empId) {
				System.out.println("Key: " + iterationToRemove.getKey());
				System.out.println(" Value: "+ iterationToRemove.getValue());
			}
		}
		return null;
	}
	public static EmployeeData updateEmployeeData(int empId, Scanner userInput) {
		// TODO Auto-generated method stub

		if (findEmployee(empId)) {
			EmployeeData employeeDataUpdate = getEmployeeData(empId);
			System.out.println("Please enter all new data to be updated of " + empId);
			System.out.println("enter New Employee NAME");
			String empNameNew = userInput.next();
			System.out.println("enter New Employee AGE");
			int empAgeNew = userInput.nextInt();
			System.out.println("enter New Employee SALARY");
			double empSalaryNew = userInput.nextDouble();
			System.out.println("enter New Employee JOINDATE");
			String empJoinDateNew = userInput.next();
			System.out.println("enter New Employee Skills");
			AddSkills addSkills = new AddSkills();
			HashSet<String> empSkills = addSkills.getSkills();
			System.out.println(empNameNew);
			System.out.println(empAgeNew);
			System.out.println(empSalaryNew);
			System.out.println(empJoinDateNew);
			System.out.println(empSkills);
			employeeDataUpdate.setEmpName(empNameNew);
			employeeDataUpdate.setEmpAge(empAgeNew);
			employeeDataUpdate.setEmpSalary(empSalaryNew);
			employeeDataUpdate.setEmpJoinDate(empJoinDateNew);
			employeeDataUpdate.setEmpSkills(empSkills);
			System.out.println("the data of employee " + empId + " is updated in MAP");
		} else {
			System.out.println("the  employee " + empId + " is not in MAP");
		}
		return null;
	}
	public static int showAllEmployeesList() {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, EmployeeData> iterationToShow : empMap.entrySet()) {
			System.out.println("Key: " + iterationToShow.getKey());
			System.out.println(" Value: " + iterationToShow.getValue());
		}
		return 0;
	}
	public static int sortEmployeeById() {
		// TODO Auto-generated method stub
		TreeMap<Integer, EmployeeData> sortedById = new TreeMap<Integer, EmployeeData>(empMap);
		Set<Entry<Integer, EmployeeData>> mappingOfSortedById = sortedById.entrySet();
		for (Entry<Integer, EmployeeData> dataSortedById : mappingOfSortedById) {
			System.out.println("Key: " + dataSortedById.getKey());
			System.out.println(" Value: " + dataSortedById.getValue());
		}
		return 0;
	}
	public static int sortEmployeeByName() {
		// TODO Auto-generated method stub
		List<Entry<Integer, EmployeeData>> arrEmpSortName = new LinkedList<Entry<Integer, EmployeeData>>(
				empMap.entrySet());
		SortEmpsByName sortNames = new SortEmpsByName();
		Collections.sort(arrEmpSortName, sortNames);
		Map<Integer, EmployeeData> sortedByNameMap = new LinkedHashMap<Integer, EmployeeData>();
		for (Entry<Integer, EmployeeData> entrySortedByName : arrEmpSortName) {
			sortedByNameMap.put(entrySortedByName.getKey(), entrySortedByName.getValue());
		}
		for (Entry<Integer, EmployeeData> dataSortedByName : arrEmpSortName) {
			System.out.println("Key: " + dataSortedByName.getKey());
			System.out.println(" Value: "+ dataSortedByName.getValue());
		}
		return 0;
	}
	public static int sortEmployeeByAge() {
		// TODO Auto-generated method stub
		List<Entry<Integer, EmployeeData>> arrEmpSortAge = new LinkedList<Entry<Integer, EmployeeData>>(
				empMap.entrySet());
		SortEmpsByAge sortAges = new SortEmpsByAge();
		Collections.sort(arrEmpSortAge, sortAges);
		Map<Integer, EmployeeData> sortedByAgeMap = new LinkedHashMap<Integer, EmployeeData>();
		for (Entry<Integer, EmployeeData> entrySortedByAge : arrEmpSortAge) {
			sortedByAgeMap.put(entrySortedByAge.getKey(), entrySortedByAge.getValue());
		}
		for (Entry<Integer, EmployeeData> dataSortedByAge : arrEmpSortAge) {
			System.out.println("Key: " + dataSortedByAge.getKey());
			System.out.println(" Value: " + dataSortedByAge.getValue());
		}
		return 0;
	}
	public static int sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		Map<Integer, EmployeeData> sortedBySalaryMapStream = empMap.entrySet().stream()
				.sorted(Entry.comparingByValue((o1, o2) -> (int) (o1.getEmpSalary() - o2.getEmpSalary())))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//		List<Entry<Integer,EmployeeData>> arrEmpSortSalary=new LinkedList<Entry<Integer,EmployeeData>>(empMap.entrySet());
//		SortEmpsByAge sortSalarys= new SortEmpsByAge();
//		Collections.sort(arrEmpSortSalary, sortSalarys);
//		Map<Integer, EmployeeData> sortedBySalaryMap=new LinkedHashMap<Integer, EmployeeData>();
//		for (Entry<Integer, EmployeeData> entrySortedBySalary : arrEmpSortSalary) {
//			sortedBySalaryMap.put(entrySortedBySalary.getKey(), entrySortedBySalary.getValue());
//		}
		for (Entry<Integer, EmployeeData> dataSortedBySalary : sortedBySalaryMapStream.entrySet()) {
			System.out.println("Key: " + dataSortedBySalary.getKey());
			System.out.println(" Value: "+ dataSortedBySalary.getValue());
		}
		return 0;
	}
}
