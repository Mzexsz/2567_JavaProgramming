public class TestSmartPhone {
    public static void main(String[] args) {
    
    SmartPhone phone = new SmartPhone();

    System.out.println("กำลังตั้งค่าข้อมูลสมาร์ทโฟนเริ่มต้น...");
    phone.setBrand("SmartMobile");
    phone.setModel("W1000");
    phone.setStorageCapacity(256);
    
    System.out.println("\nข้อมูลสมาร์ทโฟนเบื้องต้น:");
    phone.printDetails();

    System.out.println("\nเพิ่มความจุหน่วยความจำ 100 GB...");
    phone.increaseStorage(100);

    System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ 200 GB...");
    phone.increaseStorage(200);

    System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ -50 GB...");
    phone.increaseStorage(-50);

    System.out.println("\nคำนวณพึ้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 120 GB...");
    int remainingStorage = phone.getRemainingStorage(120);
    if (remainingStorage != -1) {
        System.out.println("พี้นที่ที่เหลือ: " + remainingStorage + " GB");
    }

    System.out.println("\nคำนวณพึ้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 500 GB...");
    phone.getRemainingStorage(500);

    System.out.println("\nตั้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกต้อง...");
    phone.setBrand("");
    phone.setModel("A");

    System.out.println("\nตั้งค่าความจุหน่วยความจำที่ไม่ถูกต้อง...");
    phone.setStorageCapacity(600);

    System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
    phone.printDetails();
    }
}