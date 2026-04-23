package Math_Class_Demo.src;

public class RandomAndConstantsDemo {

    public static void main(String[] args) {
        // Math.PI gives the value of pi.
        System.out.println("Value of PI = " + Math.PI);

        // Math.E gives the value of Euler's number.
        System.out.println("Value of E  = " + Math.E);

        // random returns a value between 0.0 and 1.0.
        double randomValue = Math.random();
        System.out.println("Random value = " + randomValue);

        // Example of generating a random number from 1 to 10.
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Random number from 1 to 10 = " + randomNumber);
    }
}
