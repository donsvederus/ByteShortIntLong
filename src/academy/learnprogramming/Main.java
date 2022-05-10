package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // this shows the min and max of an integer
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("----------");

        // this is show what happens when you go over the min or max
        System.out.println("Underflow Min Value = " + (myMinIntValue - 1));
        System.out.println("Overflow Max Value = " + (myMaxIntValue + 1));
        System.out.println("----------");

        // use underscores to separate numbers for easier reading.
        int myMaxInteger = 2_147_483_647;
        System.out.println("Underscores are removed: " + myMaxInteger);
        System.out.println("----------");
    }
}
