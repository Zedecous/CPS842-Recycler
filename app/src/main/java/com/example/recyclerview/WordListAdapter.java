package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.LinkedList;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private final LinkedList<Recipes> mWordList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context,
                           LinkedList<Recipes> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        Recipes mCurrent = mWordList.get(position);
        holder.txtName.setText(mCurrent.name );
        holder.txtDescription.setText(mCurrent.description);

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView txtName;
        public final TextView txtDescription;
//        public final TextView txtIngredients;
//        public final TextView txtDirections;
//        public final ImageView imgRecipe;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
//            txtIngredients = itemView.findViewById(R.id.txtIngredients);
//            txtDirections = itemView.findViewById(R.id.txtDirections);
//            imgRecipe = itemView.findViewById(R.id.imgRecipe);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Context context = v.getContext();
            //Intent intent = new Intent(context,recipe.class);
        }
    }
}
