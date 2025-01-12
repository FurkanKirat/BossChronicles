package net.boss.bosschronicles.datagen;

import net.boss.bosschronicles.BossChroniclesMod;
import net.boss.bosschronicles.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(PackOutput pOutput, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, BossChroniclesMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        basicItem(ModItems.RUBY.getId());
    }
}
