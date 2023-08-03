package manifold.mod;

import manifold.ext.rt.api.auto; // im sorry i couldnt resist
import org.slf4j.LoggerFactory;

public class Manifold {
	public static final auto ID = "manifold";
	public static final auto LOGGER = LoggerFactory.getLogger("Manifold");

	public static void init() {
		LOGGER.info("Manifold exists");
	}
}
