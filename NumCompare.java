import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {

        /*
class compareInput
	Main()
		num firstNum
		num secondNum
		output “Give me a number”
		input firstNum
		output “Give me a second number”
		input secondNum
		if firstNum == secondNum then
			output “You entered the same number twice!”
		else if firstNum > secondNum then
			output “Your second number is less”
		else
			output “Your first number is less”
	return
end class
         */

        String firstTrash;
        String secondTrash;

        int firstNum;
        int secondNum;

        System.out.print("Give me a number: ");
        Scanner firstIn = new Scanner(System.in);

        if(firstIn.hasNextInt())
        {
            System.out.print("Give me another number: ");
            Scanner secondIn = new Scanner(System.in);

            if(secondIn.hasNextInt())
            {
                firstNum = firstIn.nextInt();
                secondNum = secondIn.nextInt();

                if(firstNum == secondNum)
                {
                    System.out.println("You entered the same number twice! " +firstNum);
                } else if(firstNum < secondNum)
                {
                    System.out.println("The first number you entered is less! " +firstNum +" < " +secondNum);
                } else
                {
                    System.out.println("The second number you entered is less! " +firstNum +" > " +secondNum);
                }
            } else
            {
                secondTrash = secondIn.nextLine();
                System.out.println("The second number you entered is not valid!");
            }
        } else
        {
            firstTrash = firstIn.nextLine();
            System.out.println("The first number you entered is not valid!");
        }
    }
}