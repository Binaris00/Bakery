package satisfy.bakery.forge.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.forge.REIPluginClient;
import satisfy.bakery.compat.rei.BakeryREIClientPlugin;

@REIPluginClient
@SuppressWarnings("unused")
public class BakeryREIClientPluginForge implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        BakeryREIClientPlugin.registerCategories(registry);
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        BakeryREIClientPlugin.registerDisplays(registry);
    }
}
