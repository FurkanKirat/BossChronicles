package net.boss.bosschronicles.datagen;

import net.boss.bosschronicles.datagen.loot.ModBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator {
    public static LootTableProvider create(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider){
        return new LootTableProvider(packOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTables::new,
                        LootContextParamSets.BLOCK)),lookupProvider);
    }
}
