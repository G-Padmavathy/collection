package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HackerRankTask {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        
        HashMap<String, String> phoneBook = new HashMap<>();

        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Query the phone book
        while (scanner.hasNext()) {
            String queryName = scanner.nextLine();
            String phoneNumber = phoneBook.get(queryName);
            
            if (phoneNumber != null) {
                System.out.println(queryName + "=" + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }

	}
	
	

}
