package org.minerail.ToDoLister.command;

import io.papermc.paper.command.brigadier.Commands;
import org.bukkit.command.CommandSender;
import org.minerail.ToDoLister.ToDoLister;
import org.minerail.ToDoLister.command.subcommand.Open;

import java.util.List;

public class CommandMTD {

    @SuppressWarnings("Invalid Api Usage.")
    public void register(Commands cmds) {
        cmds.register(ToDoLister.get().getPluginMeta(),
        Commands.literal("mtd").executes(ctx -> execute(ctx.getSource().getSender())
                )
                .requires(ctx ->
                        ctx.getSender().hasPermission("mtd.use")
                )
                .then(new Open().get())
                .build(), null, List.of("mtd")
        );
    }
    private int execute(CommandSender sender) {
        return 1;
    }
}
