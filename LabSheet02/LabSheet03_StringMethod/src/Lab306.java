import java.util.Scanner;
public class Lab306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        // รับข้อความจากผู้ใช้งาน
        System.out.print("Message: ");
        String message = scan.nextLine();

        // ตรวจสอบว่ามีคำว่า "Nichi" หรือไม่ (ไม่สนใจตัวพิมพ์เล็ก/ใหญ่)
        if (message.toLowerCase().indexOf("nichi") >= 0) {
            System.out.println("Nichi is a sentence");
        } else {
            System.out.println(message);
        }

        scan.close();
    }

}
