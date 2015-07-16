import java.util.Scanner;

public class StorageCompanyServantsID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input all you personal information for the storage of the company");
		
		System.out.println("Input your first and last name");
		Scanner input = new Scanner(System.in);
		String firstAndLastName = input.nextLine();
		System.out.println("Stored name:" + firstAndLastName);
		
		System.out.println("Input your current personal age");
		byte ageOfEmployee = input.nextByte();
		System.out.println("Stored cureent age:" + ageOfEmployee);
		
		System.out.println("Input your genre \"male or female\" ");	
		String genre = input.nextLine();
		System.out.println("Stored genre" + genre);
		
		System.out.println("Input your Personal ID given you , from your country");	
		long ID = input.nextLong();
		System.out.println("Stored ID:" + ID);
		
		System.out.println("Input your phone number");	
		long number = input.nextLong();
		System.out.println("Stored phone number" + number);
		
		
		input.close();
		
		
	}

}
