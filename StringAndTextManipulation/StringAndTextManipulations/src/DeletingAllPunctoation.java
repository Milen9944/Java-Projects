import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DeletingAllPunctoation {

	public static void main(String[] args) {
		
		String text = readFile("informationAboutOraclesGenius.txt");
		String[] splitText = text.split("[\\p{Punct}\\s]+");
		writeFile("newInformation.AboutOraclesGenius.txt", splitText);
	}

	public static String readFile(String path) {
		StringBuilder sb = new StringBuilder();
		try {

			FileReader fileReader = new FileReader(path);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				sb.append(line);
			}

			bufferedReader.close();

		} catch (Exception e) {
			System.out.println("Error reading.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return sb.toString();
	}

	public static void writeFile(String path, String[] arr) {
		try {

			FileWriter fileStream = new FileWriter(path);

			BufferedWriter writer = new BufferedWriter(fileStream);

			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i] + " ");
			}
			writer.close();

		} catch (Exception e) {
			System.out.println("Error writing");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

}
