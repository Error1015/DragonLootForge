package org.error1015.dragonloot

import net.minecraftforge.fml.common.Mod
import org.slf4j.LoggerFactory

const val MODID = "dragonlootforge"

@Mod(MODID)
class DragonLootForgeMod {

    private val logger = LoggerFactory.getLogger(MODID)

    init {
        logger.info("Hello")
    }
}