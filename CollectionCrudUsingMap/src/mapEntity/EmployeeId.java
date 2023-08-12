package mapEntity;
public class EmployeeId {
	private int empId;

	public EmployeeId(int empId) {
		super();
		this.empId = empId;
	}
	public EmployeeId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeId other = (EmployeeId) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public String toString() {
		return "EmployeeId [empId=" + empId + "]";
	}
}
