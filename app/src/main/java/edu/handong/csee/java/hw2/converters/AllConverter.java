package edu.handong.csee.java.hw2.converters;
/**
 * A class of AllConverter converts KM to M and MILE at the same time or TON to KG and G at the same time.
 */
public class AllConverter {
    private double fromValue;
    private String originalMeasure;
/**
 * set the value to be converted
 * @param fromValue value you want to convert
 * @return returns the current object 
 */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }
/**
 * set the original measure of value
 * @param originalMeasure unit of value to be convered
 * @return returns the current object
 */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    }
/**
 * convert KM to M and MILE at the same time or TON to KG and G at the same time and print out the result.
 */
    public void convertAndPrintOut(){
       // System.out.println("originalMeasure: "+originalMeasure);
        if(originalMeasure.equals("KM"))
        {
            System.out.println(fromValue+" KM to "+ 1000*fromValue + " M");
            System.out.println(fromValue+" KM to "+ fromValue/1.6 + " MILE");
        }
        else if (originalMeasure.equals("TON"))
        {
            System.out.println(fromValue+" TON to "+ 1000*fromValue + " KG");
            System.out.println(fromValue+" TON to "+ 1000*1000*fromValue + " G");
        }else
        {
            System.out.println("AllConverter cannot support the measure!");
        }
    }


}
