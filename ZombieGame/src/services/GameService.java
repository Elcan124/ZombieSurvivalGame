package services;

import enums.ItemEnum;
import location.Location;

import java.util.ArrayList;


public interface GameService {

    Location setPlayerToRandomLocation();


    void printArea();

     void setItemsToRandomLocation(int count , ItemEnum itemType);

}
