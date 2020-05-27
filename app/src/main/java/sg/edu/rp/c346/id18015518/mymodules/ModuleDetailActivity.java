package sg.edu.rp.c346.id18015518.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView code, name, year, semester, credit, venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_module);
        code = findViewById(R.id.textViewCode);
        name = findViewById(R.id.textViewName);
        year = findViewById(R.id.textViewYear);
        semester = findViewById(R.id.textViewSemester);
        credit = findViewById(R.id.textViewCredit);
        venue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String Code = intentReceived.getStringExtra("Module Code");
        code.setText("Module Code: " + Code);

        String Name = intentReceived.getStringExtra("Module Name");
        name.setText("Module Name: " + Name);

        int Year = intentReceived.getIntExtra("Year", 0);
        year.setText("Year: " + Year);

        int Sem = intentReceived.getIntExtra("Semester", 0);
        semester.setText("Semester: " + Sem);

        int Credit = intentReceived.getIntExtra("Credit", 0);
        credit.setText("Credit: " + Credit);

        String Venue = intentReceived.getStringExtra("Venue");
        venue.setText("Venue: " + Venue);

    }
}
