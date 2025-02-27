package com.example.calculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PersegiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        EditText edtSisi = findViewById(R.id.edtSisi);
        Button btnHitung = findViewById(R.id.btnHitung);
        TextView txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(v -> {
            double sisi = Double.parseDouble(edtSisi.getText().toString());
            double luas = sisi * sisi;
            double keliling = 4 * sisi;
            txtHasil.setText("Luas: " + luas + "\nKeliling: " + keliling);
        });
    }
}
