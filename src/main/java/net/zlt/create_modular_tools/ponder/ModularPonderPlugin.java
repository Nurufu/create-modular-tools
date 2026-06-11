package net.zlt.create_modular_tools.ponder;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.zlt.create_modular_tools.CreateModularTools;

import org.jetbrains.annotations.NotNull;

public class ModularPonderPlugin implements PonderPlugin {
	@Override
	public String getModId() {
		return CreateModularTools.ID;
	}

	@Override
	public void registerScenes(@NotNull PonderSceneRegistrationHelper<ResourceLocation> helper){
		ModularPonderScenes.register(helper);
	}
}
