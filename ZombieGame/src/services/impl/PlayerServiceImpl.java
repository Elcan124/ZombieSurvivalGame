package services.impl;


import location.Location;
import playGround.Room;
import services.PlayerService;
import static  globalData.GlobalDataService.*;

public class PlayerServiceImpl implements PlayerService {




    @Override
    public void setPlayersLocation() {
          for(int i = 0 ; i< place.length ; i++){
              for(int j = 0 ; j<place[0].length; j++){
                     Room room =place[i][j];
                     if(room.getPlayer()!=null){
                         player.setLocation(new Location(i , j));
                         return;
                     }
              }
          }

    }
}
