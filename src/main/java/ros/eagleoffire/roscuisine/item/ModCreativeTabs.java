package ros.eagleoffire.roscuisine.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.roscuisine.ROSCuisine;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ROSCuisine.MODID);

    public static final RegistryObject<CreativeModeTab> ROS_CUISINE_TAB = CREATIVE_MODE_TABS.register("ros_cuisine_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOL_RIZ.get()))
                    .title(Component.translatable("creativetab.ros_cuisine_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.CARROT.get());
                        pOutput.accept(ModItems.POTATO.get());
                        pOutput.accept(ModItems.ONION.get());
                        pOutput.accept(ModItems.GARLIC.get());

                        pOutput.accept(ModItems.CHICKEN.get());
                        pOutput.accept(ModItems.PORK.get());
                        pOutput.accept(ModItems.BEEF.get());
                        pOutput.accept(ModItems.FISH.get());

                        pOutput.accept(ModItems.MILK.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.BUTTER.get());

                        pOutput.accept(ModItems.WHEAT.get());
                        pOutput.accept(ModItems.BREAD.get());
                        pOutput.accept(ModItems.PASTA.get());

                        pOutput.accept(ModItems.APPLE.get());
                        pOutput.accept(ModItems.BANANA.get());
                        pOutput.accept(ModItems.ORANGE.get());

                        pOutput.accept(ModItems.SOY_SAUCE.get());
                        pOutput.accept(ModItems.MAYONNAISE.get());
                        pOutput.accept(ModItems.KETCHUP.get());
                        pOutput.accept(ModItems.MUSTARD.get());

                        pOutput.accept(ModItems.WATER.get());
                        pOutput.accept(ModItems.JUICE.get());
                        pOutput.accept(ModItems.TEA.get());
                        pOutput.accept(ModItems.COFFEE.get());

                        pOutput.accept(ModItems.PIZZA.get());
                        pOutput.accept(ModItems.BURGER.get());
                        pOutput.accept(ModItems.SANDWICH.get());
                        pOutput.accept(ModItems.SALAD.get());

                        pOutput.accept(ModItems.CAKE.get());
                        pOutput.accept(ModItems.COOKIE.get());
                        pOutput.accept(ModItems.PIE.get());

                        pOutput.accept(ModItems.BOL_RIZ.get());
                        pOutput.accept(ModItems.BOL_RIZ_GLUANT.get());
                        pOutput.accept(ModItems.MAKI_SAUMON.get());
                        pOutput.accept(ModItems.MAKI_THON.get());
                        pOutput.accept(ModItems.MOCHI_NATURE.get());
                        pOutput.accept(ModItems.OEUF_AU_PLAT.get());
                        pOutput.accept(ModItems.OEUFS_BOUILLIS.get());
                        pOutput.accept(ModItems.ONIGIRI_ALGUE_KOMBU.get());
                        pOutput.accept(ModItems.ONIGIRI_SAUMON_GRILLEE.get());
                        pOutput.accept(ModItems.ONIGIRI_THON_MAYO.get());
                        pOutput.accept(ModItems.ONIGIRI_UMEBOSHI.get());
                        pOutput.accept(ModItems.OEUFS_MAYO.get());
                        pOutput.accept(ModItems.OYAKODON.get());
                        pOutput.accept(ModItems.SASHIMI_ANCHOIS.get());
                        pOutput.accept(ModItems.SASHIMI_ANGUILLE.get());
                        pOutput.accept(ModItems.SASHIMI_FUGU.get());
                        pOutput.accept(ModItems.SASHIMI_POULPE.get());
                        pOutput.accept(ModItems.SASHIMI_SAUMON.get());
                        pOutput.accept(ModItems.SASHIMI_THON.get());
                        pOutput.accept(ModItems.TAKOYAKI.get());
                        pOutput.accept(ModItems.TAKOYAKI_BROCHETTE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
