package Cars.CharacteristicCalculator;

import Cars.BaseCarCharacteristic;

public interface IStatsCalculator {

    float calculatePower(BaseCarCharacteristic in);
    float calculateMaxSpeed(BaseCarCharacteristic in);
    float calculateAcceleration(BaseCarCharacteristic in);
    float calculateControllability(BaseCarCharacteristic in);

}
