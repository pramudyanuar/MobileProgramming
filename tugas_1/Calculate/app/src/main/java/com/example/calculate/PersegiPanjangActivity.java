package com.example.calculate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PersegiPanjangActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        EditText edtPanjang = findViewById(R.id.edtPanjang);
        EditText edtLebar = findViewById(R.id.edtLebar);
        Button btnHitung = findViewById(R.id.btnHitung);
        TextView txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(v -> {
            double panjang = Double.parseDouble(edtPanjang.getText().toString());
            double lebar = Double.parseDouble(edtLebar.getText().toString());
            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);
            txtHasil.setText("Luas: " + luas + "\nKeliling: " + keliling);
        });
    }
}
