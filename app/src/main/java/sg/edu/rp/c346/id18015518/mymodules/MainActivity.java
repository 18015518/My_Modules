package sg.edu.rp.c346.id18015518.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid;
    TextView tvIpad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textViewAndroid);
        tvIpad = findViewById(R.id.textViewIpad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");


                startActivity(intent);
            }
        });

        tvIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C349");
                intent.putExtra("Module Name", "iPad Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");

                startActivity(intent);
            }
        });

    }
}
