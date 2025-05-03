package org.error1015.dragonloot

import net.minecraftforge.fml.common.Mod
import org.error1015.dragonloot.block.ModBlocks
import org.error1015.dragonloot.item.ModItems
import thedarkcolour.kotlinforforge.forge.MOD_BUS

const val MODID = "dragonlootforge"

@Mod(MODID)
class DragonLootForgeMod {

    init {
        ModItems.registries.register(MOD_BUS)
        ModBlocks.registries.register(MOD_BUS)
        ModCreativeTab.registries.register(MOD_BUS)
    }
}