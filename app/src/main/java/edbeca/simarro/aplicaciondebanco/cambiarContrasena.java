package edbeca.simarro.aplicaciondebanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cambiarContrasena extends AppCompatActivity {

    private TextView txtResu;
    private EditText editContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_contrasena);

        txtResu = (TextView)findViewById(R.id.txtResu);
        editContra = (EditText)findViewById(R.id.edtContra);

    }

    public void cambiar(View view){
        txtResu.setText("Contraseña actualizada");
        editContra.setText("");
    }

    public void irPrincipal(View view){
        Intent intent = new Intent(cambiarContrasena.this, pantallaprincipal.class);
        startActivity(intent);
    }
}