package sharetips.test.venkatkishore.sharetips;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class Demo extends AppCompatActivity {


    Button btt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        btt= (Button) findViewById(R.id.button3);

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MediaPlayer mp = new MediaPlayer();
                try {
                    mp.setDataSource("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo");
                    mp.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                mp.start();
            }
        });
    }
}
