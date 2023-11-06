package globalData;

import model.inventory.Inventory;
import playGround.Room;
import player.Player;



public class GlobalDataService {


    public static  Room[][] place ;
    public static Player player ;




    public static void  setConstrants(){
        int x = utils.InputUtils.requireInt("Please enter "+ConstrantStrings.AREA_NAME+" size ->X");
        int y =  utils.InputUtils.requireInt("Please enter"+ConstrantStrings.AREA_NAME+" size ->Y");
        place = new Room[x][y];
        fillArray();
        setNewPlayer();


    }
    private static void fillArray(){
        for(int i = 0 ; i<place.length ; i++){
            for(int j = 0 ; j<place[0].length ; j++){
                place[i][j]  =  new Room();
            }
        }
}

private static void setNewPlayer(){
        player = new Player();
        player.setName(utils.InputUtils.requireString("Please enter Players name"));
        player.setHp(utils.InputUtils.requireDouble("Please enter players starting hp"));
        player.setInventory(new Inventory());

}


}
