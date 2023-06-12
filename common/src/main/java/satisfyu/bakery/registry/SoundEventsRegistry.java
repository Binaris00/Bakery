package satisfyu.bakery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import satisfyu.bakery.Bakery;
import satisfyu.bakery.BakeryIdentifier;

public class SoundEventsRegistry {

    private static final Registrar<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Bakery.MOD_ID, Registry.SOUND_EVENT_REGISTRY).getRegistrar();
    public static final RegistrySupplier<SoundEvent> BLOCK_COOKING_POT_JUICE_BOILING = create("juice_boiling");



    private static RegistrySupplier<SoundEvent> create(String name) {
        final ResourceLocation id = new BakeryIdentifier(name);
        return SOUND_EVENTS.register(id, () -> new SoundEvent(id));
    }

    public static void init() {
        Bakery.LOGGER.debug("Registering Sounds for " + Bakery.MOD_ID);
    }
}
