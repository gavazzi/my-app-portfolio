package nz.co.zzi.pjzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.spotify_button).setOnClickListener(this);
        findViewById(R.id.scores_button).setOnClickListener(this);
        findViewById(R.id.library_button).setOnClickListener(this);
        findViewById(R.id.build_it_button).setOnClickListener(this);
        findViewById(R.id.xyz_button).setOnClickListener(this);
        findViewById(R.id.my_own_app_button).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        int textRes = -1;
        switch (v.getId()) {
            case R.id.spotify_button:
                textRes = R.string.app_spotify_text;
                break;
            case R.id.scores_button:
                textRes = R.string.app_scores_text;
                break;
            case R.id.library_button:
                textRes = R.string.app_library_text;
                break;
            case R.id.build_it_button:
                textRes = R.string.app_build_it_text;
                break;
            case R.id.xyz_button:
                textRes = R.string.app_xyz_reader_text;
                break;
            case R.id.my_own_app_button:
                textRes = R.string.app_my_own_text;
                break;
        }

        if(textRes != -1) {
            final String text = getString(textRes);
            Toast.makeText(this, getString(R.string.not_found_message, text), Toast.LENGTH_SHORT).show();
        }
    }
}
