import java.util.Scanner;
public class P10
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++){
			for (int j = 5-1; j>=i; j--){
				System.out.print(" ");
			}
			for (int p = 1; p <= 5; p++){
				System.out.print("*");
			}
		System.out.println();
		}
    }
}