package Services;

import Services.AuthorizationService.AuthorizationService;
import Services.DataPackage.DataPackage;
import Services.RatingSystem.RatingSystem;

public abstract class BaseNetworkService
{
    protected AuthorizationService authorization_service;
    public RatingSystem rating_system;


    public BaseNetworkService(AuthorizationService authorization, RatingSystem system)
    {
        this.authorization_service = authorization;
        this.rating_system = system;
    }


    public void registerPlayer(String login, String password) {}
    public void authorize(String login, String password) { }

    public int createRoom() { return 0; }
    public int findRoom() { return 0; }

    public void signIn(int in) { }
    public void sendPackage(DataPackage dataPackage) { }

}
