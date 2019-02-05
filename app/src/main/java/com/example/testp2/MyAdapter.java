package com.example.testp2;

import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    /*
    *   C'est là qu'on va récupérer les données du serveur API rest *
    */
    Planet planet = new Planet();
    private final List<Pair<String, Integer>> item = Arrays.asList(Pair.create(planet.getName(), planet.getRotation_period()));

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_cell, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, Integer> pair = item.get(position);
        holder.display(pair);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView description;
        private Pair<String, String> currentPair;

        public MyViewHolder(final View itemView) {
            super(itemView);
            name = ((TextView) itemView.findViewById(R.id.name));
            description = ((TextView) itemView.findViewById(R.id.description));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(currentPair.first)
                            .setMessage(currentPair.second)
                            .show();
                }
            });
        }

        public void display(Pair<String, String> pair) {
            currentPair = pair;
            name.setText(pair.first);
            description.setText(pair.second);
        }
    }
}
