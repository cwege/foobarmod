
package net.mcreator.foobarmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.foobarmod.itemgroup.FooBarItemGroup;
import net.mcreator.foobarmod.FoobarmodModElements;

@FoobarmodModElements.ModElement.Tag
public class GarlicItem extends FoobarmodModElements.ModElement {
	@ObjectHolder("foobarmod:garlic")
	public static final Item block = null;
	public GarlicItem(FoobarmodModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(FooBarItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.6f).build()));
			setRegistryName("garlic");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
