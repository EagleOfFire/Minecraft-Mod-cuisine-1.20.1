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

    // contenant bouteille
    public static final RegistryObject<Item> CONSERVE_DE_CAVIAR = ITEMS.register("conserve_de_caviar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONSERVE_OEUF_SAUMON = ITEMS.register("conserve_oeuf_saumon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONSERVE_VIDE = ITEMS.register("conserve_vide",
            () -> new Item(new Item.Properties()));

    // contenant pot
    public static final RegistryObject<Item> BOCALE_ANCHOIS = ITEMS.register("bocale_anchois",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUILLON_DE_BOEUF = ITEMS.register("bouillon_de_boeuf",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUILLON_DE_DASHI = ITEMS.register("bouillon_de_dashi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUILLON_DE_PORC = ITEMS.register("bouillon_de_porc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUILLON_DE_POULET = ITEMS.register("bouillon_de_poulet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAYONNAISE = ITEMS.register("mayonnaise",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOUTARDE = ITEMS.register("moutarde",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PATE_MISO = ITEMS.register("pate_miso",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PATE_MISO_TRADITIONNEL = ITEMS.register("pate_miso_traditionnel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POT_VIDE = ITEMS.register("pot_vide",
            () -> new Item(new Item.Properties()));

    // plantes
    public static final RegistryObject<Item> AIL = ITEMS.register("ail",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIL_COUPEE = ITEMS.register("ail_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIL_GOUSSE = ITEMS.register("ail_gousse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIL_PLANTE = ITEMS.register("ail_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALGUE_NORI = ITEMS.register("algue_nori",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AVOCAT = ITEMS.register("avocat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AVOCAT_COUPEE = ITEMS.register("avocat_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLE_GRAIN = ITEMS.register("ble_grain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLE_TIGE = ITEMS.register("ble_tige",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAROTTE = ITEMS.register("carotte",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAROTTE_COUPEE = ITEMS.register("carotte_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAROTTE_PLANTE = ITEMS.register("carotte_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAROTTE_RAPEE = ITEMS.register("carotte_rapee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOU_VERT = ITEMS.register("chou_vert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOU_VERT_RAPEE = ITEMS.register("chou_vert_rapee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOU_VERT_PLANTE = ITEMS.register("chou_vert_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIBOULE = ITEMS.register("ciboule",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIBOULE_COUPEE = ITEMS.register("ciboule_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIBOULE_PLANTE = ITEMS.register("ciboule_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONCOMBRE = ITEMS.register("concombre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONCOMBRE_COUPEE = ITEMS.register("concombre_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONCOMBRE_PLANTE = ITEMS.register("concombre_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURRY_JAUNE_PLANTE = ITEMS.register("curry_jaune_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURRY_ROUGE_PLANTE = ITEMS.register("curry_rouge_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FENOUIL = ITEMS.register("fenouil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FENOUIL_PLANTE = ITEMS.register("fenouil_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FEVE_SOJA = ITEMS.register("feve_soja",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GINGEMBRE = ITEMS.register("gingembre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GINGEMBRE_PLANTE = ITEMS.register("gingembre_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARICOT_BLANC = ITEMS.register("haricot_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARICOT_BLANC_PLANTE = ITEMS.register("haricot_blanc_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARICOT_ROUGE = ITEMS.register("haricot_rouge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARICOT_ROUGE_PLANTE = ITEMS.register("haricot_rouge_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KONJAC = ITEMS.register("konjac",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KONJAC_PLANTE = ITEMS.register("konjac_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOUTARDE_JAPONAISE_FEUILLES = ITEMS.register("moutarde_japonaise_feuilles",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOUTARDE_JAPONAISE_GRAINE = ITEMS.register("moutarde_japonaise_graine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOUTARDE_JAPONAISE_PLANTE = ITEMS.register("moutarde_japonaise_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAVET = ITEMS.register("navet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAVET_BLANC = ITEMS.register("navet_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAVET_BLANC_PLANTE = ITEMS.register("navet_blanc_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAVET_PLANTE = ITEMS.register("navet_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAVET_BLANC_RAPEE = ITEMS.register("navet_blanc_rapee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON = ITEMS.register("oignon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_COUPE = ITEMS.register("oignon_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_PLANTE = ITEMS.register("oignon_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_ROUGE = ITEMS.register("oignon_rouge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_ROUGE_COUPE = ITEMS.register("oignon_rouge_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_ROUGE_PLANTE = ITEMS.register("oignon_rouge_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_VERT = ITEMS.register("oignon_vert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIGNON_VERT_PLANTE = ITEMS.register("oignon_vert_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_NOIR = ITEMS.register("olive_noir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_VERTE = ITEMS.register("olive_verte",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORGE_MONDER_GRAIN = ITEMS.register("orge_monder_grain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORGE_MONDER_PLANTE = ITEMS.register("orge_monder_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORGE_MONDER_TIGE = ITEMS.register("orge_monder_tige",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORGE_PERLER_GRAIN = ITEMS.register("orge_perler_grain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORGE_PERLER_PLANTE = ITEMS.register("orge_perler_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORGE_PERLER_TIGE = ITEMS.register("orge_perler_tige",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERSIL_COUPEE = ITEMS.register("persil_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PETIT_POIS = ITEMS.register("petit_pois",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PETIT_POIS_EN_COSSE = ITEMS.register("petit_pois_en_cosse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PETIT_POIS_PLANTE = ITEMS.register("petit_pois_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIMENT_ROUGE = ITEMS.register("piment_rouge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIMENT_ROUGE_PLANTE = ITEMS.register("piment_rouge_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIMENT_ROUGE_SECHEE = ITEMS.register("piment_rouge_sechee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRE_BLANC_PLANTE = ITEMS.register("poivre_blanc_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRON_ROUGE = ITEMS.register("poivron_rouge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRON_ROUGE_COUPE = ITEMS.register("poivron_rouge_coupe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRON_ROUGE_PLANTE = ITEMS.register("poivron_rouge_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POMME_DE_TERRE = ITEMS.register("pomme_de_terre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POMME_DE_TERRE_COUPEE = ITEMS.register("pomme_de_terre_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POMME_DE_TERRE_PLANTE = ITEMS.register("pomme_de_terre_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRUNE_UMEBOSHI = ITEMS.register("prune_umeboshi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACINE_LOTUS = ITEMS.register("racine_lotus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BLANC = ITEMS.register("riz_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BLANC_PLANTE = ITEMS.register("riz_blanc_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BLANC_TIGE = ITEMS.register("riz_blanc_tige",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BRUN = ITEMS.register("riz_brun",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BRUN_PLANTE = ITEMS.register("riz_brun_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BRUN_TIGE = ITEMS.register("riz_brun_tige",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_NOIR = ITEMS.register("riz_noir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_NOIR_PLANTE = ITEMS.register("riz_noir_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_NOIR_TIGE = ITEMS.register("riz_noir_tige",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SESAME_PLANTE = ITEMS.register("sesame_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THE_BLANC = ITEMS.register("the_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THE_NOIR = ITEMS.register("the_noir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THE_VERT = ITEMS.register("the_vert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOMATE = ITEMS.register("tomate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOMATE_COUPEE = ITEMS.register("tomate_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOMATE_PLANTE = ITEMS.register("tomate_plante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WASABI = ITEMS.register("wasabi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WASABI_PLANTE = ITEMS.register("wasabi_plante",
            () -> new Item(new Item.Properties()));

    //pre prepare
    public static final RegistryObject<Item> ALGUE_KOMBU = ITEMS.register("algue_kombu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEURRE = ITEMS.register("beurre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEURRE_COUPEE = ITEMS.register("beurre_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONITE_SECHEE = ITEMS.register("bonite_sechee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONITE_SECHEE_TRANCHEE = ITEMS.register("bonite_sechee_tranchee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOULETTE_DE_POISSON_CRU = ITEMS.register("boulette_de_poisson_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GINGEMBRE_MARINER = ITEMS.register("gingembre_mariner",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KAMABOKO = ITEMS.register("kamaboko",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAKI_ROLL_SAUMON = ITEMS.register("maki_roll_saumon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAKI_ROLL_THON = ITEMS.register("maki_roll_thon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOCHI = ITEMS.register("mochi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NATTO = ITEMS.register("natto",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NORI = ITEMS.register("nori",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NORI_FLOCON = ITEMS.register("nori_flocon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOUILLES_RAMEN_FRAICHES = ITEMS.register("nouilles_ramen_fraiches",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOUILLES_RAMEN_SECHEES = ITEMS.register("nouilles_ramen_sechees",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOUILLES_SOBA_SECHEES = ITEMS.register("nouilles_soba_sechees",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOUILLES_SOMEN_SECHEES = ITEMS.register("nouilles_somen_sechees",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOUILLES_UDON_FRAICHES = ITEMS.register("nouilles_udon_fraiches",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOUILLES_UDON_SECHEES = ITEMS.register("nouilles_udon_sechees",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OYAKODON_PREPARATION = ITEMS.register("oyakodon_preparation",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PATE_A_TAKOYAKI = ITEMS.register("pate_a_takoyaki",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BLANC_CHAUD = ITEMS.register("riz_blanc_chaud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_BRUN_CHAUD = ITEMS.register("riz_brun_chaud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_GLUANT = ITEMS.register("riz_gluant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_GLUANT_CHAUD = ITEMS.register("riz_gluant_chaud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIZ_NOIR_CHAUD = ITEMS.register("riz_noir_chaud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAKOYAKI_CRU = ITEMS.register("takoyaki_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAKOYAKI_CUIT = ITEMS.register("takoyaki_cuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPURA_CREVETTES_CHAUD = ITEMS.register("tempura_crevettes_chaud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPURA_LEGUMES_CHAUD = ITEMS.register("tempura_legumes_chaud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOFU = ITEMS.register("tofu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOFU_COUPEE = ITEMS.register("tofu_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOFU_FUMEE = ITEMS.register("tofu_fumee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOFU_FUMEE_COUPEE = ITEMS.register("tofu_fumee_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UMEBOSHI = ITEMS.register("umeboshi",
            () -> new Item(new Item.Properties()));

    // sacs
    public static final RegistryObject<Item> SAC_ORGE_MONDER = ITEMS.register("sac_orge_monder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAC_ORGE_PERLER = ITEMS.register("sac_orge_perler",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAC_RIZ_BLANC = ITEMS.register("sac_riz_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAC_RIZ_BRUN = ITEMS.register("sac_riz_brun",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAC_RIZ_NOIR = ITEMS.register("sac_riz_noir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAC_VIDE = ITEMS.register("sac_vide",
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

    // outils
    public static final RegistryObject<Item> ASSIETTE = ITEMS.register("assiette",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASSIETTE_SALE = ITEMS.register("assiette_sale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASSIETTE_WASABI = ITEMS.register("assiette_wasabi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOL = ITEMS.register("bol",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOL_SALE = ITEMS.register("bol_sale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COUTEAU_DE_CUISINE = ITEMS.register("couteau_de_cuisine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HACHOIR_CUISINE = ITEMS.register("hachoir_cuisine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEULE = ITEMS.register("meule",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MORTIER_A_PILLON = ITEMS.register("mortier_a_pillon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAPE = ITEMS.register("rape",
            () -> new Item(new Item.Properties()));

    //viandes
    public static final RegistryObject<Item> ANCHOIS_CRU = ITEMS.register("anchois_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANGUILLE_CRU = ITEMS.register("anguille_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANGUILLE_GRILLEE = ITEMS.register("anguille_grillee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOEUF_COUPEE = ITEMS.register("boeuf_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOEUF_CRU = ITEMS.register("boeuf_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALAMAR = ITEMS.register("calamar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALAMAR_CRU = ITEMS.register("calamar_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARCASSE_DE_POULET = ITEMS.register("carcasse_de_poulet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREVETTE = ITEMS.register("crevette",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREVETTE_COUPEE = ITEMS.register("crevette_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREVETTE_EPLUCHEE = ITEMS.register("crevette_epluchee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOIE_DE_FUGU = ITEMS.register("foie_de_fugu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUGU_CRU = ITEMS.register("fugu_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUF_BLANC = ITEMS.register("oeuf_blanc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUF_BOUILLI = ITEMS.register("oeuf_bouilli",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUF_CUIT = ITEMS.register("oeuf_cuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUF_DE_POULE = ITEMS.register("oeuf_de_poule",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OEUF_JAUNE = ITEMS.register("oeuf_jaune",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_ANCHOIS = ITEMS.register("poisson_anchois",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_ANGUILLE = ITEMS.register("poisson_anguille",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_CARPE = ITEMS.register("poisson_carpe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_COELACANTH = ITEMS.register("poisson_coelacanth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_FUGU = ITEMS.register("poisson_fugu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_SAUMON_QUINNAT = ITEMS.register("poisson_saumon_quinnat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_SAUMON_SOHO = ITEMS.register("poisson_saumon_soho",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_THON = ITEMS.register("poisson_thon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISSON_TRUITE_ARC_EN_CIEL = ITEMS.register("poisson_truite_arc_en_ciel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PORC_COUPEE = ITEMS.register("porc_coupee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PORC_CRU = ITEMS.register("porc_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULET_AILE = ITEMS.register("poulet_aile",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULET_BLANC_CRU = ITEMS.register("poulet_blanc_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULET_CUISSE_CRU = ITEMS.register("poulet_cuisse_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULET_ENTIER = ITEMS.register("poulet_entier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULET_SANS_AILES = ITEMS.register("poulet_sans_ailes",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULET_SANS_PATES = ITEMS.register("poulet_sans_pates",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULPE_TENTACULE = ITEMS.register("poulpe_tentacule",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POULPE = ITEMS.register("poulpe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUMON_CRU = ITEMS.register("saumon_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAUMON_GRILLEE = ITEMS.register("saumon_grillee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THON_BOUILLI = ITEMS.register("thon_bouilli",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THON_CRU = ITEMS.register("thon_cru",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THON_FUMEE = ITEMS.register("thon_fumee",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THON_GRILLEE = ITEMS.register("thon_grillee",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
