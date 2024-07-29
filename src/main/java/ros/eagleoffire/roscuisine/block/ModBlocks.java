package ros.eagleoffire.roscuisine.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.roscuisine.ROSCuisine;
import ros.eagleoffire.roscuisine.item.ModItems;
import ros.eagleoffire.roscuisine.block.custom.FumoirBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ROSCuisine.MODID);

    public static final RegistryObject<Block> FUMOIR = registryBlock("fumoir",
            () -> new FumoirBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block){
            RegistryObject<T> toReturn = BLOCKS.register(name,block);
            registerBlockItem(name, toReturn);
            return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void  register(IEventBus eventBus){
            BLOCKS.register(eventBus);
    }
}
