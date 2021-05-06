package edu.handong.csee.java.hw2.converters;

/**
 * A class of KMToMILEConverter converts KM to MILE.
 */
public class KMToMILEConverter implements Convertible {
    private double fromValue;
    private double retValue;

/**
 * set the value to be converted
 * @param fromValue value you want to convert
 */
    public void setFromValue(double fromValue){
        this.fromValue = fromValue;
    }
/**
 * get the converted value
 * @return returns the convered value
 */
    public double getConvertedValue(){
        return retValue;
    }
/**
 * convert KM to MILE
 */
    public void convert(){
        retValue = fromValue/1.6;
    }
}