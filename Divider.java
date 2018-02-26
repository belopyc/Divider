import java.util.Scanner;

public class Divider{

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
 	System.out.println("Divider ");
	System.out.println("Enter divident: ");
        int divident= in.nextInt();
	System.out.println("Enter divier: ");
        int divider = in.nextInt();
int result = divident % divider;
if(result > 0)
{
	System.out.println("False");
}
if(result == 0)
{
	System.out.println("True");
}
 	
	}
}