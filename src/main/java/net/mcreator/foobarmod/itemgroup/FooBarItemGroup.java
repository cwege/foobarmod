
package net.mcreator.foobarmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.foobarmod.block.SternchenBlockBlock;
import net.mcreator.foobarmod.FoobarmodModElements;

@FoobarmodModElements.ModElement.Tag
public class FooBarItemGroup extends FoobarmodModElements.ModElement {
	public FooBarItemGroup(FoobarmodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfoo_bar") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SternchenBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
