package mapEntity;
import java.util.HashSet;
public class EmployeeData {
	private String empName;
	private int empAge;
	private double empSalary;
	private String empJoinDate;
	private HashSet<String> empSkills;
	public EmployeeData(String empName, int empAge, double empSalary, String empJoinDate, HashSet<String> empSkills) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empJoinDate = empJoinDate;
		this.empSkills = empSkills;
	}
	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public HashSet<String> getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(HashSet<String> empSkills) {
		this.empSkills = empSkills;
	}
	@Override
	public String toString() {
		return "EmployeeData [empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + ", empJoinDate="
				+ empJoinDate + ", empSkills=" + empSkills + "]";
	}
}
