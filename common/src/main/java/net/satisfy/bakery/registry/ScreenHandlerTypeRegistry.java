package net.satisfy.bakery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.satisfy.bakery.Bakery;
import net.satisfy.bakery.client.gui.handler.CookingPotGuiHandler;
import net.satisfy.bakery.client.gui.handler.StoveGuiHandler;

import java.util.function.Supplier;


public class ScreenHandlerTypeRegistry {

    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(Bakery.MOD_ID, Registries.MENU);

    public static final RegistrySupplier<MenuType<StoveGuiHandler>> STOVE_SCREEN_HANDLER = create("stove_gui_handler", () -> new MenuType<>(StoveGuiHandler::new, FeatureFlags.VANILLA_SET));
    public static final RegistrySupplier<MenuType<CookingPotGuiHandler>> COOKING_POT_SCREEN_HANDLER = create("cooking_pot_gui_handler", () -> new MenuType<>(CookingPotGuiHandler::new, FeatureFlags.VANILLA_SET));


    public static void init() {
        MENU_TYPES.register();
    }

    private static <T extends MenuType<?>> RegistrySupplier<T> create(String name, Supplier<T> type) {
        return MENU_TYPES.register(name, type);
    }
}
