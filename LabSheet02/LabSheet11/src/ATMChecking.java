import java.io.IOException;
import java.text.DecimalFormat;

class ATMChecking extends ATMData {
    private int money;

    public ATMChecking(String accountNumber, String password, int money) {
        super(accountNumber, password);
        this.money = money;
    }

    public boolean checkBookBank() {
        return money >= 1000;
    }

    public void show() throws IOException {
        if(!checkBookBank()) {
        	System.out.println("Sorry, your ID or password is word, or your amount is not enough.");
        	return;
        }
        DecimalFormat format = new DecimalFormat("#,###.00");
        int thousands = money / 1000;
        int fiveHundreds = (money % 1000) / 500;
        int hundreds = (money % 500) /100;
        System.out.printf("Your drawing for %s, get:%n",format.format(money));
        System.out.printf("\t1000 = %d%n", thousands);
        System.out.printf("\t500 = %d%n", fiveHundreds);
        System.out.printf("\t100 = %d%n", hundreds);
        System.out.printf("Your balance is %s Baht.%n", format.format(balance - money));
    }
}
