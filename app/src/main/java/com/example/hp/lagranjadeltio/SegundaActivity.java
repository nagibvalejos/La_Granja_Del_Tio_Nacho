package com.example.hp.lagranjadeltio;

/**
 * Created by Nagib Vallejos on 10/06/2016.
 */
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.*;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SegundaActivity extends AppCompatActivity {
    MediaPlayer mp;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    MediaPlayer mp5;
    MediaPlayer mp6;
    MediaPlayer mp7;
    MediaPlayer mp8;
    MediaPlayer mp9;
    ImageView ImageViewflecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        mp= MediaPlayer.create(this,R.raw.gallina);
        mp2= MediaPlayer.create(this,R.raw.gallo);
        mp3= MediaPlayer.create(this,R.raw.pollo);
        mp4= MediaPlayer.create(this,R.raw.cabra);
        mp5= MediaPlayer.create(this,R.raw.pavo);
        mp6= MediaPlayer.create(this,R.raw.pintada);
        mp7= MediaPlayer.create(this,R.raw.conejo);
        mp8= MediaPlayer.create(this,R.raw.bufalo);
        mp9= MediaPlayer.create(this,R.raw.pato);

        ImageViewflecha = (ImageView)findViewById(R.id.ibatras);
        ImageViewflecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nacho = new Intent(SegundaActivity.this, PrimeraActivity.class);
                startActivity(nacho);
                SegundaActivity.this.finish();
            }
        });
    }

    public void showsnackgallina(View view){
        mp.start();
        Snackbar.make(view, "GALLINA", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackgallo(View view){
        mp2.start();
        Snackbar.make(view, "GALLO", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackpollo(View view){
        mp3.start();
        Snackbar.make(view, "POLLITO", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackcabra(View view){
        mp4.start();
        Snackbar.make(view, "CABRA", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackpavo(View view){
        mp5.start();
        Snackbar.make(view, "PAVO", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackpintada(View view){
        mp6.start();
        Snackbar.make(view, "GALLINA DE GUINEA", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackconejo(View view){
        mp7.start();
        Snackbar.make(view, "CONEJO", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackbufalo(View view){
        mp8.start();
        Snackbar.make(view, "BUFALO", Snackbar.LENGTH_LONG).show();
    }
    public void showsnackpato(View view){
        mp9.start();
        Snackbar.make(view, "PATO", Snackbar.LENGTH_LONG).show();
    }
}