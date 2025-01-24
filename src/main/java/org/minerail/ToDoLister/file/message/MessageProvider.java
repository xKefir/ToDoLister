package org.minerail.ToDoLister.file.message;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import org.minerail.ToDoLister.util.TextFormatUtil;

import java.util.List;

public class MessageProvider {
    public static Component get(MessageKey key, TagResolver... resolvers) {
        return TextFormatUtil.format(MessageProviderLoader.getLoader().getString(key.getPath()), resolvers);
    }
    public static List<Component> getList(MessageKey key, TagResolver... resolvers) {
        return TextFormatUtil.format(MessageProviderLoader.getLoader().getStringList(key.getPath()), resolvers);
    }
}
