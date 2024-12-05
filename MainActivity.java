package com.example.frases;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);


        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Random random = new Random();

                String[] motivacionais = {
                        "Acredite em si mesmo e tudo será possível.",
                        "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                        "Nunca é tarde para recomeçar.",
                        "Você é mais forte do que imagina.",
                        "Transforme seus sonhos em metas e suas metas em conquistas.",
                        "O fracasso é apenas uma oportunidade para começar de novo com mais experiência.",
                        "A persistência é o caminho do êxito.",
                        "Seja a mudança que você quer ver no mundo.",
                        "A única maneira de fazer um excelente trabalho é amar o que você faz.",
                        "Confie no processo, cada passo te leva mais perto do objetivo.",
                        "Confie em Deus , ele é Dono de todas as coisas"
                };

                frases.setText(motivacionais[random.nextInt(11)]);
            }
        });



    }
}