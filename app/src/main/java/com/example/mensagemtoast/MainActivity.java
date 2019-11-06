package com.example.mensagemtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*context  onde será exibido a mensagem no caso mo main activity.this.

                podemos substituir por getAplicationContext
                 */

                Toast.makeText(getApplicationContext(),"vc clicou em toast",Toast.LENGTH_LONG).show();
            }
        });

    }
}
