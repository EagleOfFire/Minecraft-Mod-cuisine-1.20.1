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

                        // contenant conserve
                        pOutput.accept(ModItems.CONSERVE_DE_CAVIAR.get());
                        pOutput.accept(ModItems.CONSERVE_OEUF_SAUMON.get());
                        pOutput.accept(ModItems.CONSERVE_VIDE.get());

                        // contenant pot
                        pOutput.accept(ModItems.BOCALE_ANCHOIS.get());
                        pOutput.accept(ModItems.BOUILLON_DE_BOEUF.get());
                        pOutput.accept(ModItems.BOUILLON_DE_DASHI.get());
                        pOutput.accept(ModItems.BOUILLON_DE_PORC.get());
                        pOutput.accept(ModItems.BOUILLON_DE_POULET.get());
                        pOutput.accept(ModItems.MAYONNAISE.get());
                        pOutput.accept(ModItems.MOUTARDE.get());
                        pOutput.accept(ModItems.PATE_MISO.get());
                        pOutput.accept(ModItems.PATE_MISO_TRADITIONNEL.get());
                        pOutput.accept(ModItems.POT_VIDE.get());

                        // plantes
                        pOutput.accept(ModItems.AIL.get());
                        pOutput.accept(ModItems.AIL_COUPEE.get());
                        pOutput.accept(ModItems.AIL_GOUSSE.get());
                        pOutput.accept(ModItems.AIL_PLANTE.get());
                        pOutput.accept(ModItems.ALGUE_NORI.get());
                        pOutput.accept(ModItems.AVOCAT.get());
                        pOutput.accept(ModItems.AVOCAT_COUPEE.get());
                        pOutput.accept(ModItems.BLE_GRAIN.get());
                        pOutput.accept(ModItems.BLE_TIGE.get());
                        pOutput.accept(ModItems.CAROTTE.get());
                        pOutput.accept(ModItems.CAROTTE_COUPEE.get());
                        pOutput.accept(ModItems.CAROTTE_PLANTE.get());
                        pOutput.accept(ModItems.CAROTTE_RAPEE.get());
                        pOutput.accept(ModItems.CHOU_VERT.get());
                        pOutput.accept(ModItems.CHOU_VERT_RAPEE.get());
                        pOutput.accept(ModItems.CHOU_VERT_PLANTE.get());
                        pOutput.accept(ModItems.CIBOULE.get());
                        pOutput.accept(ModItems.CIBOULE_COUPEE.get());
                        pOutput.accept(ModItems.CIBOULE_PLANTE.get());
                        pOutput.accept(ModItems.CONCOMBRE.get());
                        pOutput.accept(ModItems.CONCOMBRE_COUPEE.get());
                        pOutput.accept(ModItems.CONCOMBRE_PLANTE.get());
                        pOutput.accept(ModItems.CURRY_JAUNE_PLANTE.get());
                        pOutput.accept(ModItems.CURRY_ROUGE_PLANTE.get());
                        pOutput.accept(ModItems.FENOUIL.get());
                        pOutput.accept(ModItems.FENOUIL_PLANTE.get());
                        pOutput.accept(ModItems.FEVE_SOJA.get());
                        pOutput.accept(ModItems.GINGEMBRE.get());
                        pOutput.accept(ModItems.GINGEMBRE_PLANTE.get());
                        pOutput.accept(ModItems.HARICOT_BLANC.get());
                        pOutput.accept(ModItems.HARICOT_BLANC_PLANTE.get());
                        pOutput.accept(ModItems.HARICOT_ROUGE.get());
                        pOutput.accept(ModItems.HARICOT_ROUGE_PLANTE.get());
                        pOutput.accept(ModItems.KONJAC.get());
                        pOutput.accept(ModItems.KONJAC_PLANTE.get());
                        pOutput.accept(ModItems.MOUTARDE_JAPONAISE_FEUILLES.get());
                        pOutput.accept(ModItems.MOUTARDE_JAPONAISE_GRAINE.get());
                        pOutput.accept(ModItems.MOUTARDE_JAPONAISE_PLANTE.get());
                        pOutput.accept(ModItems.NAVET.get());
                        pOutput.accept(ModItems.NAVET_BLANC.get());
                        pOutput.accept(ModItems.NAVET_BLANC_PLANTE.get());
                        pOutput.accept(ModItems.NAVET_PLANTE.get());
                        pOutput.accept(ModItems.NAVET_BLANC_RAPEE.get());
                        pOutput.accept(ModItems.OIGNON.get());
                        pOutput.accept(ModItems.OIGNON_COUPE.get());
                        pOutput.accept(ModItems.OIGNON_PLANTE.get());
                        pOutput.accept(ModItems.OIGNON_ROUGE.get());
                        pOutput.accept(ModItems.OIGNON_ROUGE_COUPE.get());
                        pOutput.accept(ModItems.OIGNON_ROUGE_PLANTE.get());
                        pOutput.accept(ModItems.OIGNON_VERT.get());
                        pOutput.accept(ModItems.OIGNON_VERT_PLANTE.get());
                        pOutput.accept(ModItems.OLIVE_NOIR.get());
                        pOutput.accept(ModItems.OLIVE_VERTE.get());
                        pOutput.accept(ModItems.ORGE_MONDER_GRAIN.get());
                        pOutput.accept(ModItems.ORGE_MONDER_PLANTE.get());
                        pOutput.accept(ModItems.ORGE_MONDER_TIGE.get());
                        pOutput.accept(ModItems.ORGE_PERLER_GRAIN.get());
                        pOutput.accept(ModItems.ORGE_PERLER_PLANTE.get());
                        pOutput.accept(ModItems.ORGE_PERLER_TIGE.get());
                        pOutput.accept(ModItems.PERSIL_COUPEE.get());
                        pOutput.accept(ModItems.PETIT_POIS.get());
                        pOutput.accept(ModItems.PETIT_POIS_EN_COSSE.get());
                        pOutput.accept(ModItems.PETIT_POIS_PLANTE.get());
                        pOutput.accept(ModItems.PIMENT_ROUGE.get());
                        pOutput.accept(ModItems.PIMENT_ROUGE_PLANTE.get());
                        pOutput.accept(ModItems.PIMENT_ROUGE_SECHEE.get());
                        pOutput.accept(ModItems.POIVRE_BLANC_PLANTE.get());
                        pOutput.accept(ModItems.POIVRON_ROUGE.get());
                        pOutput.accept(ModItems.POIVRON_ROUGE_COUPE.get());
                        pOutput.accept(ModItems.POIVRON_ROUGE_PLANTE.get());
                        pOutput.accept(ModItems.POMME_DE_TERRE.get());
                        pOutput.accept(ModItems.POMME_DE_TERRE_COUPEE.get());
                        pOutput.accept(ModItems.POMME_DE_TERRE_PLANTE.get());
                        pOutput.accept(ModItems.PRUNE_UMEBOSHI.get());
                        pOutput.accept(ModItems.RACINE_LOTUS.get());
                        pOutput.accept(ModItems.RIZ_BLANC.get());
                        pOutput.accept(ModItems.RIZ_BLANC_PLANTE.get());
                        pOutput.accept(ModItems.RIZ_BLANC_TIGE.get());
                        pOutput.accept(ModItems.RIZ_BRUN.get());
                        pOutput.accept(ModItems.RIZ_BRUN_PLANTE.get());
                        pOutput.accept(ModItems.RIZ_BRUN_TIGE.get());
                        pOutput.accept(ModItems.RIZ_NOIR.get());
                        pOutput.accept(ModItems.RIZ_NOIR_PLANTE.get());
                        pOutput.accept(ModItems.RIZ_NOIR_TIGE.get());
                        pOutput.accept(ModItems.SESAME_PLANTE.get());
                        pOutput.accept(ModItems.THE_BLANC.get());
                        pOutput.accept(ModItems.THE_NOIR.get());
                        pOutput.accept(ModItems.THE_VERT.get());
                        pOutput.accept(ModItems.TOMATE.get());
                        pOutput.accept(ModItems.TOMATE_COUPEE.get());
                        pOutput.accept(ModItems.TOMATE_PLANTE.get());
                        pOutput.accept(ModItems.WASABI.get());
                        pOutput.accept(ModItems.WASABI_PLANTE.get());

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
