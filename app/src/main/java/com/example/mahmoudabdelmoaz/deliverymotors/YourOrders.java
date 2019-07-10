package com.example.mahmoudabdelmoaz.deliverymotors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.mahmoudabdelmoaz.deliverymotors.Adapter.OrdersAdapter;
import com.example.mahmoudabdelmoaz.deliverymotors.Model.Order;

import java.util.ArrayList;
import java.util.List;

public class YourOrders extends AppCompatActivity {

    RecyclerView recycler_view;

    OrdersAdapter ordersAdapter;
    List<Order> mOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_orders);


        mOrders=new ArrayList<>();
        Toolbar toolbar=findViewById(R.id.toolbarmain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Orders");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        recycler_view =findViewById(R.id.recycler_view);

        recycler_view.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setStackFromEnd(true);
        recycler_view.setLayoutManager(linearLayoutManager);

        Order order1=new Order();
        order1.setPrice("9 LE.");
        order1.setDate("9 Feb, 2019");
        order1.setFrome("From: El-gomhorya st");
        order1.setTo("to: El-sadat st");
        order1.setIsCompleted("Completed");
/*
        mOrders.add(new Order("9 LE.","9 Feb, 2019","From: El-gomhorya st","to: El-sadat st","Completed"));
        mOrders.add(new Order("9 LE.","9 Feb, 2019","From: El-gomhorya st","to: El-sadat st","Completed"));
        mOrders.add(new Order("9 LE.","9 Feb, 2019","From: El-gomhorya st","to: El-sadat st","Completed"));
        mOrders.add(new Order("9 LE.","9 Feb, 2019","From: El-gomhorya st","to: El-sadat st","Completed"));
        mOrders.add(new Order("9 LE.","9 Feb, 2019","From: El-gomhorya st","to: El-sadat st","In progress"));*/

        Order order3=new Order();
        order3.setPrice("9 LE.");
        order3.setDate("9 Feb, 2019");
        order3.setFrome("From: El-gomhorya st");
        order3.setTo("to: El-sadat st");
        order3.setIsCompleted("Completed");

        Order order2=new Order();
        order2.setPrice("9 LE.");
        order2.setDate("9 Feb, 2019");
        order2.setFrome("From: El-gomhorya st");
        order2.setTo("to: El-sadat st");
        order2.setIsCompleted("Completed");

        Order order4=new Order();
        order4.setPrice("9 LE.");
        order4.setDate("9 Feb, 2019");
        order4.setFrome("From: El-gomhorya st");
        order4.setTo("to: El-sadat st");
        order4.setIsCompleted("Completed");

        Order order5=new Order();
        order5.setPrice("9 LE.");
        order5.setDate("9 Feb, 2019");
        order5.setFrome("From: El-gomhorya st");
        order5.setTo("to: El-sadat st");
        order5.setIsCompleted("In progress");

        mOrders.add(order1);
        mOrders.add(order2);
        mOrders.add(order3);
        mOrders.add(order4);
        mOrders.add(order5);

        ordersAdapter=new OrdersAdapter(YourOrders.this,mOrders);
        recycler_view.setAdapter(ordersAdapter);
    }
}
