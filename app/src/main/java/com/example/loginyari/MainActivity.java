package com.example.loginyari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Usuario;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText) findViewById(R.id.etusuario);
        Password = (EditText) findViewById(R.id.etpassword);
        Login = (Button) findViewById(R.id.btnlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String NombreUsuario;
            String Contraseña;
            NombreUsuario = Usuario.getText().toString();
            Contraseña = Password.getText().toString();
            if ((NombreUsuario.equals("admin")) && (Contraseña.equals("12345")))
                Intent intent = new Intent( packageContext: MainActivity.this, PantallaSec.class);
                startActivity(intent);
            }
            else {
                Toast.makeText( context: MainActivity.this, text:"Error de Login", Toast.LENGTH_LONG) .show();


                }
        });
    }
}