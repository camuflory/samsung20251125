package com.norameyer.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2, ed3;
    private TextView tvErr, tvD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ednum1);
        ed2 = findViewById(R.id.ednum2);
        ed3 = findViewById(R.id.ednum3);
        tvErr = findViewById(R.id.tvError);
        tvD = findViewById(R.id.tvAnswer);
    }


    public void onClick(View view) {
        tvD.setText("");
        tvErr.setText("");
        if (ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty() || ed3.getText().toString().isEmpty()) {
            tvErr.setText("есть незаполненные поля!");
            tvD.setText("");
        } if (ed1.getText().toString().startsWith("0") || ed2.getText().toString().startsWith("0") || ed3.getText().toString().startsWith("0")) {
            tvErr.setText("есть неправильно введенные числа!");
            tvD.setText("");
        } else {
            tvErr.setText("");
            double b = Double.parseDouble(ed2.getText().toString());
            double a = Double.parseDouble(ed2.getText().toString());
            double c = Double.parseDouble(ed2.getText().toString());
            double d = b*b - 4*a*c;
            if (d < 0.0) {
                tvD.setText("дискриминант меньше 0!");
            } else {
                tvD.setText(String.valueOf(d));
            }
        }
    }
}