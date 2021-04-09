package mcm.edu.ph.inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class layla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layla);

        TextView magehp, magemana, magearmor, magedamage, enemyhp, enemymana, enemyarmor, enemydamage;
        magehp = findViewById(R.id.magehp);
        magemana = findViewById(R.id.magemana);
        magearmor = findViewById(R.id.magearmor);
        magedamage = findViewById(R.id.magedamage);
        enemyhp = findViewById(R.id.enemyhp);
        enemymana = findViewById(R.id.enemymana);
        enemyarmor = findViewById(R.id.enemyarmor);
        enemydamage = findViewById(R.id.enemydamage);

        magehp.setText(Integer.toString(mage.getHealthpoint()));
        magemana.setText(Integer.toString(mage.getManapoint()));
        magearmor.setText(Integer.toString(mage.getArmorpoint()));
        magedamage.setText(Integer.toString(mage.getDamagepoint()));
        enemyhp.setText(Integer.toString(enemy.getHealthpoint()));
        enemymana.setText(Integer.toString(enemy.getManapoint()));
        enemyarmor.setText(Integer.toString(enemy.getArmorpoint()));
        enemydamage.setText(Integer.toString(enemy.getDamagepoint()));
    }
}