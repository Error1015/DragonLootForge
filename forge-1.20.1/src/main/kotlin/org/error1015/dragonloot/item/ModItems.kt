package org.error1015.dragonloot.item

import net.minecraft.world.item.ArmorItem
import net.minecraft.world.item.AxeItem
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.BowItem
import net.minecraft.world.item.CrossbowItem
import net.minecraft.world.item.HoeItem
import net.minecraft.world.item.HorseArmorItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.PickaxeItem
import net.minecraft.world.item.ShovelItem
import net.minecraft.world.item.SwordItem
import net.minecraft.world.item.TridentItem
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import org.error1015.dragonloot.MODID
import org.error1015.dragonloot.block.ModBlocks
import org.error1015.dragonloot.item.armor.DragonArmor
import org.error1015.dragonloot.item.armor.DragonArmorMaterial
import org.error1015.dragonloot.item.common.DragonScaleItem
import thedarkcolour.kotlinforforge.forge.registerObject

object ModItems {
    val registries: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS, MODID)

    val dragonAnvilBlockItem: Item by registries.registerObject("dragon_anvil") {
        BlockItem(ModBlocks.dragonAnvilBlock, Item.Properties())
    }

    val dragonHorseArmor by registries.registerObject("dragon_horse_armor") {
        HorseArmorItem(
            18, "dragon", Item
                .Properties()
                .stacksTo(1)
                .fireResistant()
        )
    }

    val dragonScaleItem by registries.registerObject("dragon_scale") { DragonScaleItem }

    // ARMORS
    val dragonHelmet by registries.registerObject("dragon_helmet") {
        DragonArmor(
            DragonArmorMaterial, ArmorItem.Type.HELMET, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonChest by registries.registerObject("dragon_chestplate") {
        DragonArmor(
            DragonArmorMaterial, ArmorItem.Type.CHESTPLATE, Item
                .Properties()
                .fireResistant()
        )
    }

    val upgradedDragonChest by registries.registerObject("upgraded_dragon_chestplate") {
        DragonArmor(
            DragonArmorMaterial, ArmorItem.Type.CHESTPLATE, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonLeggings by registries.registerObject("dragon_leggings") {
        DragonArmor(
            DragonArmorMaterial, ArmorItem.Type.LEGGINGS, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonBoots by registries.registerObject("dragon_boots") {
        DragonArmor(
            DragonArmorMaterial, ArmorItem.Type.BOOTS, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonPickAxe by registries.registerObject("dragon_pickaxe") {
        PickaxeItem(
            DragonTier, 1, -2.8f, Item
                .Properties()
                .fireResistant()
        )
    }

    // TOOLS
    val dragonAxe by registries.registerObject("dragon_axe") {
        AxeItem(
            DragonTier, 5f, -3f, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonShovel by registries.registerObject("dragon_shovel") {
        ShovelItem(
            DragonTier, 1.5f, -3f, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonHoe by registries.registerObject("dragon_hoe") {
        HoeItem(
            DragonTier, -4, -2f, Item
                .Properties()
                .fireResistant()
        )
    }

    // WEAPONS
    val dragonSword by registries.registerObject("dragon_sword") {
        SwordItem(
            DragonTier, 3, -2.4f, Item
                .Properties()
                .fireResistant()
        )
    }

    val dragonBow by registries.registerObject("dragon_bow") {
        BowItem(
            Item
                .Properties()
                .fireResistant()
                .defaultDurability(DragonTier.uses)
        )
    }

    val dragonCrossbow by registries.registerObject("dragon_crossbow") {
        CrossbowItem(
            Item
                .Properties()
                .fireResistant()
                .defaultDurability(DragonTier.uses)
        )
    }

    val dragonTrident by registries.registerObject("dragon_trident") {
        TridentItem(
            Item
                .Properties()
                .fireResistant()
                .defaultDurability(DragonTier.uses)
        )
    }
}