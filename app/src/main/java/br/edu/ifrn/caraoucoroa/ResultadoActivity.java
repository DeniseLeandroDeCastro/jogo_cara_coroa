package br.edu.ifrn.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton imageButtonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);

        //Recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0) { //Cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
        } else { //Coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //Encerra a activity
            }
        });
    }
}