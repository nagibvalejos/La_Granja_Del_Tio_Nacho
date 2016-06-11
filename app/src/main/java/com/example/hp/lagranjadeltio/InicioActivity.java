package com.example.hp.lagranjadeltio;

/**
 * Created by Nagib Vallejos on 10/06/2016.
 */
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void showSnackBar(View view) {
        Toast.makeText(getApplicationContext(), "BIENVENIDO", Toast.LENGTH_SHORT).show();
        Intent nacho = new Intent(InicioActivity.this, PrimeraActivity.class);
        startActivity(nacho);
        InicioActivity.this.finish();
    }
}
