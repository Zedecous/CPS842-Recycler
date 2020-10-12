package com.example.recyclerview.dummy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class RecipeContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<RecipeList> ITEMS = new ArrayList<RecipeList>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, RecipeList> ITEM_MAP = new HashMap<String, RecipeList>();

    private static final int COUNT = 25;

    static {
        addItem(new RecipeList("Chocolate Cupcakes",
                "super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper",
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2017/06/moist-chocolate-cupcakes-5-600x900.jpg",
                "Flour \n Sugar \n Chocolate",
                "Mix and bake"));

    }
    private static void addItem(RecipeList item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }



    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A recipe
     */
    public static class RecipeList {
        public String name;
        public Bitmap image;
        public String ingredients;
        public String description;
        public String directions;
        public RecipeList(String name,String description, String image,String ingredients,String directions)
        {
            this.name = name;
            this.image = BitmapFactory.decodeStream(new ByteArrayInputStream(image.getBytes()));
            this.description = description;
            this.ingredients = ingredients;
            this.directions = directions;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}