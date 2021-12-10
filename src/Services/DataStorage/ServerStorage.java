package Services.DataStorage;

import Services.BaseNetworkService;

public class ServerStorage implements IDataStorage
{

    @Override
    public float readNumber(String data) {
        return 0;
    }

    @Override
    public String readString(String data) {
        return null;
    }


    private BaseNetworkService network_service;

}
