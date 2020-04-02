package test;

import io.tomiwa.algorithms.euclid.Euclid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclidTest {
    Euclid euclid;
    @Before
    public void init() {
        euclid = new Euclid();
    }

    @Test
    public void TestEuclid() {

        Assert.assertEquals(5, euclid.calcGCD(20, 5));
        Assert.assertEquals(6, euclid.calcGCD(30, 12));
        Assert.assertEquals(1, euclid.calcGCD(807, 481));
        Assert.assertEquals(2, euclid.calcGCD(10, 2));
        Assert.assertEquals(2, euclid.calcGCD(22, 6));
    }

    @Test
    public void TestEuclidRec() {
        Euclid euclid = new Euclid();
        Assert.assertEquals(5, euclid.calcGCDRec(20, 5));
        Assert.assertEquals(6, euclid.calcGCDRec(30, 12));
        Assert.assertEquals(1, euclid.calcGCDRec(807, 481));
        Assert.assertEquals(2, euclid.calcGCDRec(10, 2));
        Assert.assertEquals(2, euclid.calcGCDRec(22, 6));
    }
    
    @Test
    public void testItVsRec(){
        Assert.assertEquals(euclid.calcGCD(182, 74), euclid.calcGCDRec(182, 74));
    }
}
