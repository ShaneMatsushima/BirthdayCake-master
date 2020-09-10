package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView inputCakeView){
        cakeView = inputCakeView;
        cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        cakeModel.isLit = false;
        cakeView.invalidate();

        Log.d("button", "Clicked");
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel.hasCandles = !cakeModel.hasCandles;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.candleCount = seekBar.getProgress();
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //useless, needed to be implemented
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //useless, needed to be implemented
    }
}
