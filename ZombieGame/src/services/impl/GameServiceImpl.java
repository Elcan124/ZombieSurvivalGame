package services.impl;

import enums.ItemEnum;

import location.Location;
import services.GameService;

import java.util.ArrayList;
import java.util.Random;
import  static globalData.GlobalDataService.*;

public class GameServiceImpl  implements GameService {

public static  ArrayList<String> randomLocationsList =  new ArrayList<>();
    @Override
    public Location setPlayerToRandomLocation() {
        int i  =  new Random().nextInt(place.length);
        int j = new Random().nextInt(place[0].length);
        place[i][j].setPlayer(player);
        Location location =  new Location(i , j );
        player.setLocation(location);
        return location;
    }

    @Override
    public void printArea() {
        for (int i = 0  ; i<place.length ; i++){
            for(int j = 0 ;  j<place[0].length; j++){
                if(place[i][j].getPlayer()!=null){
                    System.out.print("["+player.getName()+"] ");
                }else {
                    System.out.print(place[i][j].getItems());
                }
            }
            System.out.println();
        }


    }

    @Override
    public void setItemsToRandomLocation(int count, ItemEnum itemType) {


        for(int itemCount = 0 ; itemCount<count ; itemCount++ ){

            String location =  randomLocationsList.get(new Random().nextInt(randomLocationsList.size()));
            String[] locationSplit = location.split(",");
            int i = Integer.valueOf(locationSplit[0]);
            int j = Integer.valueOf(locationSplit[1]);

            place[i][j].getItems().add(itemType.getItemObject());
            randomLocationsList.remove(location);
        }





    }


    public static void fillRandomLocationsList(){

        for(int i = 0 ; i< place.length; i++){
            for (int j= 0 ; j<place[0].length ; j++ ){
           if(player.getLocation().getiPosition()==i && player.getLocation().getjPosition()==j){
               continue;
           }

               String location = i + "," + j;
               randomLocationsList.add(location);


            }

        }


    }


}
