package com.mountain.numbershapes;

public class Number {
    int number;


    public boolean isTriangular(){
        int i = 1;
        int triangularNumber = 1;

        while (triangularNumber < number){
            i++;
            triangularNumber = triangularNumber + i;
        }
        if (triangularNumber == number){
            return true;
        }else{
            return false;
        }

    }
    public boolean isSquare(){
        int i=1;
        int sq = 1;

        while(sq < number){
            sq = i*i;
            i++;
        }
        if (sq == number){
            return true;
        }
        else {
            return false;
        }
    }



}
