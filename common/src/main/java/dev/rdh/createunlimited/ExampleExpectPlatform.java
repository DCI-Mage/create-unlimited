package dev.rdh.createunlimited;

import dev.architectury.injectables.annotations.ExpectPlatform;
#if POST_MC_1_16_5
import dev.architectury.platform.Platform;
#else
import me.shedaniel.architectury.platform.Platform;
#endif

import java.nio.file.Path;

public class ExampleExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: dev.rdh.createunlimited.ExampleExpectPlatform#getConfigDirectory()
     * Actual Fabric: net.createunlimited.fabric.ExampleExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: net.createunlimited.forge.ExampleExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}