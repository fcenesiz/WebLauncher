package com.cenesiz.intentsender;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editTextWebpage);
        Button buttonOpenWebpage = findViewById(R.id.buttonOpenWebpage);


        buttonOpenWebpage.setOnClickListener(view -> {
            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://" + editText.getText().toString())
                    );
            startActivity(intent);
        });
    }

}