import java.util.*;
import java.io.*;
public class EmployeeInfo {
	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		System.out.print("Insert or Read data?:");
		String choose = console.next().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("read")) {
			System.out.print("Please text insert or read data?:");
			choose = console.next().toLowerCase();
		} //end while
		
		//สร้าง object เพื่อเรียกใช้ class SaveandOpen
		SaveandOpen objFile = new SaveandOpen();
		if(choose.equals("insert")) {
			objFile.insert();			
		}else { 
			//ใช้สำหรับการค้นหาข้อมูลแผนกที่ต้องการ
			System.out.print("\nEnter dept : "); 
			String dept = console.next();
			objFile.setDept(dept);
			objFile.searchData();
		}		
	}
}