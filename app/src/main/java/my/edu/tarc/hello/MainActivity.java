package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello Ryan");
        //This is a comment
        //Fuck you bij
        //Lelllll
    }

    public void showMessage(View view){
        textViewMessage.setText("Hello Ryan");
    }
}
