package manifold.mod.fabric;

import manifold.mod.Manifold;
import net.fabricmc.api.ModInitializer;

public class ManifoldFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Manifold.init();
    }
}