package com.example.meetu.klassenapp;

import android.app.Activity;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

  public class ArtistListone extends ArrayAdapter<Artist> {

    private Activity context;
    private List<Artist> artistList;

    public ArtistListone(Activity context, List<Artist> artistList){

        super(context, R.layout.list_layout, artistList);
        this.context = context;
                this.artistList = artistList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewDatum = (TextView) listViewItem.findViewById(R.id.textViewDatum);
        TextView textViewTuesday = (TextView) listViewItem.findViewById(R.id.textViewTuesday);
        TextView textViewMonday = (TextView) listViewItem.findViewById(R.id.textViewMonday);
        TextView textViewWednesday = (TextView) listViewItem.findViewById(R.id.textViewWednesday);
        TextView textViewThursday = (TextView) listViewItem.findViewById(R.id.textViewThursday);
        TextView textViewFriday = (TextView) listViewItem.findViewById(R.id.textViewFriday);

        Artist artist = artistList.get(position);


        textViewDatum.setText(artist.getDatum());
        textViewMonday.setText(artist.getMonday());
        textViewTuesday.setText(artist.getTuesday());
        textViewWednesday.setText(artist.getWednesday());
        textViewThursday.setText(artist.getThursday());
        textViewFriday.setText(artist.getFriday());

        return listViewItem;

    }
}
