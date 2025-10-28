package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assetList = new ArrayList<>();
        assetList.add(new House ("My House","12/12/1212",500000,"Pittsburgh",1,5,112));
        assetList.add(new House("Neigbours House","12/12/2222",100000,"Ohio",1,5,300));
        assetList.add(new Vehicle("Berkcan's Car","12/12/2222",30000,"Mazda/Mazda3",2008,180000));
        assetList.add(new Vehicle("My Car","12/12/2222",60000,"Toyota/Supra",2020,3000));

        for(int i=0;i< assetList.size();i++){

           Asset asset = assetList.get(i);
           String message = "";

           if (asset instanceof House house){
               message = "This House at " + house.getAddress()+"\n        Condition    :" + house.getCondition();
           } else if (asset instanceof Vehicle vehicle) {
               message = "Vehicle:" + vehicle.getMakeModel()  +" " + "Year: "+ vehicle.getYear() + "\n        Reduced Value: " + vehicle.getValue();
               System.out.println();
           }
            System.out.println();
            System.out.println(message);
            System.out.printf("        Description  : %s\n        Acquired Date: %s\n        Cost         : %.2f\n        Value        : %.2f\n", asset.description, asset.dateAcquired, asset.originalCost, asset.getValue());
        }
    }
}
