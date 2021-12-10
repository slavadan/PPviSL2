package GUI;

import GUI.Service.IGUIService;
import Services.BaseNetworkService;

import javax.swing.*;

public abstract class Window extends JFrame
{
    protected BaseNetworkService networkService;
    protected IGUIService guiService;

    public Window(IGUIService guiService, BaseNetworkService networkService)
    {
        this.setSize(700, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.guiService = guiService;
        this.networkService = networkService;

        this.setResizable(false);

    }


    public void display()
    {
        this.setVisible(true);
    }

    public void close()
    {
        this.setVisible(false);
    }

}
