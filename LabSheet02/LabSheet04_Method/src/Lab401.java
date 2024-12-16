import javax.swing.*;
public class Lab401 {
	//กำหนดตัวแปรแบบ global variable คือสามารถใช้ตัวแปรได้ในทุกเมธอดที่ต้องการ
	static String varEmail;

	//main()
	public static void main(String[] args) {
		inputEmail();
	} //end of main() Method
	
	public static void inputEmail() {
		String ans = "";
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(varEmail != null && !varEmail.isEmpty()) { //ถ้าอีเมลไม่เป็นค่าว่าง ให้เรียกใช้เมธอดตรวจสอบอีเมล (ขึ้นต้นด้วย @ หรือมี spacebar?)
				checkEmailError(varEmail);
			}else { //ถ้าอีเมลที่รักมาเป็นค่าว่างให้แสดงข้อความ error
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!");
			}
			ans = JOptionPane.showInputDialog("Continue?(y||Y to continue)");
			
		}while(ans != null && ans.equalsIgnoreCase("y"));	
		
	} //end of inputEmail() Method

	
	//checkEmailError() Method
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-mail is "+email
				:"Your e-mail is not hotmail or gmail address."
		);
	} //end checkEmailError() Method
	
	// checkEmail() Method
	public static boolean checkEmail(String email) {
		
		/*if (email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}*/
		return email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
	}
}



