package com.binarybears.regame.dummy;

import com.binarybears.regame.DataLayer.Game;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Game> ITEMS = new ArrayList<Game>();
    public static final HashMap<Long, Game> ITEMS_MAP = new HashMap<Long, Game>();
    /**
     * A map of sample (dummy) items, by ID.
     */

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (long i = 1; i <= COUNT; i++) {
            addItem(createGameItem(i));
        }
    }

    private static void addItem(Game item) {
        ITEMS.add(item);
        ITEMS_MAP.put(item.getID(), item);
    }

    private static Game createGameItem(long position) {
        Game g = new Game("Super Mario Bros " + position, "Path");
        g.setID((position));
        return g;
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Super Mario Bros ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
}
