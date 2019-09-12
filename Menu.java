package com.example.finn.sudokapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0323R.layout.activity_menu);
        Button btnExit = (Button) findViewById(C0323R.C0325id.btnExit);
        ((Button) findViewById(C0323R.C0325id.btnPlay)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Menu.this.startActivity(new Intent(Menu.this, MainGame.class));
            }
        });
        btnExit.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Menu.this.finish();
                System.exit(0);
            }
        });
    }
}
