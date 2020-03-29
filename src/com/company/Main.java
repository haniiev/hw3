package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String numa = reader.readLine();
        int num1 = Integer.parseInt(numa);
        String numb = reader.readLine();
        int num2 = Integer.parseInt(numb);
        String numc = reader.readLine();
        int num3 = Integer.parseInt(numc);
        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0){
           System.out.println("3");
        }
        if ((num1 % 2 == 0 & num2 % 2 == 0) || (num2 % 2 == 0 & num3 % 2 == 0) || (num1 % 2 == 0 & num3 % 2 == 0)){
          System.out.println("2");
        }
        if (num1 % 2 == 0 | num2 % 2 == 0 | num3 % 2 == 0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
