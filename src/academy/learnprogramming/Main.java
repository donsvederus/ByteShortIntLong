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

        // min and max for Byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("----------");

        // min and max for Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("----------");

        // min and max for Long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("----------");

        // long values need an L on the end, or it will be treated as an int.
        long myLongValue = 1000L;
        long myMaxLong = 2_147_483_647_123L;
        System.out.println(myLongValue);
        System.out.println(myMaxLong);
        System.out.println("----------");

        // in this example int is ok
        int myTotal = (myMinIntValue / 2);

        // this is casting, converts a number to another type.
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("----------");
        System.out.println("Primitive Types Challenge");

        byte myByteValueNumber = 8;
        short myShortValueNumber = 300;
        int myIntValueNumber = 3942;
        long myLongValueNumber = 50000L + 10L * (myByteValueNumber + myShortValueNumber + myIntValueNumber);
        System.out.println(myLongValueNumber);

    }
}
