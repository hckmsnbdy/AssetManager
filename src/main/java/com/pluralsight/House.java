package com.pluralsight;

public class House extends Asset{
    String address;
    int condition ; // (1 -excellent, 2 -good, 3 -fair, 4 -poor)
    int squareFoot;
    int lotSize;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }
    public int getSquareFoot() {
        return squareFoot;
    }
    public void setSquareFoot(int squareFoot) {this.squareFoot = squareFoot;
    }
    public int getLotSize() {
        return lotSize;
    }
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House(String description,
                 String dateAcquired,
                 double originalCost,
                 String address,
                 int condition,
                 int squareFoot,
                 int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    @Override
    public double getValue() {
        if (getOriginalCost() >180){setCondition(1);}
        else if (getOriginalCost()>130){setCondition(2);}
        else if (getOriginalCost()>90){setCondition(3);}
        else if (getOriginalCost()>80){setCondition(4);}
        // A house's value is determined as
        // $180.00 per square foot (excellent)
        // $130.00 per square foot (good)
        // $90.00 per square foot (fair)
        // $80.00 per square foot (poor)
        // PLUS 25 cents per square foot of lot size
        return super.getOriginalCost();
    }

}
