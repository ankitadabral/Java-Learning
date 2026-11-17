package loops_CondStatements;

public class conditionalStatements {
    public static void main(String[] args) {


        // IF, If else statement
        // Example - min marks = 33, age 20  if both the condition satisfies Pass him
        int age = 56;
        int marks = 63;

        if (age <= 18 && marks >= 35) {
            System.out.println("congratulations!!");
        } else {
            System.out.println("Better Luck next time");
        }

        // Example 2 - Write Hello World in If block and it should work every time
        if (true) {
            System.out.println("Hello World");
        }


        // else if
        //Example - marks >=90 - A grade , marks >=75 - B, marks >=60 - C
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("You are Fail");
        }


        // If else Ladder  || example
        int day = 7;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Teusday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }


        /* Switch Case - it is used when you want to execute different blocks of code based on the value of a variable.
break stops the switch after the matching case.
default runs when none of the cases match:
Note - we can use byte, short, char, int, string, Enum  data types with switch */

        switch (day) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Teusday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thrusday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid Day");
            }

        }


        // Example 2 of switch case with string value
        String fruit = "kiwi";

        switch (fruit) {
            case "Apple":
                System.out.println("It is an apple");
                break;
            case "Banana":
                System.out.println("It is a banana");
                break;
            case "kiwi":
                System.out.println("It is a kiwi");
                break;
            case "Cherry":
                System.out.println("It is a Cherry");
                break;
            default:
                System.out.println("Unknown fruit");
        }


        // Example 3 switch case
        int number = 1;

        switch (number) {
            case 1:
                //  break; by uncommenting it output will be nothing
            case 2:
            case 3:
                System.out.println("Number is 1, 2 or 3");
                break;
            case 4:
                System.out.println("Number is 4");
            default:
                System.out.println("Number is not 1, 2 ,3 or 4");
                break;
        }

    }
}
