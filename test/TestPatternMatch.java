package test;

import io.tomiwa.algorithms.bruteforce.BruteForce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPatternMatch {
    BruteForce b;
    @Before
    public void init(){
         b = new BruteForce();

    }
    
    @Test
    public void testBruteforce(){
        String phrase = "I am in love with Tomiwa Ogunbamowo";
        int getLocation = b.findPosition(phrase, "Tomiwa");
        System.out.println("location at: "+ getLocation);
        Assert.assertEquals(phrase.indexOf("Tomiwa"), getLocation);
    }
    
    //TODO
//    @Test public void testfindPositionN(){
//        String phrase = "abaabaabaac";
//        int getLocation = b.findPositionN(phrase, "abaac");
//        System.out.println("Expected: "+ phrase.indexOf("abaac") + " | actual: "+getLocation);
//        Assert.assertEquals(phrase.indexOf("abaac"), getLocation);
//    }
    
    //TODO
//    @Test public void testfindPositionNNotFound(){
//        String phrase = "omiwa Ogunbamowo";
//        int getLocation = b.findPositionN(phrase, "Tomiwa");
//        System.out.println("location at: "+ getLocation);
//        Assert.assertEquals(phrase.indexOf("Tomiwa"), getLocation);
//    }
    //TODO        //TODO
//    @Test public void testfindPositionNTest(){
//        String phrase = "ababac";
//        int getLocation = b.findPositionN(phrase, "abac");
//        System.out.println("location at: "+ getLocation);
//        Assert.assertEquals(phrase.indexOf("abac"), getLocation);
//    }
    
    @Test public void testfindEveryPosition(){
        String phrase = "tom tom tom";
        String[] getLocation = b.findEveryPositionN(phrase, "tom");
        System.out.println("location at: "+ java.util.Arrays.toString(getLocation));
        Assert.assertEquals("048", String.join("", getLocation));
    }
    
    @Test public void testfindEveryPositionZero8(){
        String phrase = "tom boy tom";
        String[] getLocation = b.findEveryPositionN(phrase, "tom");
        System.out.println("location at: "+ java.util.Arrays.toString(getLocation));
        Assert.assertEquals("08", String.join("", getLocation));
    }
    
    @Test public void testfindEveryPositionZero(){
        String phrase = "tom tom tom";
        String[] getLocation = b.findEveryPositionN(phrase, "sure");
        System.out.println("location at: "+ java.util.Arrays.toString(getLocation));
        Assert.assertEquals("", String.join("", getLocation));
    }
}
