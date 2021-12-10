package org.example.javaTest.practicaTDD;

public class FizzBuzz {


    public String fizzBuzz(int num) {
        String srt = "";

        if(num % 3 == 0 && num % 5 == 0){
            srt = "FizzBuzz";
        } else if(num % 5 == 0){
            srt = "Buzz";
        } else if(num % 3 == 0){
            srt = "Fizz";
        } else {
            srt = String.valueOf(num);
        }

        return srt;
    }
}
