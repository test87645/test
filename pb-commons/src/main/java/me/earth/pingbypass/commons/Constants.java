package me.earth.pingbypass.commons;

import me.earth.pingbypass.api.config.properties.Property;
import net.minecraft.SharedConstants;

import java.util.Random;

import static me.earth.pingbypass.api.config.properties.PropertyHelper.string;

/**
 * @see net.minecraft.SharedConstants
 */
public interface Constants {
    Property<String> ID = string("pb.id", null);
    /**
     * Use this SystemProperty to specify PluginConfigs that are already on the classpath.
     * This could be e.g. if you are developing a plugin for PingBypass inside your IDE and you use 'runClient'.
     */
    String CLASSPATH_PLUGINS = "pb.classpath.plugins";
    Random RANDOM = new Random();
    String NAME = "PingBypass";
    String NAME_LOW = "pingbypass";
    String VERSION = "0.0.1";
    String NAME_VERSION = NAME + "-" + VERSION;
    String MC = "1.20.1";
    int MC_PROTOCOL = SharedConstants.getProtocolVersion();
    int DEFAULT_PORT = 25565;
    @SuppressWarnings("deprecation")
    int PACK_FORMAT = SharedConstants.RESOURCE_PACK_FORMAT;

}
