package xreliquary.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidContainerData;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidStack;
import xreliquary.Config;
import xreliquary.lib.Names;
import xreliquary.lib.PotionData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class XRItems {
	public static Item handgun;
	public static Item stoneSlug;
	public static Item alchemicalShell;
	public static Item potionEssence;
	public static Item stackedEssence;
	public static Item emperorChalice;
	public static Item glowingBread;
	public static Item glowingWater;
	public static Item condensedPotion;
	public static Item enderStaff;
	public static Item gunPart;
	public static Item sojournerStaff;
	public static Item mercyCross;
	public static Item fortuneCoin;
	public static Item midasTouchstone;
	public static Item iceRod;
	public static Item magicbane;
	public static Item witherlessRose;
	public static Item holyHandGrenade;
	public static Item destructionCatalyst;
	public static Item alkahest;
	public static Item alkahestryTome;
	public static Item salamanderEye;
	public static Item wraithEye;
	public static Item emptyVoidTear;
	public static Item voidTear;
	public static Item voidSatchel;
	public static Item alchemicalGunmetal;
	public static Item gunsmithCrucible;
	public static Item alembic;
	public static Item apothecaryMortar;

	public static ItemStack gunPart(int m) {
		return gunPart(1, m);
	}

	public static ItemStack gunPart(int i, int m) {
		return new ItemStack(gunPart, i, m);
	}

	public static ItemStack potion(int m) {
		return potion(1, m);
	}

	public static ItemStack potion(int i, int m) {
		return new ItemStack(condensedPotion, i, m);
	}

	public static void init() {
		handgun = new ItemHandgun(Config.handgunID);
		alchemicalShell = new ItemShell(Config.shellID);
		stoneSlug = new ItemSlug(Config.slugID);
		mercyCross = new ItemMercyCross(Config.mercyCrossID);
		holyHandGrenade = new ItemHolyHandGrenade(Config.holyHandGrenadeID);
		fortuneCoin = new ItemFortuneCoin(Config.fortuneCoinID);
		glowingWater = new ItemGlowingWater(Config.glowWaterID);
		gunPart = new ItemGunPart(Config.gunPartID);
		glowingBread = new ItemGlowingBread(Config.glowBreadID, 20, 1.0F, false);
		sojournerStaff = new ItemSojournerStaff(Config.sojournerStaffID);
		alkahestryTome = new ItemAlkahestryTome(Config.alkahestryTomeID);
		midasTouchstone = new ItemMidasTouchstone(Config.midasTouchstoneID);
		alkahest = new ItemAlkahest(Config.alkahestID);
		emperorChalice = new ItemEmperorChalice(Config.chaliceID);
		salamanderEye = new ItemSalamanderEye(Config.salamanderEyeID);
		iceRod = new ItemIceRod(Config.iceRodID);
		condensedPotion = new ItemCondensedPotion(Config.condensedPotionID);
		magicbane = new ItemMagicbane(Config.magicbaneID);
		witherlessRose = new ItemWitherlessRose(Config.witherlessRoseID);
		enderStaff = new ItemEnderStaff(Config.enderStaffID);
		emptyVoidTear = new ItemEmptyVoidTear(Config.emptyVoidTearID);
		voidTear = new ItemVoidTear(Config.voidTearID);
		wraithEye = new ItemWraithEye(Config.wraithEyeID);
		voidSatchel = new ItemVoidSatchel(Config.satchelID);
		destructionCatalyst = new ItemDestructionCatalyst(Config.destructionCatalystID);
		alchemicalGunmetal = new ItemAlchemicalGunmetal(Config.alchemicalGunmetalID);
		gunsmithCrucible = new ItemGunsmithCrucible(Config.gunsmithCrucibleID);
		alembic = new ItemAlembic(Config.alembicID);
		apothecaryMortar = new ItemApothecaryMortar(Config.apothecaryMortarID);
		potionEssence = new ItemPotionEssence(Config.potionEssenceID);
		stackedEssence = new ItemStackedEssence(Config.stackedEssenceID);
		LanguageRegistry.addName(handgun, Names.HANDGUN_LOCAL);
		LanguageRegistry.addName(potion(PotionData.SPLASH_META), Names.SPLASH_NAME);
		LanguageRegistry.addName(potion(PotionData.POISON_META), Names.POISON_NAME);
		LanguageRegistry.addName(potion(PotionData.ACID_META), Names.ACID_NAME);
		LanguageRegistry.addName(potion(PotionData.SLOWING_META), Names.SLOWING_NAME);
		LanguageRegistry.addName(potion(PotionData.WEAKNESS_META), Names.WEAKNESS_NAME);
		LanguageRegistry.addName(potion(PotionData.BLINDING_META), Names.BLINDING_NAME);
		LanguageRegistry.addName(potion(PotionData.WITHER_META), Names.WITHER_NAME);
		LanguageRegistry.addName(potion(PotionData.APHRODITE_META), Names.APHRODITE_NAME);
		LanguageRegistry.addName(potion(PotionData.CONFUSION_META), Names.CONFUSION_NAME);
		LanguageRegistry.addName(potion(PotionData.RUINATION_META), Names.RUINATION_NAME);
		LanguageRegistry.addName(potion(PotionData.FERTILIZER_META), Names.FERTILIZER_NAME);
		LanguageRegistry.addName(potion(PotionData.EMPTY_VIAL_META), Names.EMPTY_VIAL_NAME);
		LanguageRegistry.addName(potion(PotionData.POTION_META), Names.POTION_NAME);
		LanguageRegistry.addName(potion(PotionData.SPEED_META), Names.SPEED_NAME);
		LanguageRegistry.addName(potion(PotionData.DIGGING_META), Names.DIGGING_NAME);
		LanguageRegistry.addName(potion(PotionData.STRENGTH_META), Names.STRENGTH_NAME);
		LanguageRegistry.addName(potion(PotionData.HEALING_META), Names.HEALING_NAME);
		LanguageRegistry.addName(potion(PotionData.BOUNDING_META), Names.BOUNDING_NAME);
		LanguageRegistry.addName(potion(PotionData.REGENERATION_META), Names.REGENERATION_NAME);
		LanguageRegistry.addName(potion(PotionData.RESISTANCE_META), Names.RESISTANCE_NAME);
		LanguageRegistry.addName(potion(PotionData.FIRE_WARDING_META), Names.FIRE_WARDING_NAME);
		LanguageRegistry.addName(potion(PotionData.BREATHING_META), Names.BREATHING_NAME);
		LanguageRegistry.addName(potion(PotionData.INVISIBILITY_META), Names.INVISIBILITY_NAME);
		LanguageRegistry.addName(potion(PotionData.INFRAVISION_META), Names.INFRAVISION_NAME);
		LanguageRegistry.addName(potion(PotionData.PROTECTION_META), Names.PROTECTION_NAME);
		LanguageRegistry.addName(potion(PotionData.POTENCE_META), Names.POTENCE_NAME);
		LanguageRegistry.addName(potion(PotionData.CELERITY_META), Names.CELERITY_NAME);
		LanguageRegistry.addName(potion(PotionData.PANACEA_META), Names.PANACEA_NAME);
		LanguageRegistry.addName(potion(PotionData.WATER_META), Names.WATER_NAME);
		
		//LanguageRegistry.addName(mercyCross, Names.CROSS_LOCAL);
		//LanguageRegistry.addName(holyHandGrenade, Names.GRENADE_LOCAL);
		//LanguageRegistry.addName(fortuneCoin, Names.FORTUNE_COIN_LOCAL);
		//LanguageRegistry.addName(glowingWater, Names.GLOWING_WATER_LOCAL);
		
		LanguageRegistry.addName(gunPart(0), Names.GUNPART_0_LOCAL);
		LanguageRegistry.addName(gunPart(1), Names.GUNPART_1_LOCAL);
		LanguageRegistry.addName(gunPart(2), Names.GUNPART_2_LOCAL);
		LanguageRegistry.addName(glowingBread, Names.BREAD_LOCAL);
		LanguageRegistry.addName(sojournerStaff, Names.TORCH_LOCAL);
		LanguageRegistry.addName(alkahestryTome, Names.TOME_LOCAL);
		LanguageRegistry.addName(midasTouchstone, Names.TOUCHSTONE_LOCAL);
		LanguageRegistry.addName(alkahest, Names.ALKAHEST_LOCAL);
		LanguageRegistry.addName(emperorChalice, Names.CHALICE_LOCAL);
		LanguageRegistry.addName(salamanderEye, Names.SALAMANDER_EYE_LOCAL);
		LanguageRegistry.addName(iceRod, Names.ICE_ROD_LOCAL);
		LanguageRegistry.addName(magicbane, Names.MAGICBANE_LOCAL);
		LanguageRegistry.addName(witherlessRose, Names.WITHERLESS_ROSE_LOCAL);
		LanguageRegistry.addName(enderStaff, Names.ENDER_STAFF_LOCAL);
		LanguageRegistry.addName(emptyVoidTear, Names.EMPTY_VOID_TEAR_LOCAL);
		LanguageRegistry.addName(voidTear, Names.VOID_TEAR_LOCAL);
		LanguageRegistry.addName(wraithEye, Names.WRAITH_EYE_LOCAL);
		LanguageRegistry.addName(voidSatchel, Names.VOID_SATCHEL_LOCAL);
		LanguageRegistry.addName(destructionCatalyst, Names.DESTRUCTION_CATALYST_LOCAL);
		LanguageRegistry.addName(apothecaryMortar, Names.APOTHECARY_MORTAR_LOCAL);
		LanguageRegistry.addName(gunsmithCrucible, Names.GUNSMITH_CRUCIBLE_LOCAL);
		LanguageRegistry.addName(potionEssence, Names.POTION_ESSENCE_LOCAL);
		LanguageRegistry.addName(stackedEssence, Names.STACKED_ESSENCE_LOCAL);
		LanguageRegistry.addName(alchemicalGunmetal, Names.ALCHEMICAL_GUNMETAL_LOCAL);
		LanguageRegistry.addName(alembic, Names.ALEMBIC_LOCAL);
		LanguageRegistry.addName(stoneSlug, Names.SLUG_LOCAL);
		LanguageRegistry.addName(alchemicalShell, Names.SHELL_LOCAL);
		addRecipes();
	}

	public static void addRecipes() {
		// bread
		GameRegistry.addShapelessRecipe(new ItemStack(glowingBread, 3), new Object[] { Item.bread, Item.bread, Item.bread, glowingWater });
		// bullets... TODO
		// shells and slugs recipes are needed.
		// coin
		GameRegistry.addRecipe(new ItemStack(fortuneCoin, 1), new Object[] { "ege", "ghg", "ege", 'e', Item.eyeOfEnder, 'g', Item.ingotGold, 'h', glowingWater });
		// cross
		GameRegistry.addRecipe(new ItemStack(mercyCross, 1), new Object[] { "wgw", "glg", "wgw", 'w', glowingWater, 'g', Item.ingotGold, 'l', Item.leather });
		// grenade
		GameRegistry.addRecipe(new ItemStack(holyHandGrenade, 4), new Object[] { "wgw", "gtg", "wgw", 'w', glowingWater, 'g', Item.goldNugget, 't', Block.tnt });
		// torch
		GameRegistry.addRecipe(new ItemStack(sojournerStaff, 1), new Object[] { "cgc", "gbg", "wgw", 'w', glowingWater, 'g', Item.ingotGold, 'b', Item.blazeRod, 'c', Item.magmaCream });
		// gunparts TODO
		// so these need to be redone.
		// handgun
		GameRegistry.addRecipe(new ItemStack(handgun, 1, 0), new Object[] { "bim", "isi", "igi", 'i', XRItems.alchemicalGunmetal, 'b', gunPart(1, 1), 'm', gunPart(1, 2), 'g', gunPart(1, 0), 's', Item.slimeBall });
		// tome
		GameRegistry.addShapelessRecipe(new ItemStack(alkahestryTome, 1, 0), new Object[] { Item.book, Item.blazeRod, Item.magmaCream, Item.ingotGold, Block.glowStone, Item.netherStalkSeeds, new ItemStack(Item.skull, 1, 1), Item.ghastTear, Item.bucketLava });
		// touchstone
		GameRegistry.addRecipe(new ItemStack(midasTouchstone, 1, 0), new Object[] { "bbb", "rtr", "ggg", 'b', Block.blockGold, 'r', Item.blazeRod, 'g', Item.ingotGold, 't', Item.ghastTear });
		// chalice
		GameRegistry.addRecipe(new ItemStack(emperorChalice, 1, 0), new Object[] { "gtg", "ege", "tgt", 't', Item.ghastTear, 'e', Item.emerald, 'g', Item.ingotGold });
		// alkahest
		GameRegistry.addShapelessRecipe(new ItemStack(alkahest, 1, 0), new Object[] { XRItems.alkahestryTome, Item.netherStar, Item.netherStar, Block.dragonEgg });
		// salamander's eye
		GameRegistry.addRecipe(new ItemStack(salamanderEye, 1, 0), new Object[] { "bcb", "tet", "bcb", 'b', Item.blazeRod, 'c', Item.magmaCream, 't', Item.ghastTear, 'e', Item.eyeOfEnder }); // wraith's
		// and the wraith's eye // upgrade
		GameRegistry.addRecipe(new ItemStack(wraithEye, 1, 0), new Object[] { "eee", "bsb", "eee", 'e', emptyVoidTear, 's', salamanderEye, 'b', Block.blockEmerald });
		// ice rod
		GameRegistry.addRecipe(new ItemStack(iceRod, 1, 0), new Object[] { "dtd", "tit", "tit", 'd', Item.diamond, 't', Item.ghastTear, 'i', Item.ingotIron });
		// magicbane
		GameRegistry.addRecipe(new ItemStack(magicbane, 1, 0), new Object[] { "eee", "ege", "iee", 'e', Item.eyeOfEnder, 'g', Item.ingotGold, 'i', Item.ingotIron });
		// witherless rose
		GameRegistry.addRecipe(new ItemStack(witherlessRose, 1, 0), new Object[] { "hnh", "nrn", "hnh", 'h', glowingWater, 'n', Item.netherStar, 'r', Block.plantRed });
		// ender staff
		GameRegistry.addRecipe(new ItemStack(enderStaff, 1, 0), new Object[] { "eee", "ewe", "eee", 'e', Item.eyeOfEnder, 'w', new ItemStack(Block.cloth, 1, 11) });
		// empty void tear
		GameRegistry.addRecipe(new ItemStack(emptyVoidTear, 1, 0), new Object[] { "et", "te", 'e', Item.eyeOfEnder, 't', Item.ghastTear });
		// void satchel
		GameRegistry.addRecipe(new ItemStack(voidSatchel, 1, -1), new Object[] { "lsl", "ltl", "lll", 'l', Item.leather, 's', Item.silk, 't', voidTear }); // upgrade
																																							// it!
		GameRegistry.addShapelessRecipe(new ItemStack(voidSatchel, 1, 0), new Object[] { emptyVoidTear, emptyVoidTear, emptyVoidTear, voidSatchel });
		// destruction catalyst
		GameRegistry.addRecipe(new ItemStack(destructionCatalyst, 1, 0), new Object[] { "rrr", "rtr", "rrf", 'f', Item.flint, 't', new ItemStack(midasTouchstone, 1, -1), 'r', Item.blazeRod });
		// potions!
		// empty vial
		GameRegistry.addRecipe(potion(5, PotionData.EMPTY_VIAL_META), new Object[] { "g g", "g g", " g ", 'g', Block.thinGlass });
		// base solvent
		GameRegistry.addShapelessRecipe(potion(PotionData.POTION_META), new Object[] { Item.netherStalkSeeds, Item.redstone, Item.lightStoneDust, potion(PotionData.WATER_META) });
		// base splash solvent
		GameRegistry.addShapelessRecipe(potion(PotionData.SPLASH_META), new Object[] { Item.netherStalkSeeds, Item.gunpowder, Item.lightStoneDust, potion(PotionData.WATER_META) });
		// glowing water
		GameRegistry.addShapelessRecipe(new ItemStack(glowingWater, 1), new Object[] { potion(PotionData.SPLASH_META), Item.lightStoneDust, Item.lightStoneDust, Item.lightStoneDust });
		// speed potion
		GameRegistry.addShapelessRecipe(potion(PotionData.SPEED_META), new Object[] { potion(PotionData.POTION_META), Item.sugar, Item.redstone, Item.lightStoneDust });
		// dig potion
		GameRegistry.addShapelessRecipe(potion(PotionData.DIGGING_META), new Object[] { potion(PotionData.POTION_META), Item.bone, Item.redstone, Item.lightStoneDust });
		// strength potion
		GameRegistry.addShapelessRecipe(potion(PotionData.STRENGTH_META), new Object[] { potion(PotionData.POTION_META), Item.blazePowder, Item.redstone, Item.lightStoneDust });
		// heal potion
		GameRegistry.addShapelessRecipe(potion(PotionData.HEALING_META), new Object[] { potion(PotionData.POTION_META), Item.speckledMelon, Item.lightStoneDust, Item.lightStoneDust });
		// jump potion
		GameRegistry.addShapelessRecipe(potion(PotionData.BOUNDING_META), new Object[] { potion(PotionData.POTION_META), Item.feather, Item.redstone, Item.lightStoneDust });
		// regen potion
		GameRegistry.addShapelessRecipe(potion(PotionData.REGENERATION_META), new Object[] { potion(PotionData.POTION_META), Item.ghastTear, Item.redstone, Item.redstone });
		// resist potion
		GameRegistry.addShapelessRecipe(potion(PotionData.RESISTANCE_META), new Object[] { potion(PotionData.POTION_META), Item.leather, Item.redstone, Item.redstone });
		// fire resist potion
		GameRegistry.addShapelessRecipe(potion(PotionData.FIRE_WARDING_META), new Object[] { potion(PotionData.POTION_META), Item.magmaCream, Item.redstone, Item.redstone });
		// breathing potion
		GameRegistry.addShapelessRecipe(potion(PotionData.BREATHING_META), new Object[] { potion(PotionData.POTION_META), new ItemStack(Item.dyePowder, 1, 0), Item.redstone, Item.redstone });
		// invis potion
		GameRegistry.addShapelessRecipe(potion(PotionData.INVISIBILITY_META), new Object[] { potion(PotionData.INFRAVISION_META), Item.fermentedSpiderEye, Item.redstone, Item.redstone });
		// vision potion
		GameRegistry.addShapelessRecipe(potion(PotionData.INFRAVISION_META), new Object[] { potion(PotionData.POTION_META), Item.goldenCarrot, Item.redstone, Item.redstone });
		// protection potion
		GameRegistry.addShapelessRecipe(potion(8, PotionData.PROTECTION_META), new Object[] { potion(PotionData.FIRE_WARDING_META), potion(PotionData.FIRE_WARDING_META), potion(PotionData.FIRE_WARDING_META), potion(PotionData.FIRE_WARDING_META), Item.lightStoneDust, potion(PotionData.RESISTANCE_META), potion(PotionData.RESISTANCE_META), potion(PotionData.RESISTANCE_META), potion(PotionData.RESISTANCE_META) });
		// potence potion
		GameRegistry.addShapelessRecipe(potion(8, PotionData.POTENCE_META), new Object[] { potion(PotionData.STRENGTH_META), potion(PotionData.STRENGTH_META), potion(PotionData.STRENGTH_META), potion(PotionData.STRENGTH_META), Item.lightStoneDust, potion(PotionData.BOUNDING_META), potion(PotionData.BOUNDING_META), potion(PotionData.BOUNDING_META), potion(PotionData.BOUNDING_META) });
		// celerity potion
		GameRegistry.addShapelessRecipe(potion(8, PotionData.CELERITY_META), new Object[] { potion(PotionData.DIGGING_META), potion(PotionData.DIGGING_META), potion(PotionData.DIGGING_META), potion(PotionData.DIGGING_META), Item.lightStoneDust, potion(PotionData.SPEED_META), potion(PotionData.SPEED_META), potion(PotionData.SPEED_META), potion(PotionData.SPEED_META) });
		// panacea potion
		GameRegistry.addShapelessRecipe(potion(8, PotionData.PANACEA_META), new Object[] { potion(PotionData.HEALING_META), potion(PotionData.HEALING_META), potion(PotionData.HEALING_META), potion(PotionData.HEALING_META), Item.bucketMilk, potion(PotionData.REGENERATION_META), potion(PotionData.REGENERATION_META), potion(PotionData.REGENERATION_META), potion(PotionData.REGENERATION_META) });
		// aphrodite
		GameRegistry.addShapelessRecipe(potion(PotionData.APHRODITE_META), new Object[] { potion(PotionData.SPLASH_META), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Item.dyePowder, 1, 1), Item.redstone });
		// poison
		GameRegistry.addShapelessRecipe(potion(PotionData.POISON_META), new Object[] { potion(PotionData.SPLASH_META), Item.spiderEye, Item.fermentedSpiderEye, Item.redstone });
		// harm
		GameRegistry.addShapelessRecipe(potion(PotionData.ACID_META), new Object[] { potion(PotionData.SPLASH_META), Item.speckledMelon, Item.fermentedSpiderEye, Item.lightStoneDust });
		// confusion
		GameRegistry.addShapelessRecipe(potion(PotionData.CONFUSION_META), new Object[] { potion(PotionData.SPLASH_META), Item.goldenCarrot, Item.fermentedSpiderEye, Item.redstone });
		// slowness
		GameRegistry.addShapelessRecipe(potion(PotionData.SLOWING_META), new Object[] { potion(PotionData.SPLASH_META), Item.sugar, Item.fermentedSpiderEye, Item.lightStoneDust });
		// weakness
		GameRegistry.addShapelessRecipe(potion(PotionData.WEAKNESS_META), new Object[] { potion(PotionData.SPLASH_META), Item.blazePowder, Item.fermentedSpiderEye, Item.lightStoneDust });
		// wither
		GameRegistry.addShapelessRecipe(potion(PotionData.WITHER_META), new Object[] { potion(PotionData.SPLASH_META), new ItemStack(Item.skull, 1, 1), Item.lightStoneDust, Item.lightStoneDust });
		// blindness
		GameRegistry.addShapelessRecipe(potion(PotionData.BLINDING_META), new Object[] { potion(PotionData.SPLASH_META), Item.goldenCarrot, Item.fermentedSpiderEye, Item.goldenCarrot });
		// ruin
		GameRegistry.addShapelessRecipe(potion(3, PotionData.RUINATION_META), new Object[] { potion(PotionData.SLOWING_META), potion(PotionData.WEAKNESS_META), potion(PotionData.POISON_META), Item.lightStoneDust });
		// fertility
		GameRegistry.addShapelessRecipe(potion(PotionData.FERTILIZER_META), new Object[] { potion(PotionData.SPLASH_META), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.dyePowder, 1, 15) });
		GameRegistry.registerCraftingHandler(new WaterHandler());
		GameRegistry.registerCraftingHandler(new AlkahestHandler());
		GameRegistry.registerCraftingHandler(new VoidUpgradeHandler());
		GameRegistry.registerCraftingHandler(new VoidSatchelHandler());
		// URGENT TODO DEBUG RECIPES NEED TO BE REMOVED EVERY RELEASE!
		// IF THERE'S NOTHING BELOW THIS POINT, GREAT.
	}

	public static void registerLiquidContainer() {
		LiquidContainerRegistry.registerLiquid(new LiquidContainerData(new LiquidStack(Block.waterStill, LiquidContainerRegistry.BUCKET_VOLUME / 8), new ItemStack(condensedPotion, PotionData.WATER_META), new ItemStack(condensedPotion, PotionData.EMPTY_VIAL_META)));
	}
}
