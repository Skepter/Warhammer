package io.github.Skepter.Warhammer;

import io.github.Skepter.AllAssets.API.Builders.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Warhammer extends JavaPlugin {

	@Override
	public void onEnable() {
		ItemStack wh = new ItemBuilder(Material.GOLD_AXE).setDisplayName("Warhammer").setLore("USE WITH CAUTION!").addGlow().build();
		new WarhammerItem(this, wh, "Warhammer", "Warhammer.use");
		
		ItemStack dw = new ItemBuilder(Material.BLAZE_ROD).setDisplayName("Death wand").setLore("Right click to kill all").addGlow().build();
		new DeathWandItem(this, dw, "Deathwand");
	}
}
