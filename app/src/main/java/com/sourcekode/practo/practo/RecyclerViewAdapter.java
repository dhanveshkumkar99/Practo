package com.sourcekode.practo.practo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dhanvesh on 2/27/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext ;
    private List<Doctor> mData ;

    public RecyclerViewAdapter(Context mContext, List<Doctor> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.cardview_list,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.doctor_title.setText(mData.get(position).getTitle());
        holder.doctor_img.setImageResource(mData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView doctor_title;
        ImageView doctor_img;

        public MyViewHolder(View itemView) {
            super(itemView);


            doctor_title = (TextView)itemView.findViewById(R.id.title_id);
            doctor_img = (ImageView) itemView.findViewById(R.id.img_id);
        }
    }


}
