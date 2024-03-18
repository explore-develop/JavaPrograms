package scaler.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) throws IOException {
        Double principle;
        Double rate;
        Integer time;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Principle");
        principle = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Enter Rate");
        rate = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Enter Time");
        time = Integer.parseInt(bufferedReader.readLine());

        SimpleInterest simpleIntrest = new SimpleInterest();
        System.out.println("Your Simple Intrest is: " + simpleIntrest.calculateInterest(principle,rate,time));
    }

    private Double calculateInterest(Double principle, Double rate, Integer time){
        return principle*rate*time/100;
    }
}
