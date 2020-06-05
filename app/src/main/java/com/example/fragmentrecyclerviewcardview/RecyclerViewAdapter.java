package com.example.fragmentrecyclerviewcardview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    String[] titles,details;
    int [] flags;

    public RecyclerViewAdapter(Context context, String[] titles, String[] details, int[] flags) {
        this.context = context;
        this.titles = titles;
        this.details = details;
        this.flags = flags;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.sample_layout,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {



holder.titleText.setText(titles[position]);

holder.imageView.setImageResource(flags[position]);



    }

    @Override
    public int getItemCount() {
        return details.length;
    }




    //creat myviewholder clsaa

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleText,detailText;
        ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);



            titleText=itemView.findViewById(R.id.textViewTitleID);

            imageView=itemView.findViewById(R.id.imageViewID);

        }
    }
}
