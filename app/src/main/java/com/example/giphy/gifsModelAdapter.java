package com.example.giphy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import java.util.List;

public class gifsModelAdapter extends RecyclerView.Adapter<gifsModelAdapter.ViewHolder> {

    public List<gifsModel> gifsList;
    public ImageView imageView;

    public gifsModelAdapter(List<gifsModel> gifsList){
        this.gifsList = gifsList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.gifs_item, viewGroup, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull gifsModelAdapter.ViewHolder viewHolder, int position) {
        viewHolder.getData(gifsList.get(position));
    }

    @Override
    public int getItemCount() {
        return gifsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public gifsModel gifData;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            imageView = (ImageView) view.findViewById(R.id.gifs);

        }

        public void getData(gifsModel gifsModel) {
            gifData=gifsModel;
            if(gifData!=null)
                Glide.with(imageView).asGif().load(gifData.image.original.url).into(imageView);

        }
    }
}
