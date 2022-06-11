package com.example.firabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editJudul = findViewById(R.id.txtJudul);
        final EditText editPenulis = findViewById(R.id.txtPenulis);
        Button btn = findViewById(R.id.btnSubmit);
        DAOBuku dao = new DAOBuku();
        btn.setOnClickListener(v->
        {
            bukuData buku = new bukuData(editJudul.getText().toString(),editPenulis.getText().toString());
            dao.add(buku).addOnSuccessListener(suc ->
                    {
                        Toast.makeText(this,"Berhasil Menambahkan Data",Toast.LENGTH_SHORT).show();
                    }).addOnFailureListener(fa ->
            {
                Toast.makeText(this,""+fa.getMessage(),Toast.LENGTH_SHORT).show();
            });
        });
    }
}