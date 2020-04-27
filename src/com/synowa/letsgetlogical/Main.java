package com.synowa.letsgetlogical;

public class Main {

    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        //if (rooms > 0 & students/rooms >30 ) //for & ti be true both sides must be true, so with rooms = 0 we have an error

        if (rooms > 0 && students/rooms >30 ) //now u can run the program, it didn't print message out, cause combined value of the test was false, so it didn't even test the right side, so there was no dividing by 0

            System.out.println("Crowded!");

	    System.out.println();
	    System.out.println("** end program**");

    }
}
