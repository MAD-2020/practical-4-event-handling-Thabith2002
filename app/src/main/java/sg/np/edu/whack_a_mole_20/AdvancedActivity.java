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
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Handler handler = new Handler();
    Timer timer = new Timer(false);

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        Log.v(TAG, "Finished Pre-Initialisation!");
        resultTextView = findViewById(R.id.resultView);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        Intent intent = getIntent();
        score = intent.getIntExtra("Score",0);
        final DecimalFormat df = new DecimalFormat("#");
        final String[] points = {df.format(score)};


        Log.v(TAG, "Starting GUI!");

        resultTextView.setText("Score: " + points[0]);


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
        View.OnClickListener onclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button1:
                        Log.v(TAG, "Button 1 Clicked!");
                        if (btn1.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            System.out.println("Missed, score deducted!");
                        }
                        break;


                    case R.id.button2:
                        Log.v(TAG, "Button 2 Clicked!");

                        if (btn2.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button3:
                        Log.v(TAG, "Button 3 Clicked!");
                        if (btn3.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button4:
                        Log.v(TAG, "Button 4 Clicked!");
                        if (btn4.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button5:
                        Log.v(TAG, "Button 5 Clicked!");
                        if (btn5.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button6:
                        Log.v(TAG, "Button 6 Clicked!");
                        if (btn6.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button7:
                        Log.v(TAG, "Button 7 Clicked!");
                        if (btn7.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button8:
                        Log.v(TAG, "Button 8 Clicked!");
                        if (btn8.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;

                    case R.id.button9:
                        Log.v(TAG, "Button 9 Clicked!");
                        if (btn9.getText() == "*") {
                            score += 1;
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Hit, score added!\n");
                        } else {
                            score -= 1;
                            if(score < 0){
                                score = 0;
                            }
                            points[0] = df.format(score);
                            resultTextView.setText("Score: " + points[0]);
                            Log.v(TAG, "Missed, score deducted!\n");
                        }
                        break;


                }
            }


        };

        btn1.setOnClickListener(onclick);
        btn2.setOnClickListener(onclick);
        btn3.setOnClickListener(onclick);
        btn4.setOnClickListener(onclick);
        btn5.setOnClickListener(onclick);
        btn6.setOnClickListener(onclick);
        btn7.setOnClickListener(onclick);
        btn8.setOnClickListener(onclick);
        btn9.setOnClickListener(onclick);

    }




    public void setNewMole()
    {
        Log.v(TAG,"New Mole Location!");
        Random ran = new Random();
        int randomLocation = ran.nextInt(9);

        if(randomLocation == 0){
            btn1.setText("*");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 1){
            btn1.setText("O");
            btn2.setText("*");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 2){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("*");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 3){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("*");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 4){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("*");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 5){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("*");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 6){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("*");
            btn8.setText("O");
            btn9.setText("O");
        }
        else if(randomLocation == 7){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("*");
            btn9.setText("O");
        }
        else if(randomLocation == 8){
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
            btn9.setText("*");
        }
    }
}
