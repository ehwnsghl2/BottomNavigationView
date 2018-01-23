package brandjunhoe89.bottomnavigationview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import brandjunhoe89.bottomnavigationview.fragment.AccountFragment;
import brandjunhoe89.bottomnavigationview.fragment.HomeFragment;
import brandjunhoe89.bottomnavigationview.fragment.MoetizationFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigationview);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_home:
                        getFragmentManager().beginTransaction().replace(R.id.framelayout,new HomeFragment()).commit();
                        return true;
                    case R.id.action_moetization:
                        getFragmentManager().beginTransaction().replace(R.id.framelayout,new MoetizationFragment()).commit();
                        return true;
                    case R.id.action_account:
                        getFragmentManager().beginTransaction().replace(R.id.framelayout,new AccountFragment()).commit();
                        return  true;


                }
                return false;
            }
        });



    }
}
