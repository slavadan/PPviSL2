package Cars.CharacteristicCalculator;

import Cars.BaseCarCharacteristic;
import Cars.Storage.IDetailStorage;

public class StatsCalculator implements IStatsCalculator
{

    public StatsCalculator()
    {

    }


    private IDetailStorage _storage;


    @Override
    public float calculatePower(BaseCarCharacteristic in) {
        return 0;
    }

    @Override
    public float calculateMaxSpeed(BaseCarCharacteristic in) {
        return 0;
    }

    @Override
    public float calculateAcceleration(BaseCarCharacteristic in) {
        return 0;
    }

    @Override
    public float calculateControllability(BaseCarCharacteristic in) {
        return 0;
    }
}
