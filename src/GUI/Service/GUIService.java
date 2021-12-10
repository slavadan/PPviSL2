package GUI.Service;

import GUI.*;
import Services.BaseNetworkService;
import java.util.HashMap;


public class GUIService implements IGUIService
{

    private HashMap<String, Window> window_list;

    public GUIService(BaseNetworkService networkService)
    {

        this.window_list = new HashMap<String, Window>();

        this.window_list.put("admin", new Admin(this, networkService));
        this.window_list.put("hud", new GameHUD(this, networkService));
        this.window_list.put("garage", new Garage(this, networkService));
        this.window_list.put("main", new MainMenu(this, networkService));
        this.window_list.put("rating", new Rating(this, networkService));
        this.window_list.put("room",new Room(this, networkService));
        this.window_list.put("settings", new SettingsDialog(this, networkService));
        this.window_list.put("shop", new Shop(this, networkService));

    }


    @Override
    public void open(String id)
    {
        this.window_list.get(id).display();
    }
}
