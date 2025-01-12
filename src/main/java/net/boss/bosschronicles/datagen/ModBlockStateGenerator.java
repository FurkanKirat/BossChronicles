package net.boss.bosschronicles.datagen;

import net.boss.bosschronicles.BossChroniclesMod;
import net.boss.bosschronicles.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateGenerator extends BlockStateProvider {
    public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BossChroniclesMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.RUBY_BLOCK.get(), cubeAll(ModBlocks.RUBY_BLOCK.get()));
        simpleBlockWithItem(ModBlocks.RUBY_ORE.get(), cubeAll(ModBlocks.RUBY_ORE.get()));
    }
}
