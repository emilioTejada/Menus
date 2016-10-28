package tejada.emilio.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
public class Ej_3_activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej_3_activity1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ej_3_menu, menu);
        return true;
    }
}