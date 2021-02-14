import java.util.Scanner;

public class QuadraticEquation{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter value of b: ");
		double b = scanner.nextDouble();
		System.out.println("Enter value of c: ");
		double c = scanner.nextDouble();
		double discriminant;
		double root1;
		double root2;
		discriminant = Math.pow(b, 2)-4*a*c;
		if(discriminant >= 0){
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			if(root1==root2){
				System.out.println("The roots are equal");
				System.out.println("The value is: " +root1);
			}
			else{
				System.out.println("Root1 is: "+root1);
				System.out.println("Root2 is: "+root2);
			}
		}
		else{
			System.out.println("There are no real roots");
		}
		

    }

}