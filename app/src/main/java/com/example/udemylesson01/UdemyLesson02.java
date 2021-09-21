package com.example.udemylesson01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UdemyLesson02 extends AppCompatActivity {

    private EditText nameInput;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udemy_lesson02);

        nameInput = (EditText) findViewById(R.id.editText);
        nameInput.setText("");
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = nameInput.getText().toString();
                result += "\n";
                textView.append(result);
                nameInput.setText("");
            }
        };

        button.setOnClickListener(ourOnClickListener);
    }
}