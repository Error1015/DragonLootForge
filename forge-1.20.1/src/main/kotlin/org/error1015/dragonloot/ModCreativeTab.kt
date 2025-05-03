package org.error1015.dragonloot

import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.registries.DeferredRegister
import org.error1015.dragonloot.item.ModItems
import thedarkcolour.kotlinforforge.forge.registerObject

object ModCreativeTab {
    val registries: DeferredRegister<CreativeModeTab> = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID)

    val dragonLootModTab: CreativeModeTab by registries.registerObject("dragonloot_tab") {
        CreativeModeTab
            .builder()
            .title(Component.translatable("tab.$MODID"))
            .icon { ModItems.dragonSword.defaultInstance }
            .displayItems { _, output ->
                ModItems.registries.entries.forEach { itemObj -> output.accept(itemObj.get().defaultInstance) }
            }
            .build()
    }
}