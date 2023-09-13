package nm.vamk.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tag="EVH_Demo: ";
    long startTime;
    long endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate()");
        startEvent();
    }

    protected void onStart() {
        endEvent();
        super.onStart();
        getElapsedTime();
        Log.d(tag, tag + "onStart()");
        startEvent();
    }

    protected void onRestart() {
        endEvent();
        super.onRestart();
        getElapsedTime();
        Log.d(tag, tag + "onReStart()");
        startEvent();
    }
    protected void onResume() {
        endEvent();
        super.onResume();
        getElapsedTime();
        Log.d(tag, tag + "onResume()");
        startEvent();
    }
    protected void onPause() {
        endEvent();
        super.onPause();
        getElapsedTime();
        Log.d(tag, tag + "onPause()");
        startEvent();
    }
    protected void onStop() {
        endEvent();
        super.onStop();
        getElapsedTime();
        Log.d(tag, tag + "onStop()");
        startEvent();
    }
    protected void onDestroy() {
        endEvent();
        super.onDestroy();
        getElapsedTime();
        Log.d(tag, tag + "onDestroy()");
    }

    public void startEvent() {
        startTime = System.currentTimeMillis();
    }

    public void endEvent() {
        endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        long elapsedTime = endTime - startTime;
        String elapsedTimeString = String.valueOf(elapsedTime);
        Log.d("Time", elapsedTimeString + " ms since last event");
    }

    public void handleText(View v) {
        EditText firstNameText = findViewById(R.id.editText_firstname);
        EditText surnameText = findViewById(R.id.editText_surname);
        EditText phoneNumberText = findViewById(R.id.editText_phonenumber);
        EditText commentText = findViewById(R.id.editText_comment);

        //To string
        String firstNameTextString = firstNameText.getText().toString();
        String surnameTextString = surnameText.getText().toString();
        String phoneNumberTextString = phoneNumberText.getText().toString();
        String commentTextString = commentText.getText().toString();

        String inputsToLog = "Name: " + firstNameTextString + " " +  surnameTextString + ", Phone: " + phoneNumberTextString + ", Comment: " + commentTextString ;

        Log.d("send", inputsToLog);


    }


    public void resetTextFields(View v) {
        ((TextView)findViewById(R.id.editText_firstname)).setText("");
        ((TextView)findViewById(R.id.editText_surname)).setText("");
        ((TextView)findViewById(R.id.editText_phonenumber)).setText("");
        ((TextView)findViewById(R.id.editText_comment)).setText("");
    }






}