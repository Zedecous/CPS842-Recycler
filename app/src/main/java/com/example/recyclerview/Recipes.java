package com.example.recyclerview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

public class Recipes {
    public String name;
    public Bitmap image;
    public String ingredients;
    public String description;
    public String directions;
    public Recipes(String name,String description, String image,String ingredients,String directions)
    {
        this.name = name;
        this.image = BitmapFactory.decodeStream(new ByteArrayInputStream(image.getBytes()));
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
    }
}
