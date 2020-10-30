package edbeca.simarro.aplicaciondebanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ingresos extends AppCompatActivity {

    private TextView txtIngresoPadre, txtIngreso1, txtIngreso2, txtIngreso3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        txtIngresoPadre = (TextView)findViewById(R.id.txtIngresoPadre);
        txtIngreso1 = (TextView)findViewById(R.id.txtIngreso1);
        txtIngreso2 = (TextView)findViewById(R.id.txtIngreso2);
        txtIngreso3 = (TextView)findViewById(R.id.txtIngreso3);

    }

    public void mostrarIngresoCuenta1(View view){

        txtIngresoPadre.setText("");


        txtIngresoPadre.setText("845,54€");
        txtIngreso1.setText("20 OCT|Martes +50,00€");
        txtIngreso2.setText("07 OCT|Martes +12,50€");
        txtIngreso3.setText("05 OCT|Martes +1600€");

    }

    public void mostrarIngresoCuenta2(View view){

        txtIngresoPadre.setText("");
        txtIngreso1.setText("");
        txtIngreso2.setText("");
        txtIngreso3.setText("");

        txtIngresoPadre.setText("211,23€");
        txtIngreso1.setText("08 OCT|Martes +10,00€");
        txtIngreso2.setText("07 OCT|Martes +200,12€");
        txtIngreso3.setText("29 SEP|Martes +200,12€");

    }

    public void irPrincipal(View view){
        Intent intent = new Intent(Ingresos.this, pantallaprincipal.class);
        startActivity(intent);
    }

}