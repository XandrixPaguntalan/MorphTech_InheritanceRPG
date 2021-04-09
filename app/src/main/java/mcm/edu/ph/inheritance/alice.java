package mcm.edu.ph.inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alice);
        TextView supphp, suppmana, supparmor, suppdamage, suppenemyhp, suppenemymana, suppenemyarmor, suppenemydamage;
        supphp = findViewById(R.id.supphp);
        suppmana = findViewById(R.id.suppmana);
        supparmor = findViewById(R.id.supparmor);
        suppdamage = findViewById(R.id.suppdamage);
        suppenemyhp = findViewById(R.id.suppenemyhp);
        suppenemymana = findViewById(R.id.suppenemymana);
        suppenemyarmor = findViewById(R.id.suppenemyarmor);
        suppenemydamage = findViewById(R.id.suppenemydamage);

        supphp.setText(Integer.toString(support.getHealthpoint()));
        suppmana.setText(Integer.toString(support.getManapoint()));
        supparmor.setText(Integer.toString(support.getArmorpoint()));
        suppdamage.setText(Integer.toString(support.getDamagepoint()));
        suppenemyhp.setText(Integer.toString(enemy.getHealthpoint()));
        suppenemymana.setText(Integer.toString(enemy.getManapoint()));
        suppenemyarmor.setText(Integer.toString(enemy.getArmorpoint()));
        suppenemydamage.setText(Integer.toString(enemy.getDamagepoint()));
    }
}