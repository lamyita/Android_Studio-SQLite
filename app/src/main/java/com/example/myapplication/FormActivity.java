package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    EditText name, email, phone;
    private  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        btn =findViewById(R.id.submitBtn);
        name = findViewById(R.id.editName);
        email = findViewById(R.id.editEmail);
        phone = findViewById(R.id.editPhone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().trim().equals("") || email.getText().toString().trim().equals("") || phone.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(), "il manque des informations", Toast.LENGTH_LONG).show();
                }else{
                    startActivity(new Intent(FormActivity.this, ResultActivity.class));
                }
            }
        });
    }
}