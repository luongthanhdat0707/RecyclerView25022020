package com.example.recyclerview25022020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ItemViewHolder>{

    private ArrayList<User> mArrayUser;

    public UserAdapter(){
        mArrayUser= new ArrayList<>();
    }

    public void submitData(ArrayList<User> ArrayUser){
        if(ArrayUser!=null){
            mArrayUser.clear();
            mArrayUser.addAll(ArrayUser);
            notifyDataSetChanged();
        }
    }
    public void addItem(User user){
        if(user != null){
            mArrayUser.add(user);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_user,null, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        User user = mArrayUser.get(position);
        holder.mimg.setImageResource(user.getImage());
        holder.mTvName.setText(user.getName());
        holder.mtvAge.setText(String.valueOf(user.getAge()));
        }


    @Override
    public int getItemCount() {
        return mArrayUser.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView mimg;
        TextView mTvName, mtvAge;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvName = itemView.findViewById(R.id.tenview);
            mimg = itemView.findViewById(R.id.imageview);
            mtvAge = itemView.findViewById(R.id.imageview);
        }
        public void blind(int position){

        }
    }
}
