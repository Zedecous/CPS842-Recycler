package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<Recipes> recipeList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        for (int i = 0; i < 20; i++)
        {
            mWordList.addLast("Word " + i);
        }
        createRecipes();
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, recipeList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createRecipes()
    {
        Recipes recipe1 = new Recipes("Chocolate Cupcakes",
                "super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper",
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2017/06/moist-chocolate-cupcakes-5-600x900.jpg",
                "Flour \n Sugar \n Chocolate",
                "Mix and bake");
        Recipes recipe2 = new Recipes("Egg Salad",
                "A wonderful-tasting egg salad sandwich that you will definitely devour. It's really good on rye.",
                "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F344163.jpg&w=327&h=327&c=sc&poi=face&q=85",
                "8 large eggs \n 1/2 cup mayonnaise \n 1 teaspoon prepared yellow mustard \n 1/4 cup chopped green onion \n salt and pepper \n 1/4 teaspoon paprika",
                "Place egg in a saucepan and cover with cold water. Bring water to a boil and immediately remove from heat. Cover and let eggs stand in hot water for 10 to 12 minutes.");
        Recipes recipe3 = new Recipes("Chocolate Cupcakes",
                "super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper",
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2017/06/moist-chocolate-cupcakes-5-600x900.jpg",
                "Flour \n Sugar \n Chocolate",
                "Mix and bake");
        recipeList.add(recipe1);
        recipeList.add(recipe2);
        recipeList.add(recipe3);
    }
}