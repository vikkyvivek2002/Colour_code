import java.util.*;
public class Colour_code {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the colour code in upper case letters :");
		String  str = s.next();
		char coad = str.charAt(0);
		
		switch(coad)
		{
		case 'R':
			System.out.println("Red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'V':
			System.out.println("Violet");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'I':
			System.out.println("Indigo");
			break;
		default:
			System.out.println("Enter a valid colour code");
			
	}

}
}