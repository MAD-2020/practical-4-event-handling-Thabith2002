package sg.np.edu.whack_a_mole_20;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Whack A Mole!";
    TextView resultTextView;
    int score = 0;
    DecimalFormat df = new DecimalFormat("#");
    String points = df.format(score);
    Button button1;
    Button button2;
    Button button3;

    public int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Finished Pre-Initialisation!");
        resultTextView = findViewById(R.id.resultView);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);


        Log.v(TAG, "Starting GUI!");

        resultTextView.setText("Score: " + points);



        //ALERT DIALOG//////////////////////////////////////////////////////////////////////////////////////////////
        final AlertDialog.Builder nextLevel = new AlertDialog.Builder(this);
        nextLevel.setTitle("Warning! Insane Whack-A-Mole incoming!");
        nextLevel.setMessage("Would you like to move on to the Advanced Stage?");

        nextLevel.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.v(TAG, "Yes chosen");
                new CountDownTimer(10000, 1000){
                    public void onTick(long millisUntilFinished){
                        Toast.makeText(MainActivity.this, "Get Ready in " + (millisUntilFinished / 1000 + 1) + " seconds!",Toast.LENGTH_SHORT).show();
                        counter++;
                    }
                    public  void onFinish(){
                        Toast.makeText(MainActivity.this, "GO!", Toast.LENGTH_SHORT).show();
                    }
                }.start();
                Intent intent = new Intent(getApplicationContext(), AdvancedActivity.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });
        nextLevel.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.v(TAG, "No chosen");
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        setNewMole();
        View.OnClickListener onclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        Log.v(TAG, "Button Left Clicked!");
                        if (button1.getText() == "*") {
                            score += 1;
                            if(score > 0 && score % 10 == 0){
                                nextLevel.create().show();
                            }
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
                        setNewMole();
                        break;


                    case R.id.btn2:
                        Log.v(TAG, "Button Middle Clicked!");

                        if (button2.getText() == "*") {
                            score += 1;
                            if(score > 0 && score % 10 == 0){
                                nextLevel.create().show();
                            }
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
                        setNewMole();
                        break;

                    case R.id.btn3:
                        Log.v(TAG, "Button Right Clicked!");

                        if (button3.getText() == "*") {
                            score += 1;
                            if(score > 0 && score % 10 == 0){
                                nextLevel.create().show();
                            }
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
                        setNewMole();


                }
            }


        };

        button1.setOnClickListener(onclick);
        button2.setOnClickListener(onclick);
        button3.setOnClickListener(onclick);
    }




    public void setNewMole()
    {
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);

        if(randomLocation == 0){
            button1.setText("*");
            button2.setText("O");
            button3.setText("O");
        }
        else if(randomLocation == 1){
            button2.setText("*");
            button1.setText("O");
            button3.setText("O");
        }
        else if(randomLocation == 2){
            button3.setText("*");
            button2.setText("O");
            button1.setText("O");
        }
    }
}
