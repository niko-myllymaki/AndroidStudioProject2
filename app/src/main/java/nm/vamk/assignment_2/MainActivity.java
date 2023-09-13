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
        //startEvent();
        getStartTime();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate()");
    }

    protected void onStart() {
        //endEvent();
        getStartTime();
        super.onStart();
        Log.d(tag, tag + "onStart()");
        //getElapsedTime();
    }

    protected void onRestart() {
        getStartTime();
        super.onRestart();
        Log.d(tag, tag + "onReStart()");
    }
    protected void onResume() {
        //startEvent();
        getStartTime();
        super.onResume();
        Log.d(tag, tag + "onResume()");
    }
    protected void onPause() {
        //endEvent();
        getStartTime();
        super.onPause();
        Log.d(tag, tag + "onPause()");
        //getElapsedTime();
    }
    protected void onStop() {
        getStartTime();
        super.onStop();
        Log.d(tag, tag + "onStop()");
    }
    protected void onDestroy() {
        getStartTime();
        super.onDestroy();
        Log.d(tag, tag + "onDestroy()");
    }

    public void getStartTime() {
        startTime = System.currentTimeMillis();
        Log.d("Start Time", startTime + " ms");
    }

    /*
    public void startEvent() {
        startTime = System.currentTimeMillis();
    }

    public void endEvent() {
        endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        long elapsedTime = endTime - startTime;
        String elapsedTimeString = String.valueOf(elapsedTime);
        Log.d("Time", elapsedTimeString + " ms");
    }


     */
    public void handleText(View v) {
        EditText firstNameText = findViewById(R.id.editText_firstname);
        EditText surnameText = findViewById(R.id.editText_surname);
        EditText phoneNumberText = findViewById(R.id.editText_phonenumber);
        EditText commentText = findViewById(R.id.editText_comment);

        TextView firstName = findViewById(R.id.tw_firstname);
        TextView surname = findViewById(R.id.tw_firstname);
        TextView phoneNumber = findViewById(R.id.tw_firstname);
        TextView comment = findViewById(R.id.tw_firstname);

        //To string
        String firstNameTextString = firstNameText.getText().toString();
        String surnameTextString = surnameText.getText().toString();
        String phoneNumberTextString = phoneNumberText.getText().toString();
        String commentTextString = commentText.getText().toString();

        String firstNameString = firstName.getText().toString();
        String surnameString = surname.getText().toString();
        String phoneNumberString = phoneNumber.getText().toString();
        String commentString = comment.getText().toString();


        String[] tagInfo = {firstNameString, surnameString, phoneNumberString, commentString};
        String[] inputs = {firstNameTextString, surnameTextString, phoneNumberTextString, commentTextString};

        for (int i = 0; i < inputs.length; i++) {
            Log.d(tagInfo[i], inputs[i]);
        }

    }


    public void resetTextFields(View v) {
        ((TextView)findViewById(R.id.editText_firstname)).setText("");
        ((TextView)findViewById(R.id.editText_surname)).setText("");
        ((TextView)findViewById(R.id.editText_phonenumber)).setText("");
        ((TextView)findViewById(R.id.editText_comment)).setText("");
    }






}