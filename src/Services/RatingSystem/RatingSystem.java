package Services.RatingSystem;

import java.util.ArrayList;
import java.util.Dictionary;


public abstract class RatingSystem
{
    protected Dictionary<String, ArrayList<String>> player_list;

    public ArrayList<String> getPlayers(String key) { return player_list.get(key); }

}
