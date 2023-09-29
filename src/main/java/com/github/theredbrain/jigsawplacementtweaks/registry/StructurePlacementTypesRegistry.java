package com.github.theredbrain.jigsawplacementtweaks.registry;

import com.github.theredbrain.jigsawplacementtweaks.JigsawPlacementTweaks;
import com.github.theredbrain.jigsawplacementtweaks.world.gen.chunk.placement.FixedStructurePlacement;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.chunk.placement.StructurePlacementType;

public class StructurePlacementTypesRegistry {
    public static StructurePlacementType<FixedStructurePlacement> FIXED = () -> {
        return FixedStructurePlacement.CODEC;
    };

    public static void register() {
        Registry.register(Registries.STRUCTURE_PLACEMENT, JigsawPlacementTweaks.identifier("fixed"), FIXED);
    }
}
