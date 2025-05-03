package org.error1015.dragonloot.item.armor

import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Multimap
import net.minecraft.world.entity.EquipmentSlot
import net.minecraft.world.entity.ai.attributes.Attribute
import net.minecraft.world.entity.ai.attributes.AttributeModifier
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.item.ArmorItem
import net.minecraft.world.item.ArmorMaterial
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.block.DispenserBlock
import org.error1015.dragonloot.util.asUUID
import java.util.*

class DragonArmor : ArmorItem {
    private val attributeModifiers: Multimap<Attribute, AttributeModifier>
    private val protection: Int
    private val toughness: Float
    private val knockbackResistance_: Float
    private val slot: EquipmentSlot
    private val material_: ArmorMaterial

    constructor(
        material: ArmorMaterial,
        type: Type,
        properties: Properties,
    ) : super(material, type, properties) {
        this.material_ = material
        this.slot = type.slot
        this.protection = material.getDefenseForType(type)
        this.toughness = material.toughness
        this.knockbackResistance_ = material.knockbackResistance
        DispenserBlock.registerBehavior(this, DISPENSE_ITEM_BEHAVIOR)
        val uuid = MODIFIERS[slot.index]
        val builder = ImmutableMultimap.builder<Attribute, AttributeModifier>()
        builder.put(Attributes.ARMOR, AttributeModifier(uuid, "Dragon armor modifier", protection.toDouble(), AttributeModifier.Operation.ADDITION))
        builder.put(Attributes.ARMOR_TOUGHNESS, AttributeModifier(uuid, "Dragon armor toughness", toughness.toDouble(), AttributeModifier.Operation.ADDITION))
        builder.put(Attributes.KNOCKBACK_RESISTANCE, AttributeModifier(uuid, "Dragon armor knockback resistance", knockbackResistance_.toDouble() / 10, AttributeModifier.Operation.ADDITION))
        attributeModifiers = builder.build()
    }

    override fun getAttributeModifiers(
        slot: EquipmentSlot,
        stack: ItemStack
    ): Multimap<Attribute, AttributeModifier> {
        return if (slot == this.slot) this.attributeModifiers else super.getAttributeModifiers(slot, stack)
    }

    companion object {
        @JvmStatic
        val MODIFIERS = arrayOf<UUID>(
            "845DB27C-C624-495F-8C9F-6020A9A58B6B".asUUID(), "D8499B04-0E66-4726-AB29-64469D734E0D".asUUID(), "9F3D476D-C118-4544-8365-64846904B48E".asUUID(),
            "2AD3F246-FEE1-4E67-B886-69FD380BB150".asUUID()
        )
    }
}