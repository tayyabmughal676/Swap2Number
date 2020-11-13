package com.example.swap2number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mNum2, mNum1;
    private TextView mFinalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1 = findViewById(R.id.editNumberOne);
        mNum2 = findViewById(R.id.editNumberTwo);
        Button mResultBtn = findViewById(R.id.resultBtn);
        mFinalResult = findViewById(R.id.resultTextView);

        mResultBtn.setOnClickListener(v ->
                swapNumber()
        );
    }

    private void swapNumber() {
        String num1 = mNum1.getText().toString().trim();
        String num2 = mNum2.getText().toString().trim();

        String mNum3 = num1;
        num1 = num2;
        num2 = mNum3;

        String mResult = "Swapped \n Number 1: \n" + num1 + "Number 2: \n" + num2;
        mFinalResult.setText(mResult);
        Toast.makeText(this, "Number 1: \n " + num1 + "Number 2: " + num2
                , Toast.LENGTH_SHORT).show();
    }
}