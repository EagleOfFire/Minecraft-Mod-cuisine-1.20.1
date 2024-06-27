package ros.eagleoffire.roscuisine.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.roscuisine.ROSCuisine;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ROSCuisine.MODID);

    public static final RegistryObject<Item> BOL_RIZ = ITEMS.register("bol_riz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOL_RIZ_GLUANT = ITEMS.register("bol_riz_gluant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAKI_SAUMON = ITEMS.register("maki_saumon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAKI_THON = ITEMS.register("maki_thon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOCHI_NATURE = ITEMS.register("mochi_nature",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUF_AU_PLAT = ITEMS.register("oeuf_au_plat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUFS_BOUILLIS = ITEMS.register("oeufs_bouillis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_ALGUE_KOMBU = ITEMS.register("onigir_algue_kombu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_SAUMON_GRILLEE = ITEMS.register("onigiri_saumon_grillee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_THON_MAYO = ITEMS.register("onigir_thon_mayo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_UMEBOSHI = ITEMS.register("onigiri_umeboshi",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
