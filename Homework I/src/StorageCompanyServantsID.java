import java.util.Scanner;

public class StorageCompanyServantsID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input all you personal information for the storage of the company");
		
		System.out.println("Input your first and last name");
		Scanner name = new Scanner(System.in);
		String firstAndLastName = name.nextLine();
		System.out.println("Stored name:" + firstAndLastName);
		
		System.out.println("Input your current personal age");
		Scanner age = new Scanner(System.in);
		byte ageOfEmployee = age.nextByte();
		System.out.println("Stored cureent age:" + ageOfEmployee);
		
		System.out.println("Input your genre \"male or female\" ");
		Scanner gen = new Scanner(System.in);
		String genre = gen.nextLine();
		System.out.println("Stored genre" + genre);
		
		System.out.println("Input your Personal ID given you , from your country");
		Scanner id = new Scanner(System.in);
		BigDecimal iD = id.nextLine(); 
	}

}
