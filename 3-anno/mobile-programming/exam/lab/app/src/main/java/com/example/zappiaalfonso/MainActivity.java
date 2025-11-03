package com.example.zappiaalfonso;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText insert;
    private TextView result;
    private TextView memory;
    private Button PB1;
    private Button PB2;
    private Button PB3;
    private Button PB4;
    private Button PB5;
    private Button PB6;
    private Button PB7;
    private Button PB8;
    private Button PB9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insert = (EditText)findViewById(R.id.editText);
        result = (TextView)findViewById(R.id.result);
        memory = (TextView)findViewById(R.id.memory);
        PB1 = (Button)findViewById(R.id.contaCaratteri);
        PB2 = (Button)findViewById(R.id.invertiOrdine);
        PB3 = (Button)findViewById(R.id.troncaDestra);
        PB4 = (Button)findViewById(R.id.troncaSinistra);
        PB5 = (Button)findViewById(R.id.raddoppia);
        PB6 = (Button)findViewById(R.id.memorizza);
        PB7 = (Button)findViewById(R.id.concat);
        PB8 = (Button)findViewById(R.id.clearEditText);
        PB9 = (Button)findViewById(R.id.clearResult);

        PB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = insert.getText().toString();
                int i = s1.length();
                result.setText(Integer.toString(i));
            }
        });

        PB2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s2 = insert.getText().toString();
                StringBuffer buffer = new StringBuffer(s2);
                String inverti = buffer.reverse().toString();
                result.setText(inverti);
            }
        });

        PB3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s3 = insert.getText().toString();
                String troncaDestra = s3.substring(0, s3.length()-(s3.length()/2));
                result.setText(troncaDestra);
            }
        });

        PB4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s4 = insert.getText().toString();
                String troncaSinistra = s4.substring(s4.length()-(s4.length()/2), 0);
                result.setText(troncaSinistra);
            }
        });

        PB5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s5 = insert.getText().toString();
                String raddoppia = s5.concat(s5);
                result.setText(raddoppia);
            }
        });

        PB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s6 = insert.getText().toString();
                memory.setText(s6);
            }
        });

        PB7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s7 = insert.getText().toString();
                String s8 = memory.getText().toString();
                result.setText(s7.concat(s8));
            }
        });

        PB8.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                    insert.setText("");
                }
        });

        PB9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("");
            }
        });
    }
}