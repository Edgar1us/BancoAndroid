package edbeca.simarro.aplicaciondebanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class posicionglobal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posicionglobal);
    }
    public void irPrincipal(View view){
        Intent intent = new Intent(posicionglobal.this, pantallaprincipal.class);
        startActivity(intent);
    }
}