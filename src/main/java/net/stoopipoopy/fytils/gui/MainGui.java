package net.stoopipoopy.fytils.gui;

import io.github.cottonmc.cotton.gui.GuiDescription;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;

import javax.swing.*;
import java.awt.*;

public class MainGui extends LightweightGuiDescription {
    public static LoreGui loregui = new LoreGui();
    public MainGui(){
        WPlainPanel root = new WPlainPanel();
        WGridPanel lore = new WGridPanel();
        setRootPanel(root);



        root.setSize(340,220);
        lore.setSize(340,220);
        WLabel welcomeLabel = new WLabel(new LiteralText("Welcome to Fytils!"));


        WLabel descriptionLabel = new WLabel(new LiteralText("i cant change text size help"));
        root.add(welcomeLabel,(root.getWidth()/2) - welcomeLabel.getWidth(),20);
        root.add(descriptionLabel,0,3,0,0);


        WButton loreButton = new WButton(new ItemIcon(new ItemStack(Items.KNOWLEDGE_BOOK)),new LiteralText("Magical Lore Button"));
        WLabel loreText = new WLabel(new LiteralText("so this guy turns himself into a pickle"));
        lore.add(loreText,3,3);
        root.add(loreButton, 100, 100, 200, 20);
        lore.addPainters();

        loreButton.setOnClick(() -> {
            loregui.setRootPanel(lore);
        });


    }
}
