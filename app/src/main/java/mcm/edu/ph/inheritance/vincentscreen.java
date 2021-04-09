package mcm.edu.ph.inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class vincentscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vincentscreen);

        TextView herohp, heromana, heroarmor, herodamage, enemyhp, enemymana, enemyarmor, enemydamage;
        herohp = findViewById(R.id.q1);
        heromana = findViewById(R.id.a2);
        heroarmor = findViewById(R.id.q3);
        herodamage = findViewById(R.id.herodamage);
        enemyhp = findViewById(R.id.q5);
        enemymana = findViewById(R.id.q6);
        enemyarmor = findViewById(R.id.q7);
        enemydamage = findViewById(R.id.q8);

        herohp.setText(Integer.toString(Hero.getHealthpoint()));
        heromana.setText(Integer.toString(Hero.getManapoint()));
        heroarmor.setText(Integer.toString(Hero.getArmorpoint()));
        herodamage.setText(Integer.toString(Hero.getDamagepoint()));
        enemyhp.setText(Integer.toString(enemy.getHealthpoint()));
        enemymana.setText(Integer.toString(enemy.getManapoint()));
        enemyarmor.setText(Integer.toString(enemy.getArmorpoint()));
        enemydamage.setText(Integer.toString(enemy.getDamagepoint()));
    }
}