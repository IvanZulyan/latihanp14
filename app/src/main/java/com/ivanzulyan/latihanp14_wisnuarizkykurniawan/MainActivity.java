package com.ivanzulyan.latihanp14_wisnuarizkykurniawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Edtnik, Edtnamakaryawan, EdtGpoko, Edtlembur, Edtgolongan, Edtharimasuk;
    private TextView Txttotalgp, Txtuanglembur, Txttransport, Txtmakan, Txtgolongan, Txtgajikotor, Txtpph, Txtbpjskesehatan, Txtbpjskerja, Txtjmlpotongan, Txtgajibersih;
    private Button Btnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edtnik = (EditText) findViewById(R.id.nik);
        Edtnamakaryawan = (EditText) findViewById(R.id.namakaryawan);
        EdtGpoko = (EditText) findViewById(R.id.gajipokok);
        Edtlembur = (EditText) findViewById(R.id.lembur);
        Edtgolongan = (EditText) findViewById(R.id.golongan);
        Edtharimasuk = (EditText) findViewById(R.id.harimasuk);

        Txttotalgp = findViewById(R.id.totalGP);
        Txtuanglembur = findViewById(R.id.uanglembur);
        Txttransport = findViewById(R.id.transport);
        Txtmakan = findViewById(R.id.makan);
        Txtgolongan = findViewById(R.id.Tgolongan);
        Txtgajikotor = findViewById(R.id.gajikotor);
        Txtpph = findViewById(R.id.pph);
        Txtbpjskesehatan = findViewById(R.id.bpjs);
        Txtbpjskerja = findViewById(R.id.bpjskerjaan);
        Txtjmlpotongan = findViewById(R.id.jmlpotongan);
        Txtgajibersih = findViewById(R.id.gajibersih);

        Btnhitung = (Button) findViewById(R.id.hitung);

//      Fungsi Buton Hitung
        Btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gajipoko = EdtGpoko.getText().toString().trim();
                String uanglembur = Edtlembur.getText().toString().trim();
                String harimasuk = Edtharimasuk.getText().toString().trim();
                String golongan = Edtgolongan.getText().toString().trim();
                String tunjangantransport = Txttransport.getText().toString().trim();



                double tt = 15000;
                double tm = 20000;
                double gp = Double.parseDouble(gajipoko);
                double ul = Double.parseDouble(uanglembur);
                double hm = Double.parseDouble(harimasuk);

                Txttotalgp.setText("Gaji Pokok = Rp. " + gp);
                Txtuanglembur.setText("Uang Lembur = Rp. " + ul);
                Txttransport.setText("Tunjangan Transport = Rp. " + (hm * tt));
                Txtmakan.setText("Tunjangan Makan = Rp. " + (hm * tm));


            }
        });


    }
}