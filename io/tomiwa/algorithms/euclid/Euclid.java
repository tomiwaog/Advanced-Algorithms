package io.tomiwa.algorithms.euclid;

public class Euclid {
    public int calcGCD(int number , int divisor){ 

        while(number%divisor!=0){
            int remainder = number%divisor;
            number = divisor;
            divisor = remainder;
        }
        return divisor;
       
    }
    
    public int calcGCDRec(int number , int divisor){
        if (number % divisor ==0) return divisor;
        return calcGCDRec(divisor, number%divisor);
    }
}
