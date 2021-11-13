
package net.mcreator.foobarmod.item;

@FoobarmodModElements.ModElement.Tag
public class HerzdiebItem extends FoobarmodModElements.ModElement {

	@ObjectHolder("foobarmod:herzdieb")
	public static final Item block = null;

	public HerzdiebItem(FoobarmodModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 15;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("herzdieb"));
	}

}
