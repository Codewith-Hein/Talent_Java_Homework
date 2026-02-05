package com.talent.java.talent_java_homework.Day8HomeWork.homework1;

import java.util.ArrayList;

public class WrapperClass {

    public static int sumFunction(ArrayList<Integer> numbers){
        int sum=0;

        for(Integer num:numbers){
            sum+=num;
        }

        return sum;
    }

    public  static double averageFun(ArrayList<Integer> numbers){
        double avg=0;


      int calculateSum=sumFunction(numbers);

      avg= (double) calculateSum / numbers.size();

      return avg;

    }

    public static int findMinValue(ArrayList<Integer> numbers){
        int minValue=Integer.MAX_VALUE;

        for(Integer num:numbers){
            if(num <minValue){
                minValue=num;
            }

        }
        return  minValue;

    }

    public static int findMaxValue(ArrayList<Integer> numbers){
        int maxValue=Integer.MIN_VALUE;

        for(Integer num:numbers){
            if(num > maxValue){
                maxValue=num;
            }

        }

        return  maxValue;
    }



    public static void main(String[] args) {
        ArrayList<String> strValues = new ArrayList<>();

        strValues.add("10");
        strValues.add("20");
        strValues.add("abc");
        strValues.add("30");

        ArrayList<Integer> numValues = new ArrayList<>();

        for (String val : strValues) {
            try {
                Integer number=Integer.parseInt(val);
                numValues.add(number);

            } catch (NumberFormatException e) {
                System.out.println("Invalid value skipped: " + val);

            }
        }

        int calculateSum=sumFunction(numValues);
        System.out.println("Sum: " + calculateSum);

        double average=averageFun(numValues);
        System.out.println("average: "+ average);

        int minimumNum=findMinValue(numValues);
        System.out.println("minValue: "+ minimumNum);

        int maximumNum=findMaxValue(numValues);
        System.out.println("maxValue: "+ maximumNum);
    }
}
