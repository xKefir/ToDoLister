package org.minerail.ToDoLister.command.subcommand;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;
import org.bukkit.command.CommandSender;
import org.minerail.ToDoLister.ToDoLister;
import org.minerail.ToDoLister.file.message.MessageKey;
import org.minerail.ToDoLister.file.message.MessageProvider;

public class Reload implements SubCommand {
    @Override
    public LiteralArgumentBuilder<CommandSourceStack> get() {
        return Commands.literal("reload")
                .requires(ctx -> ctx.getSender().hasPermission("mtd.reload"))
                .executes(ctx -> execute(ctx.getSource().getSender()));
    }
    private int execute(CommandSender sender) {
        try {
            sender.sendMessage(MessageProvider.get(MessageKey.MESSAGES_COMMAND_RELOAD_SUCCESS,
                    Placeholder.component("prefix", MessageProvider.get(MessageKey.MESSAGES_PREFIX_STRING))));
            ToDoLister.reloadAll();
            return 1;
        } catch (Exception e) {
            sender.sendMessage(MessageProvider.get(MessageKey.MESSAGES_COMMAND_RELOAD_FAILED,
                    Placeholder.component("prefix", MessageProvider.get(MessageKey.MESSAGES_PREFIX_STRING))));
            ToDoLister.get().getLogger().warning("Error occurred while reloading! Message: " + e.getMessage());
            return 1;
        }
    }
}
