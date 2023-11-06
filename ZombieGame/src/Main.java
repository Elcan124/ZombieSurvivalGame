import enums.ItemEnum;
import globalData.GlobalDataService;
import location.Location;
import playGround.Room;
import player.Player;
import services.GameService;
import services.impl.GameServiceImpl;

public class Main {
    public static void main(String[] args) {

        GameService gameService =  new GameServiceImpl();


        GlobalDataService.setConstrants();// 5 5

        gameService.setPlayerToRandomLocation();
        GameServiceImpl.fillRandomLocationsList();
        System.out.println(  GameServiceImpl.randomLocationsList);;
        int zombieCount  = utils.InputUtils.requireInt("How many zombie you want to add?");
        int waterCount  = utils.InputUtils.requireInt("How many water you want to add?");
        int pizzaCount  = utils.InputUtils.requireInt("How many pizza you want to add?");
        int gunCount  = utils.InputUtils.requireInt("How many gun you want to add?");
        int maskCount  = utils.InputUtils.requireInt("How many mask you want to add?");
        gameService.setItemsToRandomLocation(zombieCount , ItemEnum.ZOMBI );
        gameService.setItemsToRandomLocation(waterCount , ItemEnum.WATER);
        gameService.setItemsToRandomLocation(pizzaCount , ItemEnum.PIZAA);
        gameService.setItemsToRandomLocation(gunCount , ItemEnum.GUN);
        gameService.setItemsToRandomLocation(maskCount , ItemEnum.MASK);

        gameService.printArea();

        System.out.println(GameServiceImpl.randomLocationsList);
        System.out.println(GlobalDataService.player.getLocation());

    }


}
