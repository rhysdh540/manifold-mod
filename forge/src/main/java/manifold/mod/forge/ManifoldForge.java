package manifold.mod.forge;

import manifold.mod.Manifold;
import net.minecraftforge.fml.common.Mod;

@Mod(Manifold.ID)
public class ManifoldForge {
    public ManifoldForge() {
        Manifold.init();
    }
}