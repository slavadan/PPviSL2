package Cars;

import Cars.Commands.ICommand;

import java.util.Dictionary;


public abstract class BaseCarModel
{

    public BaseCarCharacteristic characteristic;

    public BaseCarStatistic statistic;

    private Dictionary<Integer, ICommand> commands;


    public void addCommand(int id, ICommand command) { this.commands.put(id, command); }

    public void executeCommand(int id) { this.commands.get(id).Execute(); }


}
