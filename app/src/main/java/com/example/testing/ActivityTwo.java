package com.example.testing;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    TextView txemail,txpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel pada conten texview
        txemail = findViewById(R.id.emailField);
        txpassword = findViewById(R.id.passwordField);

        // mendeclarasikan bundle yang digunakan untuk mengambil pesan
        // yang dikirim melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string untuk menyimpan data yang dikirim
        // dari activity sebelumnya
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        // menampilkan value
        txemail.setText(email);
        txpassword.setText(pass);


    }

}
