package it.jaxma.com.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Questo metodo è chiamato quando clicco sul botton order*/


    public void increment(View view){

        int quantity = 3;
        display(quantity);
        displayPrice(quantity * 5);
    }

    public void decrement(View view){
        int quantity = 1;
        display(quantity);
        displayPrice(quantity * 5);
    }


    public void submitOrder(View view) {

        int quantity = 2;
        display(quantity);
        displayPrice(quantity * 5);
    }


    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
