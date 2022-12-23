package com.ordana.underground_overhaul.events;

import com.ordana.underground_overhaul.UndergroundOverhaul;
import net.mehvahdjukaar.moonlight.api.platform.ForgeHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;

import java.util.function.Consumer;

public class ModLootInjects {

    public static void onLootInject(LootTables lootManager, ResourceLocation name, Consumer<LootPool.Builder> builderConsumer) {

        if (name.equals(new ResourceLocation("minecraft", "chests/abandoned_mineshaft"))) {
            {
                LootPool.Builder pool = LootPool.lootPool();
                String id = "mineshaft";
                pool.add(LootTableReference.lootTableReference(UndergroundOverhaul.res("injects/" + id)));
                ForgeHelper.setPoolName(pool, "UA_" + id);
                builderConsumer.accept(pool);
            }
        }
    }
}
