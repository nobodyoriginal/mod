package myMod.Blocks;

import myMod.ExampleMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {
	public static final DeferredRegister<Block> MODDED_BLOCKS= DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
    public static final DeferredRegister<Item> MODDED_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
	
	public static final RegistryObject<Block> BATTERY_BLOCK = MODDED_BLOCKS.register("battery_block",() -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
	public static final RegistryObject<Item> BATTERY_BLOCK_ITEM = MODDED_ITEMS.register("battery", () -> new BlockItem(BATTERY_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public void register() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
