package net.zlt.create_modular_tools.ponder;

import com.simibubi.create.infrastructure.ponder.AllCreatePonderTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.entry.ItemProviderEntry;

import com.tterrag.registrate.util.entry.RegistryEntry;

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.zlt.create_modular_tools.item.AllItems;
import net.zlt.create_modular_tools.item.ModularItems;
import net.zlt.create_modular_tools.item.mold.AllMoldItems;

import java.util.List;

public class ModularPonderScenes {

	public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
		PonderSceneRegistrationHelper<ItemProviderEntry<?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);
		HELPER.forComponents(moldItems)
				.addStoryBoard("mold/setup", AllPonderScenes::moldSetup)
				.addStoryBoard("mold/using", AllPonderScenes::moldUsing);
	}

	public static List<ItemEntry<Item>> moldItems = List.of(
		ModularItems.OAK_MOLD
	);
}
