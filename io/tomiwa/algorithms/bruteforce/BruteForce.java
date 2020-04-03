package io.tomiwa.algorithms.bruteforce;


public class BruteForce {
    //Brute force implementation of a pattern matching algorithm
//Finds the location of a String in another string. Implementation of built-n indexOf method  in Java
    
    /*
     * Method Returns the position of SubString in String (indexOf).
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
     * Optimised version of the brute-force approach, using N Runtime and N Space
     */
   // TODO
//    public int findPositionN(String phrase, String pattern) {
//        java.util.HashMap<Integer,Character> map = new java.util.HashMap<>();
//        for (int i=0; i<pattern.length(); i++) map.put(i,pattern.charAt(i)); //Map position
//        
//        int position =0;
//        for (int i = 0; i < phrase.length(); i++) {
//            char currChar = phrase.charAt(i);
//            if (currChar == map.get(position)){
//                if (position==pattern.length()-1)return i-position;
//                position++;
//            }else{
//                i= getLongestPrefix(i-position+1, i,phrase,pattern );
//                System.out.println("longestSub: "+ i);
//                break;
////                position=0;
////                continue;   
//            }
//        }
//        return -1;
//    }
    
    //TODO
//    public int getLongestPrefix(int fromIndex, int lastIndex, String string, String pattern){
//        System.out.println("from:"+ fromIndex+ " lastIndex: "+ lastIndex);
//        string = string.substring(fromIndex, lastIndex+1);
//        
//        int result = string.indexOf(pattern );
//        return result;
//    }
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
