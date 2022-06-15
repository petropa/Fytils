package net.stoopipoopy.fytils.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;

import javax.swing.*;
import java.awt.*;

public class MainGui extends LightweightGuiDescription {
    public MainGui(){
        WPlainPanel root = new WPlainPanel();
        setRootPanel(root);
        root.setSize(340,220);
        WLabel welcomeLabel = new WLabel(new LiteralText("Welcome to Fytils!"));
        WLabel descriptionLabel = new WLabel(new LiteralText("Fytils is the one and only utility mod for dungeonfy!"));
        root.add(welcomeLabel,(root.getWidth()/2) - welcomeLabel.getWidth(),20);
        root.add(descriptionLabel,0,3,0,0);

    }
}
