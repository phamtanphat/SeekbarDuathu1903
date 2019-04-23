package khoapham.ptp.phamtanphat.seekbarduathu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

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
    }
}
