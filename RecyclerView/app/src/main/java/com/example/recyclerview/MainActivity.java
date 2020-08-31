package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductAdapter.IOnClickItem {
    List<Product> listProduct = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        ProductAdapter adapter = new ProductAdapter(this,listProduct,this);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        RecyclerView rvProduct = (RecyclerView)findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);

    }
    private void initData(){
        listProduct.add(new Product("Flower","Love Crlt","2000.000",R.drawable.qwewq));
        listProduct.add(new Product("Flower","Love Crlt","3000.000",R.drawable.qwewq));
        listProduct.add(new Product("Flower","Love Crlt","4000.000",R.drawable.qwewq));
        listProduct.add(new Product("Flower","Love Crlt","5000.000",R.drawable.qwewq));
        listProduct.add(new Product("Flower","Love Crlt","5100.000",R.drawable.qwewq));
        listProduct.add(new Product("Flower","Love Crlt","6000.000",R.drawable.qwewq));


    }
    @Override
    public  void onClickItem(int position){
    Product product = listProduct.get(position);
        Toast.makeText(this,product.getTitle(),Toast.LENGTH_SHORT).show();
    }
}
