package io.tomiwa.algorithms.bruteforce;

public class BruteForce {

    public int findPosition(String phrase, String pattern) {
        for (int i = 0; i <= phrase.length()-pattern.length(); i++) {
            for (int j=0; j<pattern.length();j++){
                if (phrase.charAt(i+j)!= pattern.charAt(j)) break;
                if (j==pattern.length()-1)return i;
            }
        }
        return -1;
    }
    
    public int findPositionN(String phrase, String pattern) {
        java.util.HashMap<Integer,Character> map = new java.util.HashMap<>();
        for (int i=0; i<pattern.length(); i++) map.put(i,pattern.charAt(i)); //Map position
        
        int position =0;
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = phrase.charAt(i);
            if (currChar == map.get(position)){
                if (position==pattern.length()-1)return i-position;
                position++;
            }else{
                position=0;
                continue;   
            }
        }
        return -1;
    }
}
