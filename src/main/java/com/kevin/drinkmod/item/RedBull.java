package com.kevin.drinkmod.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class RedBull extends MilkBucketItem {

    public RedBull(){
        super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity user) {
        // If the user is a player, add Elytra to inventory
        if(user instanceof Player){
            Player player = (Player) user;
            player.addItem(new ItemStack(Items.ELYTRA));
        }
        // Add an Empty Can to the inventory
        return new ItemStack(ModItems.CAN.get());
    }
}
