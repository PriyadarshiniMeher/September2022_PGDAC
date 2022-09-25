public class P7 {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = rows; i >= 1; i--) {
		// white spaces in the front of the numbers
		int numberOfWhiteSpaces = rows - i;

		//print leading white spaces
		System.out.print(" "+numberOfWhiteSpaces);

		//print character
		System.out.print(i+" "+i);

		//move to next line
		System.out.println("");
	}
  }
}