package com.example.mahmoudabdelmoaz.deliverymotors.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mahmoudabdelmoaz.deliverymotors.Model.Order;
import com.example.mahmoudabdelmoaz.deliverymotors.R;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.ViewHolder> {

    private Context oContext;
    private List<Order> orders;

    public OrdersAdapter(Context oContext, List<Order> orders) {
        this.oContext = oContext;
        this.orders = orders;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(oContext).inflate(R.layout.order_item,parent,false);
        return new OrdersAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersAdapter.ViewHolder holder, int position) {
        final Order order=orders.get(position);
        holder.txt_price.setText(order.getPrice());
        holder.txt_date.setText(order.getDate());
        holder.txt_from.setText(order.getFrome());
        holder.txt_to.setText(order.getTo());
        holder.txt_isCompleted.setText(order.getIsCompleted());
        if (order.getIsCompleted()=="In progress"){
            holder.txt_isCompleted.setTextColor(Color.parseColor("#FF9933"));
        }else {
            holder.txt_isCompleted.setTextColor(Color.parseColor("#009900"));
        }

    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txt_price;
        public TextView txt_date;
        public TextView txt_from;
        public TextView txt_to;
        public TextView txt_isCompleted;

        public ViewHolder(View itemView){
            super(itemView);

            txt_price=itemView.findViewById(R.id.txt_price);
            txt_date=itemView.findViewById(R.id.txt_date);
            txt_from=itemView.findViewById(R.id.txt_from);
            txt_to=itemView.findViewById(R.id.txt_to);
            txt_isCompleted=itemView.findViewById(R.id.txt_isCompleted);

        }
    }


}

