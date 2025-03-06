package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvHasil;
    private String input = "";
    private String operator = "";
    private double num1 = 0, num2 = 0;
    private boolean isNewOp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvHasil = findViewById(R.id.tvHasil);

        int[] numberIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
        for (int id : numberIds) {
            findViewById(id).setOnClickListener(this::onNumberClick);
        }

        findViewById(R.id.btnTambah).setOnClickListener(v -> onOperatorClick("+"));
        findViewById(R.id.btnKurang).setOnClickListener(v -> onOperatorClick("-"));
        findViewById(R.id.btnKali).setOnClickListener(v -> onOperatorClick("*"));
        findViewById(R.id.btnBagi).setOnClickListener(v -> onOperatorClick("/"));
        findViewById(R.id.btnSamaDengan).setOnClickListener(v -> onEqualClick());
        findViewById(R.id.btnClear).setOnClickListener(v -> onClearClick());
    }

    private void onNumberClick(View view) {
        if (isNewOp) {
            tvHasil.setText("");
            isNewOp = false;
        }
        Button btn = (Button) view;
        input += btn.getText().toString();
        tvHasil.setText(input);
    }

    private void onOperatorClick(String op) {
        if (!input.isEmpty()) {
            num1 = Double.parseDouble(input);
            operator = op;
            input = "";
            isNewOp = true;
        }
    }

    private void onEqualClick() {
        if (!input.isEmpty() && !operator.isEmpty()) {
            num2 = Double.parseDouble(input);
            double hasil = 0;

            switch (operator) {
                case "+":
                    hasil = num1 + num2;
                    break;
                case "-":
                    hasil = num1 - num2;
                    break;
                case "*":
                    hasil = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        hasil = num1 / num2;
                    } else {
                        tvHasil.setText("Error");
                        return;
                    }
                    break;
            }

            tvHasil.setText(String.valueOf(hasil));
            input = String.valueOf(hasil);
            isNewOp = true;
        }
    }

    private void onClearClick() {
        input = "";
        operator = "";
        num1 = 0;
        num2 = 0;
        isNewOp = true;
        tvHasil.setText("0");
    }
}
