package edbeca.simarro.aplicaciondebanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class promociones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);
    }

    public void irPrincipal(View view){
        Intent intent = new Intent(promociones.this, pantallaprincipal.class);
        startActivity(intent);
    }
}