package edbeca.simarro.aplicaciondebanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mostrarTransferencias extends AppCompatActivity {

    private TextView txtTitulo, txtTransPadre, txtTrans1, txtTrans2, txtTrans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_transferencias);

        txtTitulo = (TextView)findViewById(R.id.txtTitulo);
        txtTransPadre = (TextView)findViewById(R.id.txtTransPadre);
        txtTrans1 = (TextView)findViewById(R.id.txtTrans1);
        txtTrans2 = (TextView)findViewById(R.id.txtTrans2);
        txtTrans3 = (TextView)findViewById(R.id.txtTrans3);


    }

    public void mostrarTransferenciaCuenta1(View view){
        txtTransPadre.setText("");
        txtTransPadre.setText("845,54€");
        txtTrans1.setText("05 OCT|Martes -50,00€");
        txtTrans2.setText("25 OCT|Martes -12,50€");
        txtTrans3.setText("16 OCT|Martes -45,65");
    }

    public void mostrarTransferenciaCuenta2(View view){
        txtTransPadre.setText("");
        txtTransPadre.setText("211,23€");
        txtTrans1.setText("12 OCT|Martes -18,46€");
        txtTrans2.setText("15 OCT|Martes -99,99€");
        txtTrans3.setText("19 OCT|Martes -17.54");
    }

    public void irPrincipal(View view){
        Intent intent = new Intent(mostrarTransferencias.this, pantallaprincipal.class);
        startActivity(intent);
    }
}