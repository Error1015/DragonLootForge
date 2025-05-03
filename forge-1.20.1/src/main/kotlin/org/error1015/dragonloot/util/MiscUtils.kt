package org.error1015.dragonloot.util

import net.minecraft.resources.ResourceLocation
import org.error1015.dragonloot.MODID
import java.util.UUID

fun String.asPath(): ResourceLocation = ResourceLocation(MODID, this)

fun String.asUUID(): UUID = UUID.fromString(this)