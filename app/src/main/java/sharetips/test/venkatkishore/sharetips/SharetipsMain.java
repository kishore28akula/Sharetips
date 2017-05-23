package sharetips.test.venkatkishore.sharetips;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class SharetipsMain extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharetips_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
//        toggle.setDrawerIndicatorEnabled(false);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);


        ShareHomeFragment msgfragment = new ShareHomeFragment();
        FragmentManager msgmanger = getSupportFragmentManager();
        msgmanger
                .beginTransaction()
                .replace(R.id.relativelayout1,
                        msgfragment,
                        msgfragment.getTag()).commit();
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
//dd
        if (id == R.id.nav_home) {
//
            ShareHomeFragment msgfragment = new ShareHomeFragment();
            FragmentManager msgmanger = getSupportFragmentManager();
            msgmanger
                    .beginTransaction()
                    .setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out)
                    .replace(R.id.relativelayout1,
                            msgfragment,
                            msgfragment.getTag()).commit();

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
//            startActivity(new Intent(TabInfoActivity.this,Tabdetails.class));



//            MainGalleryFragment msgfragment = new MainGalleryFragment();
//            FragmentManager msgmanger = getSupportFragmentManager();
//            msgmanger
//                    .beginTransaction()
//                    .setCustomAnimations(R.anim.push_left_in, R.anim.push_left_in)
//                    .replace(R.id.relativelayout1,
//                            msgfragment,
//                            msgfragment.getTag()).commit();
//

        } else if (id == R.id.nav_slideshow) {

//            OmshakthiParallax parallaxfragment = new OmshakthiParallax();
//            FragmentManager msgmanger = getSupportFragmentManager();
//            msgmanger
//                    .beginTransaction()
//                    .setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out)
//                    .replace(R.id.relativelayout1,
//                            parallaxfragment,
//                            parallaxfragment.getTag()).commit();



        } else if (id == R.id.nav_manage) {

            logoutUser();
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
////            startActivity(new Intent(TabInfoActivity.this,Locationdistanceinfo.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void logoutUser() {

        // Launching the login activity
//        Intent intent = new Intent(OmshakthiMainPageInfo.this, LoginPageDetails.class);
//        startActivity(intent);
//        finish();
    }

}
