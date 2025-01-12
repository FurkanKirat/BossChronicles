package net.boss.bosschronicles.datagen;

import net.boss.bosschronicles.block.ModBlocks;
import net.boss.bosschronicles.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.entity.monster.Zombie;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends RecipeProvider {
    public ModRecipeGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RUBY.get(), RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());
    }
    Zombie
}
