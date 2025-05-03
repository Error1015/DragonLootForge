package org.error1015.dragonloot.item.armor

import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.world.item.ArmorItem
import net.minecraft.world.item.ArmorMaterial
import net.minecraft.world.item.crafting.Ingredient
import org.error1015.dragonloot.config.DragonLootConfig
import org.error1015.dragonloot.item.ModItems

object DragonArmorMaterial : ArmorMaterial {
    private val BASE_DURABILITY = intArrayOf(28, 32, 35, 26)
    private val PROTECTION_AMOUNTS = intArrayOf(
        DragonLootConfig.dragon_armor_protection_boots, DragonLootConfig.dragon_armor_protection_leggings, DragonLootConfig.dragon_armor_protection_chest, DragonLootConfig.dragon_armor_protection_helmet
    )

    override fun getDurabilityForType(pType: ArmorItem.Type) = BASE_DURABILITY[pType.slot.index] * 37

    override fun getDefenseForType(pType: ArmorItem.Type) = PROTECTION_AMOUNTS[pType.slot.index]

    override fun getEnchantmentValue(): Int = DragonLootConfig.dragon_armor_enchantability

    override fun getEquipSound(): SoundEvent = SoundEvents.ARMOR_EQUIP_NETHERITE

    override fun getRepairIngredient(): Ingredient = Ingredient.of(ModItems.dragonScaleItem)

    override fun getName() = "dragon"

    override fun getToughness(): Float = DragonLootConfig.dragon_armor_toughness

    override fun getKnockbackResistance(): Float = DragonLootConfig.dragon_armor_knockback_resistance
}