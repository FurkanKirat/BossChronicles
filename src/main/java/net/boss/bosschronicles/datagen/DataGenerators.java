package net.boss.bosschronicles.datagen;

import net.boss.bosschronicles.BossChroniclesMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = BossChroniclesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void generateData(GatherDataEvent event){
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        dataGenerator.addProvider(event.includeServer(), new ModRecipeGenerator(packOutput, lookupProvider));
        dataGenerator.addProvider(event.includeServer(), ModLootTableGenerator.create(packOutput, lookupProvider));
        ModBlockTagGenerator blockTagGenerator = new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper);
        dataGenerator.addProvider(event.includeServer(), blockTagGenerator);
        dataGenerator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider
               , blockTagGenerator.contentsGetter(), existingFileHelper));

        dataGenerator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput,existingFileHelper));
        dataGenerator.addProvider(event.includeClient(), new ModBlockStateGenerator(packOutput,existingFileHelper));



    }

}
