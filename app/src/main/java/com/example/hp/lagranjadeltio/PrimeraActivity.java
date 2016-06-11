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

public class PrimeraActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_primera);
        mp= MediaPlayer.create(this,R.raw.perro);
        mp2= MediaPlayer.create(this,R.raw.gato);
        mp3= MediaPlayer.create(this,R.raw.caballo);
        mp4= MediaPlayer.create(this,R.raw.burro);
        mp5= MediaPlayer.create(this,R.raw.oveja);
        mp6= MediaPlayer.create(this,R.raw.vaca);
        mp7= MediaPlayer.create(this,R.raw.cerdo);
        mp8= MediaPlayer.create(this,R.raw.toro);
        mp9= MediaPlayer.create(this,R.raw.ganso);


        ImageViewflecha = (ImageView)findViewById(R.id.ibflecha);
        ImageViewflecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nacho = new Intent(PrimeraActivity.this, SegundaActivity.class);
                startActivity(nacho);
                PrimeraActivity.this.finish();
            }
        });
    }
    public void showsnackperro(View view){
        mp.start();
        Snackbar.make(view,"PERRO",Snackbar.LENGTH_SHORT).show();
    }
    public void showsnackgato(View view){
        mp2.start();
        Snackbar.make(view,"GATO",Snackbar.LENGTH_LONG).show();
    }
    public void showsnackcaballo(View view){
        mp3.start();
        Snackbar.make(view,"CABALLO",Snackbar.LENGTH_LONG).show();
    }
    public void showsnackburro(View view){
        mp4.start();
        Snackbar.make(view,"BURRO",Snackbar.LENGTH_LONG).show();
    }
    public void showsnackoveja(View view){
        mp5.start();
        Snackbar.make(view,"OVEJA",Snackbar.LENGTH_LONG).show();
    }
    public void showsnackvaca(View view){
        mp6.start();
        Snackbar.make(view,"VACA",Snackbar.LENGTH_SHORT).show();
    }
    public void showsnackcerdo(View view){
        mp7.start();
        Snackbar.make(view,"CERDO",Snackbar.LENGTH_SHORT).show();
    }
    public void showsnacktoro(View view){
        mp8.start();
        Snackbar.make(view,"TORO",Snackbar.LENGTH_SHORT).show();
    }
    public void showsnackganso(View view){
        mp9.start();
        Snackbar.make(view,"GANSO",Snackbar.LENGTH_SHORT).show();
    }
}