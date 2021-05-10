package rmc.mixins.we_net_mismatch.actual;

import java.util.function.Predicate;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * Developed by RMC Team, 2021
 */
@Mixin(targets = "com.sk89q.worldedit.forge.net.handler.PacketHandlerUtil")
public abstract class PacketHandlerUtilMixin {

    @Overwrite
    private static Predicate<String> validateLenient(String protocolVersion) {
        return remoteVersion -> true;
    }

}