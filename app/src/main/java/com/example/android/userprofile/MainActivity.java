package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView view_name;
    TextView view_country;
    TextView view_birthday;
    ImageView view_pofilePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_name = findViewById(R.id.name);
        view_country = findViewById(R.id.country);
        view_birthday = findViewById(R.id.birthday);
        view_pofilePicture = findViewById(R.id.profile_picture);

        view_name.setText("Kade");
        view_country.setText("USA");
        view_birthday.setText("1991");
        view_pofilePicture.setImageResource(R.drawable.lyla);

    }
}
