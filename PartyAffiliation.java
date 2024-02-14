import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PartyAffiliation {
    public static void main(String[] args)
    {
        /*
        class politicalParty
	        Main()
		        String politicalParty
		        output “Please enter your political party. (Democrat, Republican, or Independent”
		        input politicalParty
		        if politicalParty == Independent then
		        	output “You get an Independent Man”
		        else if politicalParty == Rebublican then
		        	output “You get a Republican Elephant”
		        else if politicalParty == Democrat then
		        	output “You get a Democratic Donkey”
		        else
		        	output “You are other: “ +politicalParty
	        return
        end class
         */

        System.out.print("Please enter your political party. (Democrat-D, Republican-R, Independent-I): ");

        Scanner in = new Scanner(System.in);

        String politicalParty;
        politicalParty = in.nextLine();
        politicalParty = politicalParty.toUpperCase();

        if(politicalParty.equals("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        } else if (politicalParty.equals("R"))
        {
            System.out.println("You get a Republic Elephant!");
        } else if (politicalParty.equals("I"))
        {
            System.out.println("You get a Independant Man!");
        } else
        {
            System.out.println("You are other!");
        }
    }
}