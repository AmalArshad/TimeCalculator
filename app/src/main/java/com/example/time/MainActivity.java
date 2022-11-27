package com.example.time;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton t1;
    ToggleButton t2;
    Button btn;
    EditText ed1;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.from1);
        t2 = findViewById(R.id.to1);
        btn = findViewById(R.id.b1);
        ed1 = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float con = Float.parseFloat(ed1.getText().toString());
                if(ed1.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
                }
                else if (t1.isChecked()) {
                    if (t2.isChecked()) {
                        float result = con * 360;
                        Toast.makeText(MainActivity.this,result+" ",Toast.LENGTH_SHORT).show();
                    } else {
                        float result = con * 60;
                        Toast.makeText(MainActivity.this,result+" ",Toast.LENGTH_SHORT).show();
                    }
                } else {
                    if (t2.isChecked()) {
                        float result = con * 60;
                        Toast.makeText(MainActivity.this,result+" ",Toast.LENGTH_SHORT).show();
                    } else {
                        float result = con;
                        Toast.makeText(MainActivity.this,result+" ",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}