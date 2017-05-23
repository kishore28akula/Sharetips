package sharetips.test.venkatkishore.sharetips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    Thread th,k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        th = new Thread() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    int time = 0;
                    while (time < 300) {
                        sleep(1000);
                        time = time + 100;
                    }
                    finish();
                } catch (Exception e) {
                    // TODO: handle exception
                } finally {

                    Intent ilist = new Intent(SplashScreen.this, SharePageDetails.class);
                    startActivity(ilist);
                }
                super.run();
            }
        };
        th.start();
    }
}
