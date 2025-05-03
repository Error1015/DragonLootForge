package org.error1015.dragonloot.item

import net.minecraft.world.item.Tier
import net.minecraft.world.item.crafting.Ingredient
import org.error1015.dragonloot.config.DragonLootConfig

object DragonTier : Tier {
    override fun getUses(): Int = 67 * DragonLootConfig.dragon_item_durability_multiplier

    override fun getSpeed(): Float = 12f

    override fun getAttackDamageBonus(): Float = DragonLootConfig.dragon_item_base_damage

    override fun getLevel(): Int = 5

    override fun getEnchantmentValue(): Int = DragonLootConfig.dragon_tool_enchantability

    override fun getRepairIngredient(): Ingredient =  Ingredient.of(ModItems.dragonScaleItem)

    // For LevelZ compat
    override fun toString(): String = "DRAGON"
}