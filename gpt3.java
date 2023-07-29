// Control Flow

// Control flow is a concept that refers to the order in which the program's code executes.

/*
The Control Flow of a Java program is dictated by:
    - conditional statements
    - loops
    - function calls
 */

// Code Examples within gpt3 class - left off at if else
public class gpt3 {
    public static void main(String[] args) {
        
        // If Else Statements

        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }

        
        // Switch Statement
        
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // Cases for other days....
            default:
                System.out.println("Invalid day");
                break;
        }

        
        // For Loop

        for (int i =0; i <5; i++){
            System.out.println(i);
        }


        // While Loop

        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
    }
}
