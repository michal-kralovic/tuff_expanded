package net.minkuh.tuff_expanded.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

import static net.minecraft.block.Blocks.TUFF;

public class TuffStairs extends StairsBlock {
    public TuffStairs(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }
}
