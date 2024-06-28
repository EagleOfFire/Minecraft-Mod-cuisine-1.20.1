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

    public static final RegistryObject<Item> CARROT = ITEMS.register("carrot",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO = ITEMS.register("potato",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHICKEN = ITEMS.register("chicken",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PORK = ITEMS.register("pork",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEEF = ITEMS.register("beef",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FISH = ITEMS.register("fish",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MILK = ITEMS.register("milk",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHEAT = ITEMS.register("wheat",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BREAD = ITEMS.register("bread",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PASTA = ITEMS.register("pasta",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> APPLE = ITEMS.register("apple",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOY_SAUCE = ITEMS.register("soy_sauce",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAYONNAISE = ITEMS.register("mayonnaise",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KETCHUP = ITEMS.register("ketchup",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSTARD = ITEMS.register("mustard",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER = ITEMS.register("water",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUICE = ITEMS.register("juice",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEA = ITEMS.register("tea",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALAD = ITEMS.register("salad",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DESSERTS = ITEMS.register("desserts",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAKE = ITEMS.register("cake",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKIE = ITEMS.register("cookie",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIE = ITEMS.register("pie",
                () -> new Item(new Item.Properties()));

    // REPAS
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
    public static final RegistryObject<Item> ONIGIRI_ALGUE_KOMBU = ITEMS.register("onigiri_algue_kombu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_SAUMON_GRILLEE = ITEMS.register("onigiri_saumon_grillee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_THON_MAYO = ITEMS.register("onigiri_thon_mayo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONIGIRI_UMEBOSHI = ITEMS.register("onigiri_umeboshi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUFS_MAYO = ITEMS.register("oeufs_mayo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OYAKODON = ITEMS.register("oyakodon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SASHIMI_ANCHOIS = ITEMS.register("sashimi_anchois",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SASHIMI_ANGUILLE = ITEMS.register("sashimi_anguille",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SASHIMI_FUGU = ITEMS.register("sashimi_fugu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SASHIMI_POULPE = ITEMS.register("sashimi_poulpe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SASHIMI_SAUMON = ITEMS.register("sashimi_saumon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SASHIMI_THON = ITEMS.register("sashimi_thon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAKOYAKI = ITEMS.register("takoyaki",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAKOYAKI_BROCHETTE = ITEMS.register("takoyaki_brochette",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
