package br.com.luishenrique.yoda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText edit_text_frase;
    private TextView text_view_frase_invertida;
    private String frase;
    private String[] arrayFrase;
    private String fraseInvertida ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text_frase = findViewById(R.id.edit_text_frase);
        text_view_frase_invertida = findViewById(R.id.text_view_frase_invertida);

        fraseInvertida = "";
    }

    public void inverterFrase(View view) {
        frase = edit_text_frase.getText().toString();
        arrayFrase = frase.split(" ");
        for(int i = arrayFrase.length/2; i < arrayFrase.length; i++) {
            fraseInvertida += arrayFrase[i]+" ";
        }
        for(int i = 0; i < arrayFrase.length/2; i++) {
            fraseInvertida += arrayFrase[i]+" ";
        }
        text_view_frase_invertida.setText(fraseInvertida.toUpperCase());
        fraseInvertida = "";
    }
}