package sg.np.edu.whack_a_mole_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class AdvancedActivity extends AppCompatActivity {
    private static final String TAG = "Whack A Mole 2.0!";
    TextView resultTextView;
    int score = 0;
    DecimalFormat df = new DecimalFormat("#");
    String points = df.format(score);
    Button btn[] = new Button[9];

    Handler handler = new Handler();
    Timer timer = new Timer(false);

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        Log.v(TAG, "Finished Pre-Initialisation!");
        resultTextView = findViewById(R.id.resultView);
        
        btn[0] = findViewById(R.id.button1);
        btn[1] = findViewById(R.id.button2);
        btn[2] = findViewById(R.id.button3);
        btn[3] = findViewById(R.id.button4);
        btn[4] = findViewById(R.id.button5);
        btn[5] = findViewById(R.id.button6);
        btn[6] = findViewById(R.id.button7);
        btn[7] = findViewById(R.id.button8);
        btn[8] = findViewById(R.id.button9);




        Log.v(TAG, "Starting GUI!");




        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        setNewMole();
                    }
                });
            }
        };
        timer.schedule(timerTask, 20000,1000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = getIntent();
                score = intent.getIntExtra("Score",0);
                points = df.format(score);
                resultTextView.setText("Score: " + points);


                View.OnClickListener onclick = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (v.getId()) {
                            case R.id.button1:
                                Log.v(TAG, "Button 1 Clicked!");
                                if (btn[0].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    System.out.println("Missed, score deducted!");
                                }
                                break;


                            case R.id.button2:
                                Log.v(TAG, "Button 2 Clicked!");

                                if (btn[1].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button3:
                                Log.v(TAG, "Button 3 Clicked!");
                                if (btn[2].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button4:
                                Log.v(TAG, "Button 4 Clicked!");
                                if (btn[3].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button5:
                                Log.v(TAG, "Button 5 Clicked!");
                                if (btn[4].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button6:
                                Log.v(TAG, "Button 6 Clicked!");
                                if (btn[5].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button7:
                                Log.v(TAG, "Button 7 Clicked!");
                                if (btn[6].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button8:
                                Log.v(TAG, "Button 8 Clicked!");
                                if (btn[7].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;

                            case R.id.button9:
                                Log.v(TAG, "Button 9 Clicked!");
                                if (btn[8].getText() == "*") {
                                    score += 1;
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Hit, score added!\n");
                                } else {
                                    score -= 1;
                                    if(score < 0){
                                        score = 0;
                                    }
                                    points = df.format(score);
                                    resultTextView.setText("Score: " + points);
                                    Log.v(TAG, "Missed, score deducted!\n");
                                }
                                break;


                        }
                    }


                };
                btn[0].setOnClickListener(onclick);
                btn[1].setOnClickListener(onclick);
                btn[2].setOnClickListener(onclick);
                btn[3].setOnClickListener(onclick);
                btn[4].setOnClickListener(onclick);
                btn[5].setOnClickListener(onclick);
                btn[6].setOnClickListener(onclick);
                btn[7].setOnClickListener(onclick);
                btn[8].setOnClickListener(onclick);
            }
        },20000);


    }




    public void setNewMole()
    {
        btn[0].setText("O");
        btn[1].setText("O");
        btn[2].setText("O");
        btn[3].setText("O");
        btn[4].setText("O");
        btn[5].setText("O");
        btn[6].setText("O");
        btn[7].setText("O");
        btn[8].setText("O");

        Log.v(TAG,"New Mole Location!");
        Random ran = new Random();
        int r = ran.nextInt(9);

        btn[r].setText("*");


    }
}
