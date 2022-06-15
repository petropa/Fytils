package net.stoopipoopy.fytils.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;

public class MainGui extends LightweightGuiDescription {
    public MainGui(){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300,200);
    }
}
