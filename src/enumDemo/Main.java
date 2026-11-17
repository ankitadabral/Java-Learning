package enumDemo;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        // Enum constant MONDAY is an object (instance) of the Day enum.

        int ordinal = monday.ordinal();
        // ordinal() returns the position/index of the enum constant starting from 0.

        System.out.println(ordinal);

        System.out.println(monday.name());
        // name() returns the exact name of the enum constant as a String.

        System.out.println(monday.toString());
        // toString() returns the name of the enum constant as a String by default.

        Day enumDay = Day.valueOf("MONDAY");
        // valueOf() converts a String into its corresponding enum constant.

        System.out.println(enumDay);

        Day[] values = Day.values();
        // values() returns all enum constants in their declaration order.

        for (Day i : values) {
            System.out.println(i);
        }

        monday.display();// method run

        System.out.println(monday.getLower());
        System.out.println(monday.getHindi());


        // We can also use SWITCH case with ENUMS
        Day day = Day.MONDAY;

        switch(day){
            case MONDAY: {
                System.out.println("Today is monday");
                break;
            }
            case TEUSDAY:{
                System.out.println("Today is teusday");
                break;
            }
            default:{
                System.out.println("Weekend");
            }
        }

    }
}