package com.almanbet11.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        number+=1;
        display(number);
    }

    public void decrement(View view){
        number-=1;
        display(number);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.number_text_view);
        if(number < 0){
            quantityTextView.setText(String.format("%04d", number));
        }
        else{
            quantityTextView.setText(String.format("%03d", number));
        }
    }
}
