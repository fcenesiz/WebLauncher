package com.cenesiz.intentsender;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOpenWebpage = findViewById(R.id.buttonOpenWebpage);

        buttonOpenWebpage.setOnClickListener(view -> {
            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/fcenesiz")
                    );
            startActivity(intent);
        });
    }

}