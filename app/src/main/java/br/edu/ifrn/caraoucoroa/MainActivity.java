package br.edu.ifrn.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton  imageButtonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonJogar = findViewById(R.id.imageButtonJogar);

        imageButtonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Passar dados para a próxima tela
                int numero = new Random().nextInt(2); // 0 ou 1
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });
    }
}