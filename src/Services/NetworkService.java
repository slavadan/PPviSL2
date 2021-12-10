package Services;

import Services.AuthorizationService.AuthorizationService;
import Services.RatingSystem.RatingSystem;

import java.net.Socket;

public class NetworkService extends BaseNetworkService
{
    private Socket connection;


    public NetworkService(AuthorizationService authorization, RatingSystem system)
    {
        super(authorization, system);
    }

}
