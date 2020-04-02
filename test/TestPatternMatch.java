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
    
    @Test public void testfindPositionN(){
        String phrase = "Tomiwa Ogunbamowo";
        int getLocation = b.findPositionN(phrase, "Tomiwa");
        System.out.println("location at: "+ getLocation);
        Assert.assertEquals(phrase.indexOf("Tomiwa"), getLocation);
    }
    
    @Test public void testfindPositionNNotFound(){
        String phrase = "omiwa Ogunbamowo";
        int getLocation = b.findPositionN(phrase, "Tomiwa");
        System.out.println("location at: "+ getLocation);
        Assert.assertEquals(phrase.indexOf("Tomiwa"), getLocation);
    }
    
    @Test public void testfindEveryPosition(){
        String phrase = "tom tom tom";
        String[] getLocation = b.findEveryPositionN(phrase, "tom");
        System.out.println("location at: "+ java.util.Arrays.toString(getLocation));
        Assert.assertEquals("048", String.join("", getLocation));
    }
}
