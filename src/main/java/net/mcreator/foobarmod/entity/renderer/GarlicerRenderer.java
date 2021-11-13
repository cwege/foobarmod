package net.mcreator.foobarmod.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class GarlicerRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GarlicerEntity.entity,
					renderManager -> new MobRenderer(renderManager, new GhastModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("foobarmod:textures/evilgarlicer.png");
						}
					});

		}
	}

}
