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

                        //champignon
                        pOutput.accept(ModItems.CHAMPIGNON_AGARICUS_BISPORUS_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_AMANITE_DES_CESARS_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_BOLET_DE_SATAN_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CALICE_DE_LA_MORT_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CEPE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CHANTERELLE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_COPRIN_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CORDYCEPS_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CORTIANIRE_SI_JOLI_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_COULEMELLE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CRINIERE_DE_LION_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_CUDONIA_CIRCINAN_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_ENOKI_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_ENTOMOLE_LIVIDE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_FAUSSE_MORILLE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_MAITAKE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_MARASME_DES_OREADES_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_MORILLE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_PIED_DE_MOUTON_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_REISHI_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_ROSE_DES_PRES_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_SHIITAKE_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_SHIMEJI_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_TERMITOMYCES_TITAN_COUPE.get());
                        pOutput.accept(ModItems.CHAMPIGNON_TROMPETTE_DE_LA_MORT_COUPE.get());

                        // composants
                        pOutput.accept(ModItems.BLE_GRILLE.get());
                        pOutput.accept(ModItems.CHAPELURE.get());
                        pOutput.accept(ModItems.CURRY_JAUNE.get());
                        pOutput.accept(ModItems.CURRY_ROUGE.get());
                        pOutput.accept(ModItems.FARINE.get());
                        pOutput.accept(ModItems.FARINE_DE_RIZ.get());
                        pOutput.accept(ModItems.FARINE_DE_RIZ_GLUANT.get());
                        pOutput.accept(ModItems.FARINE_DE_TEMPURA.get());
                        pOutput.accept(ModItems.FECULE_DE_MAIS.get());
                        pOutput.accept(ModItems.FECULE_DE_POMME_DE_TERRE.get());
                        pOutput.accept(ModItems.FECULE_DE_RIZ.get());
                        pOutput.accept(ModItems.GRAINE_SESAME.get());
                        pOutput.accept(ModItems.GRAINE_SESAME_GRILLE.get());
                        pOutput.accept(ModItems.POIVRE_BLANC.get());
                        pOutput.accept(ModItems.POIVRE_NOIR.get());
                        pOutput.accept(ModItems.RACINE_DE_LOTUS_COUPE.get());
                        pOutput.accept(ModItems.SEL.get());
                        pOutput.accept(ModItems.SUCRE.get());

                        // contenant bouteille
                        pOutput.accept(ModItems.BOUTEILLE_EAU.get());
                        pOutput.accept(ModItems.BOUTEILLE_EAU_GLACER.get());
                        pOutput.accept(ModItems.BOUTEILLE_VIDE.get());
                        pOutput.accept(ModItems.BOUTEILLE_VIN_ROUGE_YAMANASHI.get());
                        pOutput.accept(ModItems.CONCENTRE_TOMATE.get());
                        pOutput.accept(ModItems.EAU_SALEE.get());
                        pOutput.accept(ModItems.HUILE_DE_SESAME.get());
                        pOutput.accept(ModItems.HUILE_OLIVE.get());
                        pOutput.accept(ModItems.HUILE_VEGETALE.get());
                        pOutput.accept(ModItems.LAIT_EN_BOUTEILLE.get());
                        pOutput.accept(ModItems.MIRIN_EN_BOUTEILLE.get());
                        pOutput.accept(ModItems.SAKE_DE_CUISINE.get());
                        pOutput.accept(ModItems.SAUCE_DASHI.get());
                        pOutput.accept(ModItems.SAUCE_GOMA.get());
                        pOutput.accept(ModItems.SAUCE_KETCHUP.get());
                        pOutput.accept(ModItems.SAUCE_MIRIN.get());
                        pOutput.accept(ModItems.SAUCE_PONZU.get());
                        pOutput.accept(ModItems.SAUCE_SOBA.get());
                        pOutput.accept(ModItems.SAUCE_SOJA.get());
                        pOutput.accept(ModItems.SAUCE_SOJA_SUCREE.get());
                        pOutput.accept(ModItems.SAUCE_TAKOYAKI.get());
                        pOutput.accept(ModItems.SAUCE_TEPPANYAKI.get());
                        pOutput.accept(ModItems.SAUCE_TERIYAKI.get());
                        pOutput.accept(ModItems.SAUCE_TONKATSU.get());
                        pOutput.accept(ModItems.SAUCE_TSUYU.get());
                        pOutput.accept(ModItems.SAUCE_UNAGI.get());
                        pOutput.accept(ModItems.SAUCE_WASABI.get());
                        pOutput.accept(ModItems.SAUCE_WORCESTERSHIRE.get());
                        pOutput.accept(ModItems.SAUCE_YAKINIKU.get());
                        pOutput.accept(ModItems.SAUCE_YAKISOBA.get());
                        pOutput.accept(ModItems.SAUCE_YAKITORI.get());
                        pOutput.accept(ModItems.SAUCE_YAKIZAKANA.get());
                        pOutput.accept(ModItems.VINAIGRE_BLANC.get());
                        pOutput.accept(ModItems.VINAIGRE_DE_RIZ.get());

                        // repas
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
