package khoapham.ptp.phamtanphat.seekbarduathu;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgPlay;
    SeekBar skMot,skHai,skBa;
    CheckBox ckMot,ckHai,ckBa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPlay = findViewById(R.id.imageviewPlay);
        skMot = findViewById(R.id.seekbarOne);
        skHai = findViewById(R.id.seekbarTwo);
        skBa = findViewById(R.id.seekbarThree);
        ckMot = findViewById(R.id.checkboxOne);
        ckHai = findViewById(R.id.checkboxTwo);
        ckBa = findViewById(R.id.checkboxThree);

        ckMot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ckMot.isChecked()){
                    ckHai.setChecked(false);
                    ckBa.setChecked(false);
                }
            }
        });
        ckHai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ckHai.isChecked()){
                    ckMot.setChecked(false);
                    ckBa.setChecked(false);
                }
            }
        });
        ckBa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ckBa.isChecked()){
                    ckHai.setChecked(false);
                    ckMot.setChecked(false);
                }
            }
        });

        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nguoi dung da chon hay chua - Ok
                // khong duoc chon  nhieu hon 2 o - ok
                if (ckMot.isChecked() || ckHai.isChecked() || ckBa.isChecked()){

                }else{
                    Toast.makeText(MainActivity.this, "Bạn chưa đặt cược!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        randomseekbar();
    }

    private void randomseekbar() {
        Random random = new Random();

        final int value1 = random.nextInt(10) + 1;
        int value2 = random.nextInt(10) + 1;
        int value3 = random.nextInt(10) + 1;

        CountDownTimer countDownTimer = new CountDownTimer(60000 , 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                skMot.setProgress(skMot.getProgress() + value1);
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }

}
