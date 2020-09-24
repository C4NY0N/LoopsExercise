package org.horizoncolumbus.hs;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.println("Enter Number: ");
            numbers.add(input.nextInt());
        }

        for (double rootedNumber: numbers){
            rootedNumber = Math.sqrt(rootedNumber);
            System.out.print(rootedNumber);
        }


        }

}
