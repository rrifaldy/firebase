package com.example.firabase;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOBuku {

    private DatabaseReference databaseReference;
    public DAOBuku(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(bukuData.class.getSimpleName());
    }
    public Task<Void> add(bukuData buku){
        return databaseReference.push().setValue(buku);
    }
}
