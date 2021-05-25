package sg.edu.rp.c346.id20011155.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDetails;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails = findViewById(R.id.textView);
        btnback = findViewById(R.id.btnback);

        Intent intentReceived = getIntent();

        String q1 = intentReceived.getStringExtra("modCode");
        String q2 = intentReceived.getStringExtra("modName");
        Integer q3 = intentReceived.getIntExtra("academicYr", 2020);
        Integer q4 = intentReceived.getIntExtra("sem", 0);
        Integer q5 = intentReceived.getIntExtra("modCred", 0);
        String q6 = intentReceived.getStringExtra("venue");

        tvDetails.setText("Module Code: "+ q1 +"\n\n\nModule Name: " + q2 +"\n\n\nAcademic Year: " + q3 + "\n\n\nSemester: " + q4 + "\n\n\nModule Credit: " + q5 + "\n\n\nVenue: " + q6);

    btnback.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
    }
}