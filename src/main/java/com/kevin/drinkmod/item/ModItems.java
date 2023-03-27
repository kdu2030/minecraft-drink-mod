package com.kevin.drinkmod.item;

import com.kevin.drinkmod.DrinkMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DrinkMod.MODID);

    public static final RegistryObject<Item> CAN = ITEMS.register("can", () -> new Can());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
