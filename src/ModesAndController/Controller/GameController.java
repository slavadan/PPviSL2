package ModesAndController.Controller;

import Cars.BaseCarModel;
import ModesAndController.Modes.GameMode;

import java.util.ArrayList;

public abstract class GameController
{

    protected ArrayList<BaseCarModel> riders;
    protected GameMode game_mode;
    protected GameController controller;


    public void init(GameMode gameMode, ArrayList<BaseCarModel> list)
    {
        this.riders = list;
        this.game_mode = gameMode;
    }

}
