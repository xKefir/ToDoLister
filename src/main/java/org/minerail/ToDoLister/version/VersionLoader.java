package org.minerail.ToDoLister.version;

import org.minerail.ToDoLister.version.handlers.Version_1_21;
import org.minerail.ToDoLister.version.handlers.Version_1_21_1;

public class VersionLoader {
    public static VersionHandler loadVersionHandler(String version) {
        switch (version) {
            case "v1_21":
                return new Version_1_21();
            case "v1_21_1":
                return new Version_1_21_1();
            default:
                throw new UnsupportedOperationException("Version " + version + " is not supported.");
        }
    }
}