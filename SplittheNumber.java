package Assessment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SplittheNumber {


	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SplittheNumber.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(" ");
			long result = 0;
			if (words[1].contains("+")) {
				String[] splitted = words[1].split("\\+");
				result = Long.parseLong(words[0].substring(0, splitted[0].length()))
						+ Long.parseLong(words[0].substring(splitted[0].length()));
			} else if (words[1].contains("-")) {
				String[] splitted = words[1].split("-");
				result = Long.parseLong(words[0].substring(0, splitted[0].length()))
						- Long.parseLong(words[0].substring(splitted[0].length()));
			}
			System.out.println(result);
		}
	}
}
