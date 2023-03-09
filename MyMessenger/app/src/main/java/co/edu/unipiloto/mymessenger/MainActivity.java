package co.edu.unipiloto.mymessenger;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    public String MENSAJE_EXTRA = "mensaje";
    public ArrayList<String> mensajes = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intento = getIntent();
        String mensajeTexto = intento.getStringExtra(MENSAJE_EXTRA);
        TextView mensajeVisto = (TextView) findViewById(R.id.message1);
        mensajeVisto.setText(mensajeTexto);

    }

    public void onSendMessage(View view){
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        mensajes.add(messageText);
        Intent intent = new Intent(this , ReceiveMessageActivity.class);
        intent.putExtra("message", mensajes);
        startActivity(intent);
    }

}