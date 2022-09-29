import java.util.Scanner;
public class ChatBotRunner {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);

        //use of greeting
        ChatBot chatBot1 = new ChatBot("Debbie", 2);
        chatBot1.greeting("Bonnie");
        System.out.println();

        //use of weather
        System.out.println("I'm good! How's the weather today?");
        System.out.println();
        chatBot1.weather();
        System.out.println();

        //use of favoriteNumbers
        chatBot1.favoriteNumber(4);
        System.out.println();

        //use of convertFeetToMeters
        System.out.println("Pick a number 1-20 in feet: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println();

        System.out.println(num + " feet converted into meters is " + chatBot1.convertFeetToMeters(num));
        System.out.println();

        //use of addNumbers
        System.out.println("Pick an integer value from 1-100: ");
            int num1 = scan.nextInt();
            scan.nextLine();
        System.out.println("Pick a second integer value from 1-100: ");
            int num2 = scan.nextInt();
            scan.nextLine();
        System.out.println("Pick a final integer value from 1-100: ");
            int num3 = scan.nextInt();
            scan.nextLine();

        System.out.println();
        System.out.println(num1 + " plus " + num2 + " plus " + num3 + " equals: " + chatBot1.addNumbers(num1,num2,num3));
        System.out.println();

        //use of goodbye
        System.out.println(chatBot1.goodbye());

    }
}
