package Conditional_Statements_Demo.src;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        int dayNumber = 3;

        // Switch is useful when one variable is compared against many exact values.
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend or invalid day number");
        }
    }
}
