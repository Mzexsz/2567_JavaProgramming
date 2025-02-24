import java.util.*;
public class ATMBanking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number (format 0-000-000-0): ");
        String accountNumber = scan.next();

        System.out.print("Enter password (4 digits): ");
        String password = scan.next();

        System.out.print("Enter initial balance (100, 500, 1000): ");
        int money = scan.nextInt();

        ATMChecking bank = new ATMChecking(accountNumber, password, money);
        bank.show();
	}

}
