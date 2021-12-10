package Cars;

import java.util.ArrayList;

public abstract class BaseCarCharacteristic
{

    public float basic_power;
    public float basic_max_speed;
    public float basic_acceleration;
    public float basic_controllability;

    public ArrayList<Integer> tuning_parts_id;


    public float calculatePower() { return 0; }
    public float calculateMaxSpeed() { return 0; }
    public float calculateAcceleration() { return 0; }
    public float calculateControllability() { return 0; }

}
