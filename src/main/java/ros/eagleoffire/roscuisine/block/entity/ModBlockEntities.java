package ros.eagleoffire.roscuisine.block.entity;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ros.eagleoffire.roscuisine.ROSCuisine;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntity<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ROSCuisine.MODID);

    
}
