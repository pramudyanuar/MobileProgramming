package com.example.hitungluas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        txtLuas = findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangStr = edtPanjang.getText().toString().trim();
                String lebarStr = edtLebar.getText().toString().trim();

                if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
                    double panjang = Double.parseDouble(panjangStr);
                    double lebar = Double.parseDouble(lebarStr);
                    double luas = panjang * lebar;
                    txtLuas.setText("Luas: " + luas);
                } else {
                    txtLuas.setText("Masukkan angka yang valid!");
                }
            }
        });
    }
}
