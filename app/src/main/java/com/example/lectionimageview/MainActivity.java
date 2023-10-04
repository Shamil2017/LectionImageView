package com.example.lectionimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button[] btn = new Button[3];
    ImageView ivEmbl, ivFlag;
    TextView tvName;
    int[] embl;
    int[] flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn[0] = (Button) findViewById(R.id.btn1);
        btn[1] = (Button) findViewById(R.id.btn2);
        btn[2] = (Button) findViewById(R.id.btn3);
        ivEmbl = findViewById(R.id.ivEmbl);
        ivFlag = findViewById(R.id.ivFlag);
        tvName = findViewById(R.id.tvName);
        flag   = new int[] {R.drawable.russia_l, R.drawable.flagchina, R.drawable.flagiran };
        embl = new int[] {R.drawable.russia_embl, R.drawable.gerbchina, R.drawable.gerbiran };
    }

    public void goPict(View view) {
        for (int i=0; i <flag.length; i++)
        {
            if (view == btn[i])
            {
                ivEmbl.setImageResource(embl[i]);
                ivFlag.setImageResource(flag[i]);
                tvName.setText(btn[i].getText().toString());
            }
        }
    }
}