package com.example.kalkulatormeilanny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView txtHasil;
    EditText editmasukkanAngka1, editmasukanAngka2, aksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aksi = (EditText) findViewById(R.id.aksi);
        txtHasil   = (TextView) findViewById(R.id.txtHasil);
        button  = (Button) findViewById(R.id.hasil);
        editmasukkanAngka1 = (EditText) findViewById(R.id.editmasukanAngka1);
        editmasukanAngka2 = (EditText) findViewById(R.id.editmasukanAngka2);


    }

    public void OperasiAritmatika(View view){
        double hasil;

        double n1 = Double.parseDouble(editmasukkanAngka1.getText().toString());
        double n2 = Double.parseDouble(editmasukanAngka2.getText().toString());

        String Operasi = aksi.getText().toString();

        if (Operasi.equals("+")){
            hasil = n1 + n2;
            txtHasil.setText(String.valueOf(hasil));
        }else if (Operasi.equals("-")){
            hasil = n1 - n2;
            txtHasil.setText(String.valueOf(hasil));
        }else if (Operasi.equals("*")){
            hasil = n1 * n2;
            txtHasil.setText(String.valueOf(hasil));
        }else if (Operasi.equals("/")){
            hasil = n1 / n2;
            txtHasil.setText(String.valueOf(hasil));
        }else {
            txtHasil.setText("OPERASI ARITMATIKA TIDAK SESUAI");
        }
    }
}