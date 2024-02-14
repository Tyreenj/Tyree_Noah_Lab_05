import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {

       /*
       class ifAge21
	        main()
		        num age
		        output “Please enter your age”
		        input age
		        if age >= 21 then
		        	output “You get a wristband!”
	        return
        end class
        */

        System.out.print("What is your age? ");

        Scanner in = new Scanner(System.in);
        String trash;

        int age;

        if(in.hasNextInt())
        {
            age = in.nextInt();

            if(age >= 21)
                System.out.println("You get a wristband!");

        } else
        {
            trash = in.nextLine();
            System.out.println("That is not a valid age! " +trash);
        }
    }
}

