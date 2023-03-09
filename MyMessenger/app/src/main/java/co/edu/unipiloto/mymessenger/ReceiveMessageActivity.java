package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public String EXTRA_MESSAGE = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView) findViewById(R.id.message);

        messageView.setText(messageText);
    }

    public void onSendMessageTwo (View view){
        EditText mensajeVisto = (EditText) findViewById(R.id.message1);
        String mensajeTexto = mensajeVisto.getText().toString();
        Intent intento = new Intent(this,MainActivity.class);
        intento.putExtra("mensaje",mensajeTexto);
        startActivity(intento);

    }
}