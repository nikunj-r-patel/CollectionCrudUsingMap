package mapUtility;

import java.util.Comparator;
import java.util.Map.Entry;

import mapEntity.EmployeeData;

public class SortEmpsByAge implements Comparator<Entry<Integer,EmployeeData>>{

	@Override
	public int compare(Entry<Integer, EmployeeData> o1, Entry<Integer, EmployeeData> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getEmpAge()-o2.getValue().getEmpAge();
	}

}
