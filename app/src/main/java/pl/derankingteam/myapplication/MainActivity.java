package pl.derankingteam.myapplication;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent (mainGrid);
    }

    private void setToggleEvent (GridLayout mainGrid)
    {

    }

    private void setSingleEvent (GridLayout mainGrid)
    {
        for (int i = 0; i < mainGrid.getChildCount(); i++)
        {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) mainGrid.getChildAt(i);
            final int finalT = i;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Toast.makeText(MainActivity.this, "Clicked at index " + finalT, Toast.LENGTH_SHORT).show();
                    }
                });
        }
    }
}
