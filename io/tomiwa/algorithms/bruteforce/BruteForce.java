package io.tomiwa.algorithms.bruteforce;


public class BruteForce {
//Finds the location of a String in another string. Implementation of built-n Substring method  in Java
    
    /*
     * Method Returns the position of SubString in String.
     * @param phrase The full String
     * @param pattern substring to find.
     */
    public int findPosition(String phrase, String pattern) {
        for (int i = 0; i <= phrase.length()-pattern.length(); i++) {
            for (int j=0; j<pattern.length();j++){
                if (phrase.charAt(i+j)!= pattern.charAt(j)) break;
                if (j==pattern.length()-1)return i;
            }
        }
        return -1;
    }
    
    /*
     * Optimized version of the bruteforce approach, using N Runtime and N Space
     */
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
    
    /*
     * Finds positions of every occurrences of subString in the String.
     */
    public String[] findEveryPositionN(String phrase, String pattern) {
        java.util.ArrayList<String> result = new java.util.ArrayList<>();
        for (int i = 0; i <= phrase.length()-pattern.length(); i++) {
            for (int j=0; j<pattern.length();j++){
                if (phrase.charAt(i+j)!= pattern.charAt(j)) break;
                if (j==pattern.length()-1)result.add(Integer.toString(i));
            }
        }
        String [] convert = result.toArray( new String[result.size()]);
        return convert;
    }
}
