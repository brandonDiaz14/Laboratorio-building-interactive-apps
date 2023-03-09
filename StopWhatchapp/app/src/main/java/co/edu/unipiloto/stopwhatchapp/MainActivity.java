package co.edu.unipiloto.stopwhatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int contar=1;
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTimer();
    }

    public void onClickStart(View view) {
        running = true;

    }

    public void onClickStop(View view){
        running = false;

    }


    private void runTimer(){


        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {

                final TextView timeView = (TextView)findViewById(R.id.time_view);
                final TextView vuelta1 = (TextView)findViewById(R.id.vuelta1);
                final TextView vuelta2 = (TextView)findViewById(R.id.vuelta2);
                final TextView vuelta3 = (TextView)findViewById(R.id.vuelta3);
                final TextView vuelta4 = (TextView)findViewById(R.id.vuleta4);
                final TextView vuelta5 = (TextView)findViewById(R.id.vuelta5);
                Button btnVuelta =(Button) findViewById(R.id.vuelta);
                Button btnReset =(Button) findViewById(R.id.reset);


                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;

                String time = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);

                timeView.setText(time);

                btnVuelta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(contar == 1){
                            vuelta1.setText(time);
                        }else if (contar == 2){
                            vuelta2.setText(time);
                        }else if(contar == 3){
                            vuelta3.setText(time);
                        }else if(contar == 4){
                            vuelta4.setText(time);
                        }else if (contar == 5){
                            vuelta5.setText(time);
                        }
                        contar++;
                    }
                });

                btnReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        seconds = 0;
                        running = false;
                        vuelta1.setText(null);
                        vuelta2.setText(null);
                        vuelta3.setText(null);
                        vuelta4.setText(null);
                        vuelta5.setText(null);
                        contar=1;
                    }
                });

                if (running){
                    seconds++;
                }

                handler.postDelayed(this, 1000);
            }
        });

    }
}