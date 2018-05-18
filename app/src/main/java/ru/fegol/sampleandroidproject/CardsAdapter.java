package ru.fegol.sampleandroidproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * @author Andrey Mamonov
 */
public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardViewHolder> {

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        switch (position % 3) {
            case 0:
                Picasso.get()
                        .load(R.drawable.first_image)
                        .fit()
                        .into(holder.backgroundImage);
                holder.textView.setText("текст 1");
                break;
            case 1:
                Picasso.get()
                        .load(R.drawable.second_image)
                        .fit()
                        .into(holder.backgroundImage);
                holder.textView.setText("текст 2");
                break;
            case 2:
                Picasso.get()
                        .load(R.drawable.third_image)
                        .fit()
                        .into(holder.backgroundImage);
                holder.textView.setText("текст 3");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {

        final TextView textView;
        final ImageView backgroundImage;

        public CardViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.info_text);
            backgroundImage = itemView.findViewById(R.id.background_image);

        }
    }
}
