package io.tomiwa.algorithms;

public class SimpleUtils {

    public boolean stringToBoolean(String value) {
        return (value!=null &&  (value.equalsIgnoreCase("y") || value.equalsIgnoreCase("yes") || value
                .equals("true"))) ? true : false;
    }
}
