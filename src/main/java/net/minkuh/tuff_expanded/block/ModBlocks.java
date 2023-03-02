package net.minkuh.tuff_expanded.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minkuh.tuff_expanded.TuffExpanded;
import net.minkuh.tuff_expanded.block.custom.TuffStairs;

import static net.minecraft.block.Blocks.TUFF;

public class ModBlocks {

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new TuffStairs(TUFF.getDefaultState(), FabricBlockSettings.copy(TUFF)), ItemGroups.NATURAL);

    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.TUFF).requiresTool().strength(1.5f, 6.0f)), ItemGroups.NATURAL);

    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copy(TUFF)), ItemGroups.NATURAL);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(TuffExpanded.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries-> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(TuffExpanded.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TuffExpanded.LOGGER.debug("Registering modded blocks for: " + TuffExpanded.MOD_ID);
    }

}
