package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class datshAdmin extends AppCompatActivity {

    DBHelper db = new DBHelper(this);

    EditText name, email, phone;
    Button add, edit, delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datsh_admin);

        name = findViewById(R.id.editName);
        email = findViewById(R.id.editEmail);
        phone = findViewById(R.id.editPhone);
    }

    public void add_btn() {
        String Name = name.getText().toString();
        String Email = email.getText().toString();
        String Phone = phone.getText().toString();
        Boolean result = db.insertData(Name, Email, Phone);
        if (result == true) {
            Toast.makeText(datshAdmin.this, "OK", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(datshAdmin.this, "NO", Toast.LENGTH_SHORT).show();


        }
    }

    public void delete_btn(){

    }

    public void edit_btn(){

    }
}