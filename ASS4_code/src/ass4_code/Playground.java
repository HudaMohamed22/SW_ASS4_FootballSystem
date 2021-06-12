

package ass4_code;

import java.util.*;
/**
 * @author Huda,Samah,Aya
 * @Version 1.0
 * @since 12 june 2021
 */

public class Playground {

private boolean ActivateState =true;
private String name  ;
private String location  ;
private String size  ;
private ArrayList<Integer> availablehours ;
private Float priceperhour  ;
private Float cancellationperiod  ;

    /**
     *
     * default constructor
     */
    public Playground(){
        this.availablehours=new ArrayList<>();
        
    }

    /**
     *
     * @param name of play ground
     * @param location of play ground
     * @param size of play ground
     * @param availablehours of play ground
     * @param priceperhour of play ground
     * @param cancellationperiod of play ground
     */
    public Playground (String name ,String location ,String size ,ArrayList<Integer> availablehours ,Float priceperhour,
                       Float cancellationperiod )
{
    this.availablehours=new ArrayList<>();
    this.name=name;
    this.location=location;
    this.size=size;
    this.cancellationperiod=cancellationperiod;
    for(int i=0 ;i<availablehours.size();i++)
    {
        this.availablehours.add(availablehours.get(i));
    }
    this.priceperhour=priceperhour;
    
}

    /**
     *
     * @return  boolean activateState
     */
    public boolean isActivateState() {
        return ActivateState;
    }

    /**
     *setter
     * @param ActivateState
     */
    public void setActivateState(boolean ActivateState) {
        this.ActivateState = ActivateState;
    }

    /**
     *getter
     * @return name of playGround
     */
    public String getName() {
        return name;
    }

    /**
     *setter
     * @param name of playground
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return location of playground
     */
    public String getLocation() {
        return location;
    }

    /**
     *setter
     * @param location of playground
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return string size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size of playground
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return  Array integer of available hours
     */
    public ArrayList<Integer> getavailablehours() {
        return availablehours;
    }

    /**
     *setter
     * @param privateavailablehours
     */
    public void setavailablehours(ArrayList<Integer> privateavailablehours) {
        this.availablehours = privateavailablehours;
    }

    /**
     *getter
     * @return float pricePerHour
     */
    public Float getPriceperhour() {
        return priceperhour;
    }

    /**
     *
     * @param priceperhour
     */
    public void setPriceperhour(Float priceperhour) {
        this.priceperhour = priceperhour;
    }

    /**
     *
     * @return Float cancellation period
     */
    public Float getCancellationperiod() {
        return cancellationperiod;
    }

    /**
     *setter
     * @param cancellationperiod
     */
    public void setCancellationperiod(Float cancellationperiod) {
        this.cancellationperiod = cancellationperiod;
    }
    
}

