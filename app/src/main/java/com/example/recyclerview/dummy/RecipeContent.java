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
        addItem(new RecipeList("Egg Salad",
                "A wonderful-tasting egg salad sandwich that you will definitely devour. It's really good on rye.",
                "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F344163.jpg&w=327&h=327&c=sc&poi=face&q=85",
                "8 large eggs \n 1/2 cup mayonnaise \n 1 teaspoon prepared yellow mustard \n 1/4 cup chopped green onion \n salt and pepper \n 1/4 teaspoon paprika",
                "Place egg in a saucepan and cover with cold water. Bring water to a boil and immediately remove from heat. Cover and let eggs stand in hot water for 10 to 12 minutes."));
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