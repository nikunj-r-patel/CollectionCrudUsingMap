package mapUtility;
import java.util.HashSet;
import java.util.Scanner;
public class AddSkills {
	Scanner sC = new Scanner(System.in);
	public HashSet<String> getSkills() {
		HashSet<String> arrStr = new HashSet<String>();
		System.out.println("add multiple skills using enter for next skill");
		System.out.println("enter empty string when you want to stop");
		boolean flag = true;
		while (flag) {
			String strIn = sC.nextLine();
			if (strIn.isEmpty()) {
				flag = false;
			}
			arrStr.add(strIn);
		}
		return arrStr;
	}
}
