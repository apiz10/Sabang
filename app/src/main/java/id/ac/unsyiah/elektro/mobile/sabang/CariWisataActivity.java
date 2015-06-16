package id.ac.unsyiah.elektro.mobile.sabang;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class CariWisataActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_wisata);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cari_wisata, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void doBack(View view) {
        Intent intent = new Intent(this, JelajahTurisActivity.class);
        startActivity(intent);
    }
    public void DoIn1(View view) {
        Intent intent = new Intent(this, Km0Activity.class);
        startActivity(intent);
    }
    public void doIn2(View view) {
        Intent intent = new Intent(this, PantaiIboihActivity.class);
        startActivity(intent);
    }
    public void doIn3(View view) {
        Intent intent = new Intent(this, DanauAneukLaotActivity.class);
        startActivity(intent);
    }
    public void doIn4(View view) {
        Intent intent = new Intent(this, PulauRubiahActivity.class);
        startActivity(intent);
    }
    public void doIn5(View view) {
        Intent intent = new Intent(this, PantaiGapangActivity.class);
        startActivity(intent);
    }
    public void doIn6(View view) {
        Intent intent = new Intent(this, PantaiParadisoActivity.class);
        startActivity(intent);
    }
    public void doIn7(View view) {
        Intent intent = new Intent(this, PantaiTapakGajahActivity.class);
        startActivity(intent);
    }
    public void doIn8(View view) {
        Intent intent = new Intent(this, PantaiPasirPutihActivity.class);
        startActivity(intent);
    }
    public void doIn9(View view) {
        Intent intent = new Intent(this, AirTerjunPriaLaotActivity.class);
        startActivity(intent);
    }
    public void doIn10(View view) {
        Intent intent = new Intent(this, AirPanasGunungMerapiActivity.class);
        startActivity(intent);
    }
    public void doIn11(View view) {
        Intent intent = new Intent(this, AirPanasKeuneukaiActivity.class);
        startActivity(intent);
    }
}
