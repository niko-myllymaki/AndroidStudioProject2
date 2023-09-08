package nm.vamk.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tag="EVH_Demo: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long begin = getTime();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate()" + begin);
    }
    protected void onStart() {
        long begin = getTime();
        super.onStart();
        Log.d(tag, tag + "onStart()" + begin);
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, tag + "onReStart()");
    }
    protected void onResume() {
        super.onResume();
        Log.d(tag, tag + "onResume()");
    }
    protected void onPause() {
        super.onPause();
        Log.d(tag, tag + "onPause()");
    }
    protected void onStop() {
        super.onStop();
        Log.d(tag, tag + "onStop()");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, tag + "onDestroy()");
    }

    public long getTime() {
        long eventStart = System.currentTimeMillis();
        return eventStart;
    }

    public void handleText(View v) {
        EditText firstNameText = findViewById(R.id.editText_firstname);
        EditText surnameText = findViewById(R.id.editText_surname);
        EditText phoneNumberText = findViewById(R.id.editText_phonenumber);
        EditText commentText = findViewById(R.id.editText_comment);

        TextView firstName = findViewById(R.id.tw_firstname);

        //To string
        String firstNameTextString = firstNameText.getText().toString();
        String surnameTextString = surnameText.getText().toString();
        String phoneNumberTextString = phoneNumberText.getText().toString();
        String commentTextString = commentText.getText().toString();

        String firstNameString = firstName.getText().toString();


        String[] info = {firstNameString, "Surname", "Phone Number", "Comment"};
        String[] inputs = {firstNameTextString, surnameTextString, phoneNumberTextString, commentTextString};

        for (int i = 0; i < inputs.length; i++) {
            Log.d(info[i], inputs[i]);
        }

    }

    public void resetTextFields(View v) {
        ((TextView)findViewById(R.id.editText_firstname)).setText("");
        ((TextView)findViewById(R.id.editText_surname)).setText("");
        ((TextView)findViewById(R.id.editText_phonenumber)).setText("");
        ((TextView)findViewById(R.id.editText_comment)).setText("");
    }






}