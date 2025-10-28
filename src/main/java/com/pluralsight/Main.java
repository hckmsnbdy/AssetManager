package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assetList = new ArrayList<>();
        assetList.add(new House("My House","12/12/1212",500000));
        assetList.add(new House("Neigbours House","12/12/2222",100000));
        assetList.add(new Vehicle("Berkcan's Car","12/12/2222",30000));
        assetList.add(new House("My Car","12/12/2222",60000));

        for (Asset asset:assetList){
            System.out.printf("Description: %s\n Acquired Date: %s\n Cost: %.2f\n Value: %.2f\n",asset.description,asset.dateAcquired,asset.originalCost,asset.getValue());

        }




    }
}
