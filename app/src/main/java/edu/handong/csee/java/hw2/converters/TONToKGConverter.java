package edu.handong.csee.java.hw2.converters;

/**
 * A class of MILEToKMConverter converts TON to KG.
 */
public class TONToKGConverter implements Convertible {
    
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
 * convert TON to KG
 */
    public void convert(){
        retValue = 1000 * fromValue;
    }
}
