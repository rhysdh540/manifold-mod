package manifold.mod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manifold {
	public static final String ID = "manifold";
	public static final Logger LOGGER = LoggerFactory.getLogger("Manifold");

	public static void init() {
		LOGGER.info("Manifold exists");
	}
}
