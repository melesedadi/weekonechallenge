import java.util.Scanner;

public class Prompt {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String prompt = " ";
        System.out.println("You are in a creepy house toay. Would you like to go to (Kichen) or (Upstairs) or (Patio) or (Living Room) or (Basement): " );
                prompt = keyboard.nextLine();
        if (prompt.equalsIgnoreCase("Kichen")) {
            System.out.println("You choose " + prompt);
            System.out.println("Would you like to Open (refrigrator) or (Cabinet): ");
            prompt = keyboard.nextLine()
            if (prompt.equalsIgnoreCase("refrigrator"))
                System.out.println("Would lke to drink strange (milk) or eat (leftovers)");
                prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("milk"))
                        System.out.println("You choose to drink strange milk. Enjoy your milk");
                    else if (prompt.equalsIgnoreCase("leftovers")) ;
                        System.out.println("You choose to eat leftovers. Enjoy eating the leaftovers");
                    else
                    {System.out.println(" You di not chose the right choices. You are dying starvation")};

             else if (prompt.equalsIgnoreCase("cabinet"))
                System.out.println("You chose to open " +prompt);
                System.out.println("Would lke to eat can of (bean) or take a (plate)");
                prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("milk"))
                        System.out.println("You choose to eat " + prompt);
                        System.out.println("Enjoy eating " + prompt +".");
                        }
                    else if(prompt.equalsIgnoreCase("plate")) ;
                        System.out.println("You choose to take " +prompt + ". Enjoy your plate");
                        }
                    else{System.out.println(" You di not chose the right choices. You are dying starvation");
                            }
                    }
         else if (prompt.equalsIgnoreCase("upstairs"))
            System.out.println("You choose " + prompt);
            System.out.println("Would you like to Open (bedroom) or (bathroom): ");
            prompt = keyboard.nextLine()
            if (prompt.equalsIgnoreCase("bedroom"))
            System.out.println(" You choose to got to " + prompt + ".");
            System.out.println("Would you like to lay on (bed) or open the (drawer): ");
            prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("bed"))
                System.out.println("You choose to lay on the " +prompt + ". Enjoy taking a rest.");
                else if (prompt.equalsIgnoreCase("drawer")) ;
                System.out.println("You choose to open " + prompt +". Enjoy looking staffs in the drawer. Once done do not forget to close the " +prompt);
                else {System.out.println(" You did not give the right choices. Make the right selection");
        }   else if (prompt.equalsIgnoreCase("bathroom"))
                System.out.println("You choose " + prompt);
                System.out.println("Would you like to Open (bedroom) or (bathroom): ");
                prompt = keyboard.nextLine()
                    if (prompt.equalsIgnoreCase("bedroom"))
                    System.out.println(" You choose to got to " + prompt + ".");
                    System.out.println("Would you like to look in the (mirror) or use the (toilent): ");
                    prompt = keyboard.nextLine();
                        if (prompt.equalsIgnoreCase("mirror"))
                            System.out.println("You choose to look in the  " +prompt + ". Enjoy it.");
                        else if (prompt.equalsIgnoreCase("toilet")) ;
                        System.out.println("You got to the " + prompt +". Don't forget flashing the " +prompt + "use.");
                        else {System.out.println(" You did not give the right choices. Make the right selection");
                    System.out.println();

        else if (prompt.equalsIgnoreCase("patio"))
            System.out.println("You choose " + prompt);
            System.out.println("Would you like to Open (bedroom) or (bathroom): ");
            prompt = keyboard.nextLine()
                if (prompt.equalsIgnoreCase("bedroom"))
                System.out.println(" You choose to got to " + prompt + ".");
                System.out.println("Would you like to lay on (bed) or open the (drawer): ");
                prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("bed"))
                    System.out.println("You choose to lay on the " +prompt + ". Enjoy taking a rest.");
                    else if (prompt.equalsIgnoreCase("drawer")) ;
                    System.out.println("You choose to open " + prompt +". Enjoy looking staffs in the drawer. Once done do not forget to close the " +prompt);
                    else {System.out.println(" You did not give the right choices. Make the right selection");
                    }
        else if (prompt.equalsIgnoreCase("bathroom"))
            System.out.println("You choose " + prompt);
            System.out.println("Would you like to Open (bedroom) or (bathroom): ");
            prompt = keyboard.nextLine()
                if (prompt.equalsIgnoreCase("bedroom"))
                System.out.println(" You choose to got to " + prompt + ".");
                System.out.println("Would you like to look in the (mirror) or use the (toilent): ");
                prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("mirror"))
                    System.out.println("You choose to look in the  " +prompt + ". Enjoy it.");
                    else if (prompt.equalsIgnoreCase("toilet")) ;
                    System.out.println("You got to the " + prompt +". Don't forget flashing the " +prompt + "use.");
                    else {System.out.println(" You did not give the right choices. Make the right selection");
        System.out.println();
}
    }
}
