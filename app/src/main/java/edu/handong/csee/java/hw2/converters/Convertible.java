package edu.handong.csee.java.hw2.converters;
/**
 * A interface of Convertible provides setter, getter and convert function.
 */
public interface Convertible {
/**
 * set the value to be converted
 * @param fromValue value you want to convert
 */
    public void setFromValue(double fromValue);
/**
 * get the converted value
 * @return returns the converted value
 */
    public double getConvertedValue();
/**
 * convert the value 
 */
    public void convert();

}