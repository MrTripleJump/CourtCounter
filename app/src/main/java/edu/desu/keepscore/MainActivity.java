package edu.desu.keepscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int zero = 0;
    int zero1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreeHome(View view) {
        zero=zero+3;
    display_Home(zero);

    }

    public void reset(View view){
        zero = 0;
        zero1 = 0;
        display_Home(0);
        display_Away(0);

    }
    private void display_Home(int num){
        TextView QuantityTextView= (TextView)findViewById(R.id.zero_text_view);
        QuantityTextView.setText(""+num);
    }

    private void display_Away(int num) {
        TextView QuantityTextView = (TextView) findViewById(R.id.zero1_text_view);
        QuantityTextView.setText("" + num);
    }

    public void plusTwoHome(View view) {
        zero=zero+2;
        display_Home(zero);

    }
    public void plusOneHome(View view) {
        zero=zero+1;
        display_Home(zero);

    }
    public void plusThreeAway(View view) {
        zero1=zero1+3;
        display_Away(zero1);

    }
    public void plusTwoAway(View view) {
        zero1=zero1+2;
        display_Away(zero1);

    }
    public void plusOneAway(View view) {
        zero1=zero1+1;
        display_Away(zero1);

    }


}
