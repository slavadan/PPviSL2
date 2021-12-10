package Services.AuthorizationService;

import Services.BaseNetworkService;

public interface AuthorizationService
{
    void authorize(String login, String password);
}
