package com.kevin.drinkmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Can extends Item {

    public Can(){
        super(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC));
    }
}
