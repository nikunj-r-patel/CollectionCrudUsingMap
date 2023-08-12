package mapUtility;

import java.util.Comparator;
import java.util.Map.Entry;

import mapEntity.EmployeeData;

public class SortEmpsBySalary implements Comparator<Entry<Integer,EmployeeData>> {

	@Override
	public int compare(Entry<Integer, EmployeeData> o1, Entry<Integer, EmployeeData> o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getValue().getEmpSalary()-o2.getValue().getEmpSalary());
	}

}
