package edu.xula.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello Android Studio");
        Log.i("E","F");
    }

    public void sendMessage (View view) {
        EditText editText = (EditText) findViewById(R.id.message);
        String message = editText.getText().toString();
        Button button = (Button) findViewById(R.id.send);
        button.setText("Markus");
    }
}
