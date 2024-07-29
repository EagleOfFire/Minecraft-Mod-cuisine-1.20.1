package ros.eagleoffire.roscuisine.block.entity;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.roscuisine.ROSCuisine;
import ros.eagleoffire.roscuisine.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ROSCuisine.MODID);

    public static final RegistryObject<BlockEntityType<FumoirBlockEntity>> FUMOIR_BE =
            BLOCK_ENTITIES.register("fumoir_be", () ->
                    BlockEntityType.Builder.of(FumoirBlockEntity::new,
                            ModBlocks.FUMOIR.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
