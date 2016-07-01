package com.example.vinayakks.x;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {

    private List<ListItems> moviesList;



    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title, place, price,hover;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            hover = (TextView)view.findViewById(R.id.list_item_google_cards_travel_category_name);
           // title = (TextView) view.findViewById(R.id.titleid);
            place = (TextView) view.findViewById(R.id.placeid);
            price = (TextView) view.findViewById(R.id.priceid);
            image = (ImageView) view.findViewById(R.id.image);
            image.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Intent i = new Intent(getClass(),DetailActivity.class);
            Context context = itemView.getContext();
            Intent intent = new Intent(context, DetailActivity.class);
            context.startActivity(intent);
        }
    }


    public CustomAdapter(List<ListItems> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        ListItems movie = moviesList.get(position);
        holder.hover.setText(movie.getTitle());
        //holder.title.setText(movie.getTitle());
        holder.place.setText(movie.getPlace());
        holder.price.setText(movie.getPrice());
        holder.image.setImageResource(R.drawable.login_social);

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}