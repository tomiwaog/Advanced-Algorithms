package test;

import io.tomiwa.algorithms.SimpleUtils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {

    SimpleUtils utils;
    @Before
    public void init(){
        utils = new SimpleUtils();
    }
    @Test
    public void StringToBooleanTrueTest(){
        boolean result = utils.stringToBoolean("Y");
        Assert.assertTrue(utils.stringToBoolean("YeS"));
        Assert.assertTrue(result);
    }
    
    @Test
    public void StringToBooleanFalseTest(){
        boolean result = utils.stringToBoolean("no");
        Assert.assertFalse(result);
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean(null));
    }
   

}
