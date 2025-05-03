package org.error1015.dragonloot.entity

import net.minecraft.world.entity.EntityType
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import org.error1015.dragonloot.MODID

class ModEntities {
    val registries: DeferredRegister<EntityType<*>> = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID)
}