package com.example.shivanii.assign1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void mul(View v)
    {
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);

        int n1,n2;

        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());

        int mul;
        mul=n1*n2;

        TextView t1=(TextView)findViewById(R.id.res2);
        t1.setText(Integer.toString(mul));
    }
    public void prev(View v)
    {
        Intent intent=new Intent(this,second.class);
        startActivity(intent);
    }
    public void next(View v)
    {
        Intent intent=new Intent(this,fourth.class);
        startActivity(intent);
    }
}
