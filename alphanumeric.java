package abhibookabhidelete.abc.com;

public class Practice1 {

	public static void main(String[] args) {
		String s = "A4B3C2";
		for (int i = 0; i < s.length(); i = i + 2) {
			int index = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
			int j = 0;
			while (j < index) {
				j++;
				System.out.println(s.charAt(i));

			}
		}
	}

}
