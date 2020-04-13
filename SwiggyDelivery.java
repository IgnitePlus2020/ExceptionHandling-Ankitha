package com.tgt.ignite;

import java.util.ArrayList;
import java.util.Scanner;

public class SwiggyDelivery {
    static ArrayList<Integer> a = new ArrayList<>();

    public static void validateCode(int test) throws InvalidDeliveryException{
        for(int i =0;i<a.size();i++){
            if(test == a.get(i)) throw new InvalidDeliveryException("No delivery option");
            }
        System.out.println("The Delivery option for the zipcode is valid");
        }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        a.add(123);
        a.add(456);
        a.add(789);
        System.out.println("Enter your Zip Code");
        int test = input.nextInt();
        try{
            validateCode(test);
        }
        catch( Exception m){
            System.out.println("The zipcode has "+m);
        }
    }
}

class InvalidDeliveryException extends Exception{
    InvalidDeliveryException(String s ){
        super(s);
    }

}

/*Output:
Enter your Zip Code
145
The Delivery option for the zipcode is valid

Enter your Zip Code
123
The zipcode has com.tgt.ignite.InvalidDeliveryException: No delivery option

Process finished with exit code 0

 */