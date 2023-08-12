package mapEntity;
import java.util.ArrayList;
public class Skills {
	private ArrayList<String> empSkills;
	public Skills(ArrayList<String> empSkills) {
		super();
		this.empSkills = empSkills;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<String> getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(ArrayList<String> empSkills) {
		this.empSkills = empSkills;
	}
	@Override
	public String toString() {
		return "Skills [empSkills=" + empSkills + "]";
	}
}
