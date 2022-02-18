package com.example.sumaresta;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView result;
    private RadioButton suma, resta, div, mult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.NUMBER1);
        num2 = findViewById(R.id.NUMBER2);
        result = findViewById(R.id.RESULT);
        suma = findViewById(R.id.SUM);
        resta= findViewById(R.id.SUBTRACTION);
        div = findViewById(R.id.DIV);
        mult = findViewById(R.id.MULT);
    }

    public void Operation (View view){
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num1.getText().toString());


        if (suma.isChecked()) {
            int rest = n1+n2;
            String respuestaSuma = String.valueOf(rest);
            result.setText(respuestaSuma);
        }
        if (resta.isChecked()) {
            int rest = n1-n2;
            String respuestaResta = String.valueOf(rest);
            result.setText(respuestaResta);
        }
        if (mult.isChecked()) {
            int rest = n1*n2;
            String respuestaMult = String.valueOf(rest);
            result.setText(respuestaMult);
        }
        if (div.isChecked()) {
            int rest = n1/n2;
            String respuestaDiv = String.valueOf(rest);
            result.setText(respuestaDiv);
        }


    }

}