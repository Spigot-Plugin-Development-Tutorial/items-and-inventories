package me.kodysimpson.items.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player){

            ItemStack flower = new ItemStack(Material.FLOWERING_AZALEA, 2);
            player.getInventory().setItem(1, flower);

            ItemStack food = new ItemStack(Material.BEEF, 7);
            ItemMeta foodMeta = food.getItemMeta();
            foodMeta.setDisplayName(ChatColor.RED + "Yummy Food");

            List<String> foodLore = new ArrayList<>();
            foodLore.add("This is the best food.");
            foodLore.add("You want to eat me.");
            foodLore.add("Subscribe to Kody Simpson");
            foodMeta.setLore(foodLore);

            foodMeta.addEnchant(Enchantment.KNOCKBACK, 1000, true);

            //add the meta
            food.setItemMeta(foodMeta);
            player.getInventory().addItem(food);

        }


        return true;
    }
}
