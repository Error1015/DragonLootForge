package org.error1015.dragonloot.block

import net.minecraft.world.level.block.AnvilBlock
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import org.error1015.dragonloot.MODID
import thedarkcolour.kotlinforforge.forge.registerObject

object ModBlocks {
    val registries: DeferredRegister<Block> = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID)

    val dragonAnvilBlock by registries.registerObject("dragon_anvil") {
        AnvilBlock(BlockBehaviour.Properties.copy(Blocks.ANVIL))
    }
}