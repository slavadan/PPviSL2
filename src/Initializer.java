import Cars.CharacteristicCalculator.StatsCalculator;
import Cars.Storage.DetailStorage;
import GUI.Service.GUIService;
import ModesAndController.Controller.GameController;
import ModesAndController.Controller.StandardGameController;
import Services.AuthorizationService.AuthorizationService;
import Services.AuthorizationService.SimpleAuthorization;
import Services.NetworkService;
import Services.Player.Player;
import Services.RatingSystem.RatingSystem;
import Services.RatingSystem.SimpleRatingSystem;

public class Initializer
{
    public void init()
    {
        AuthorizationService authorizationService = new SimpleAuthorization();
        RatingSystem ratingSystem = new SimpleRatingSystem();

        NetworkService networkService = new NetworkService(authorizationService, ratingSystem);

        GUIService guiService = new GUIService(networkService);

        DetailStorage detailStorage = new DetailStorage();
        StatsCalculator statsCalculator = new StatsCalculator();

        Player player = new Player();

        GameController gameController = new StandardGameController();

        guiService.open("main");
    }
}
