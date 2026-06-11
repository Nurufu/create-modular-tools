package net.zlt.create_modular_tools.item;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;
import net.zlt.create_modular_tools.CreateModularTools;

import java.util.List;

public class ModularItems {

	public static final ItemEntry<Item> OAK_MOLD =
			CreateModularTools.REGISTRATE.item("oak_mold", Item::new)
					.register();
}
