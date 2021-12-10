package Services.Inventory;

import Services.DataStorage.IDataStorage;

public class Inventory implements BaseInventory
{
    @Override
    public int getMoney(int id) {
        return 0;
    }

    @Override
    public void addMoney(int id, int value) {

    }

    private IDataStorage storage;

}
