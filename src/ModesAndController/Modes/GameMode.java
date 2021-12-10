package ModesAndController.Modes;

import Services.RoomSettings;

import java.util.ArrayList;

public abstract class GameMode
{
    //todo add Position
    public RoomSettings settings;
    protected ArrayList<Integer> checkpoints;

    public float getPlayerProgress(int param) { return 0; }
}
