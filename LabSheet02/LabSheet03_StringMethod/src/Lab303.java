import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence;

		System.out.print("Input a sentence: ");
        sentence = scan.nextLine();
		while (true) {
            // ตรวจสอบว่าประโยคลงท้ายด้วย full stop
            if (sentence.endsWith(".")) {
                break; // ลงท้ายด้วย '.' ให้ออกจากลูป
            } 
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
        }

        // นับจำนวน spacebar
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // เป็นตัวอักษร(ไม่ใช่ช่องว่าง)
            if (ch != ' ' && ch != '.') {
                isWord = true;
            } else if ((ch == ' ' || ch == '.') && isWord) {
                // เมื่อเจอช่องว่างหรือจุดหลังจากคำ ให้เพิ่มตัวนับคำ
                wordCount++;
                isWord = false;
            }
        }
        
        // แสดงผลลัพธ์
        System.out.println("\nThis sentence has " + spaceCount + " spacebar.");
        System.out.println("This sentence has " + wordCount + " word.");

        scan.close();
    }
}

