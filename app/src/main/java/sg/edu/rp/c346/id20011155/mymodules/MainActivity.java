package sg.edu.rp.c346.id20011155.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView modC346;
    TextView modC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modC346 = findViewById(R.id.c346);
        modC218 = findViewById(R.id.c218);

        modC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C346");
                intent.putExtra("modName", "Android Programming");
                intent.putExtra("academicYr", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });
        modC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C218");
                intent.putExtra("modName", "UI/UX Design for Apps");
                intent.putExtra("academicYr", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("modCred", 4);
                intent.putExtra("venue", "W64G");
                startActivity(intent);
            }
        });
    }
}