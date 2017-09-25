package com.tanayseven.uiarchitectures;

import java.util.Collection;

/**
 * Created by tanay on 25/9/17.
 */

public enum Events {
    Events;

    public static void fire(Collection<Executor> listeners) {
        for (Executor executor:listeners)
            executor.execute();
    }
}
