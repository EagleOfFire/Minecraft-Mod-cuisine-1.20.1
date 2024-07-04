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

    //CHAMPIGNON
    public static final RegistryObject<Item> CHAMPIGNON_AGARICUS_BISPORUS_COUPE = ITEMS.register("champignon_agaricus_bisporus_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_AMANITE_DES_CESARS_COUPE = ITEMS.register("champignon_amanite_des_cesars_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_BOLET_DE_SATAN_COUPE = ITEMS.register("champignon_bolet_de_satan_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CALICE_DE_LA_MORT_COUPE = ITEMS.register("champignon_calice_de_la_mort_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CEPE_COUPE = ITEMS.register("champignon_cepe_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CHANTERELLE_COUPE = ITEMS.register("champignon_chanterelle_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_COPRIN_COUPE = ITEMS.register("champignon_coprin_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CORDYCEPS_COUPE = ITEMS.register("champignon_cordyceps_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CORTIANIRE_SI_JOLI_COUPE = ITEMS.register("champignon_cortianire_si_joli_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_COULEMELLE_COUPE = ITEMS.register("champignon_coulemelle_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CRINIERE_DE_LION_COUPE = ITEMS.register("champignon_criniere_de_lion_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_CUDONIA_CIRCINAN_COUPE = ITEMS.register("champignon_cudonia_circinan_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_ENOKI_COUPE = ITEMS.register("champignon_enoki_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_ENTOMOLE_LIVIDE_COUPE = ITEMS.register("champignon_entomole_livide_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_FAUSSE_MORILLE_COUPE = ITEMS.register("champignon_fausse_morille_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_MAITAKE_COUPE = ITEMS.register("champignon_maitake_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_MARASME_DES_OREADES_COUPE = ITEMS.register("champignon_marasme_des_oreades_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_MORILLE_COUPE = ITEMS.register("champignon_morille_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_PIED_DE_MOUTON_COUPE = ITEMS.register("champignon_pied_de_mouton_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_REISHI_COUPE = ITEMS.register("champignon_reishi_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_ROSE_DES_PRES_COUPE = ITEMS.register("champignon_rose_des_pres_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_SHIITAKE_COUPE = ITEMS.register("champignon_shiitake_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_SHIMEJI_COUPE = ITEMS.register("champignon_shimeji_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_TERMITOMYCES_TITAN_COUPE = ITEMS.register("champignon_termitomyces_titan_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMPIGNON_TROMPETTE_DE_LA_MORT_COUPE = ITEMS.register("champignon_trompette_de_la_mort_coupe",
            () -> new Item(new Item.Properties()));

    //composants
    public static final RegistryObject<Item> BLE_GRILLE = ITEMS.register("ble_grille",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAPELURE = ITEMS.register("chapelure",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURRY_JAUNE = ITEMS.register("curry_jaune",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURRY_ROUGE = ITEMS.register("curry_rouge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARINE = ITEMS.register("farine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARINE_DE_RIZ = ITEMS.register("farine_de_riz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARINE_DE_RIZ_GLUANT = ITEMS.register("farine_de_riz_gluant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARINE_DE_TEMPURA = ITEMS.register("farine_de_tempura",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FECULE_DE_MAIS = ITEMS.register("fecule_de_mais",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FECULE_DE_POMME_DE_TERRE = ITEMS.register("fecule_de_pomme_de_terre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FECULE_DE_RIZ = ITEMS.register("fecule_de_riz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAINE_SESAME = ITEMS.register("graine_sesame",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAINE_SESAME_GRILLE = ITEMS.register("graine_sesame_grille",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRE_BLANC = ITEMS.register("poivre_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRE_NOIR = ITEMS.register("poivre_noir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACINE_DE_LOTUS_COUPE = ITEMS.register("racine_de_lotus_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEL = ITEMS.register("sel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUCRE = ITEMS.register("sucre",
            () -> new Item(new Item.Properties()));

    // contenant bouteille
    public static final RegistryObject<Item> BOUTEILLE_EAU = ITEMS.register("bouteille_eau",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUTEILLE_EAU_GLACER = ITEMS.register("bouteille_eau_glacer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUTEILLE_VIDE = ITEMS.register("bouteille_vide",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUTEILLE_VIN_ROUGE_YAMANASHI = ITEMS.register("bouteille_vin_rouge_yamanashi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONCENTRE_TOMATE = ITEMS.register("concentre_tomate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EAU_SALEE = ITEMS.register("eau_salee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUILE_DE_SESAME = ITEMS.register("huile_de_sesame",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUILE_OLIVE = ITEMS.register("huile_olive",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUILE_VEGETALE = ITEMS.register("huile_vegetale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAIT_EN_BOUTEILLE = ITEMS.register("lait_en_bouteille",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIRIN_EN_BOUTEILLE = ITEMS.register("mirin_en_bouteille",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAKE_DE_CUISINE = ITEMS.register("sake_de_cuisine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_DASHI = ITEMS.register("sauce_dashi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_GOMA = ITEMS.register("sauce_goma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_KETCHUP = ITEMS.register("sauce_ketchup",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_MIRIN = ITEMS.register("sauce_mirin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_PONZU = ITEMS.register("sauce_ponzu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_SOBA = ITEMS.register("sauce_soba",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_SOJA = ITEMS.register("sauce_soja",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_SOJA_SUCREE = ITEMS.register("sauce_soja_sucree",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_TAKOYAKI = ITEMS.register("sauce_takoyaki",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_TEPPANYAKI = ITEMS.register("sauce_teppanyaki",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_TERIYAKI = ITEMS.register("sauce_teriyaki",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_TONKATSU = ITEMS.register("sauce_tonkatsu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_TSUYU = ITEMS.register("sauce_tsuyu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_UNAGI = ITEMS.register("sauce_unagi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_WASABI = ITEMS.register("sauce_wasabi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_WORCESTERSHIRE = ITEMS.register("sauce_worcestershire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_YAKINIKU = ITEMS.register("sauce_yakiniku",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_YAKISOBA = ITEMS.register("sauce_yakisoba",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_YAKITORI = ITEMS.register("sauce_yakitori",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUCE_YAKIZAKANA = ITEMS.register("sauce_yakizakana",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINAIGRE_BLANC = ITEMS.register("vinaigre_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINAIGRE_DE_RIZ = ITEMS.register("vinaigre_de_riz",
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
