package com.mountain.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Number numberShape = new Number();

    public void numberShape(View view){
        EditText editText = findViewById(R.id.numberEditText);
        String num = editText.getText().toString();
        numberShape.number = Integer.parseInt(num);

        Toast.makeText(this, num+" is a triangular number: "+numberShape.isTriangular()+"\n"
                +num+" is a square number: "+numberShape.isSquare(), Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
