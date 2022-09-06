package mobile1_20220906.gusals8405.helloandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.but);
        // Anonymous class(익명클래스) 객체
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast t = Toast.makeText()
                t.show();
            }
        })
    }
}