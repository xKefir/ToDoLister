package org.minerail.ToDoLister.command.subcommand;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;

public class Admin implements SubCommand{
    @Override
    public LiteralArgumentBuilder<CommandSourceStack> get() {
        return null;
    }
}
