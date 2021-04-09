package mcm.edu.ph.inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class jason extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jason);

        TextView tankhp, tankmana, tankarmor, tankdamage, tankenemyhp, tankenemymana, tankenemyarmor, tankenemydamage;
        tankhp = findViewById(R.id.tankhp);
        tankmana = findViewById(R.id.tankmana);
        tankarmor = findViewById(R.id.tankarmor);
        tankdamage = findViewById(R.id.tankdamage);
        tankenemyhp = findViewById(R.id.tankenemyhp);
        tankenemymana = findViewById(R.id.tankenemymana);
        tankenemyarmor = findViewById(R.id.tankenemyarmor);
        tankenemydamage = findViewById(R.id.tankenemydamage);

        tankhp.setText(Integer.toString(tank.getHealthpoint()));
        tankmana.setText(Integer.toString(tank.getManapoint()));
        tankarmor.setText(Integer.toString(tank.getArmorpoint()));
        tankdamage.setText(Integer.toString(tank.getDamagepoint()));
        tankenemyhp.setText(Integer.toString(enemy.getHealthpoint()));
        tankenemymana.setText(Integer.toString(enemy.getManapoint()));
        tankenemyarmor.setText(Integer.toString(enemy.getArmorpoint()));
        tankenemydamage.setText(Integer.toString(enemy.getDamagepoint()));

    }
}