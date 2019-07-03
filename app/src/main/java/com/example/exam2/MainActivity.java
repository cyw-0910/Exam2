package com.example.exam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //设置列表集合
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    //设置项目的具体内容
    private void initFruits() {
        int j=1001;
        for (int i = 0; i < 2; i++) {

                Fruit apple = new Fruit("" + j++, "Apple", R.drawable.apple_pic, "6.59");
                fruitList.add(apple);
                Fruit banana = new Fruit("" + j++, "Banana", R.drawable.banana_pic, "3.75");
                fruitList.add(banana);
                Fruit orange = new Fruit(""+j++, "Orange", R.drawable.orange_pic, "2.80");
                fruitList.add(orange);
                Fruit watermelon = new Fruit(""+ j++, "Watermelon", R.drawable.watermelon_pic, "4.00");
                fruitList.add(watermelon);
                Fruit pear = new Fruit(""+ j++, "Pear", R.drawable.pear_pic, "5.00");
                fruitList.add(pear);
                Fruit grape = new Fruit(""+ j++, "Grape", R.drawable.grape_pic, "3.25");
                fruitList.add(grape);
                Fruit pineapple = new Fruit(""+ j++, "Pineapple", R.drawable.pineapple_pic, "3.99");
                fruitList.add(pineapple);
                Fruit strawberry = new Fruit(""+ j++, "Strawberry", R.drawable.strawberry_pic, "2.44");
                fruitList.add(strawberry);
                Fruit cherry = new Fruit(""+ j++, "Cherry", R.drawable.cherry_pic, "1.37");
                fruitList.add(cherry);
                Fruit mango = new Fruit(""+ j++, "Mango", R.drawable.mango_pic, "2.58");
                fruitList.add(mango);
        }
    }
}
