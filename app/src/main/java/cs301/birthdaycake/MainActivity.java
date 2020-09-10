package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeViewID = findViewById(R.id.cakeview);
        CakeController newCakeController = new CakeController(cakeViewID);

        Button blowOutButton = findViewById(R.id.blowOut);
        blowOutButton.setOnClickListener(newCakeController);

        CompoundButton hasCandleButton = findViewById(R.id.candleSwitch);
        hasCandleButton.setOnCheckedChangeListener(newCakeController);

        SeekBar candleAmountSeek = findViewById(R.id.candleCountBar);
        candleAmountSeek.setOnSeekBarChangeListener(newCakeController);
    }

    public void goodbye(View button){
        Log.i("button","Goodbye");
        finishAffinity();
    }

}
