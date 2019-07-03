package com.example.exam2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
//FruitAdapter作为适配器给listview
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<Fruit> mFruitList;

    public FruitAdapter(List<Fruit> fruitList) {
        mFruitList = fruitList;
    }
//ViewHolder对控件的实例进行缓存
    static class ViewHolder extends RecyclerView.ViewHolder {
        //定义变量
        TextView fruitNumber;
        ImageView fruitImage;
        TextView fruitName;
        TextView fruitPrice;

        //关联变量
        public ViewHolder(View view) {
            super(view);
            fruitNumber = view.findViewById(R.id.fruit_number);
            fruitImage = view.findViewById(R.id.fruit_image);
            fruitName = view.findViewById(R.id.fruit_name);
            fruitPrice = view.findViewById(R.id.fruit_price);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//将一行一行记录的视图（fruit_item）加载进来
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitNumber.setText(fruit.getNumber());
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
        holder.fruitPrice.setText(fruit.getPrice());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

}
