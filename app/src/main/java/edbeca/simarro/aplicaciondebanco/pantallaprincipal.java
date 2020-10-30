package edbeca.simarro.aplicaciondebanco;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;



public class pantallaprincipal extends AppCompatActivity {

    private ImageButton ibtnPosicionGlobal, ibtnCambiarPass, ibtnPromociones, ibtnCajeros, ibtnIngresos, ibtnTransferencias;
    private Button btnTrans1, btnTrans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);

        ibtnPosicionGlobal = (ImageButton) findViewById(R.id.ibtnPosicionGlobal);
        ibtnCambiarPass = (ImageButton)findViewById(R.id.ibtnCambiarPass);
        ibtnPromociones = (ImageButton)findViewById(R.id.ibtnPromociones);
        ibtnCajeros = (ImageButton)findViewById(R.id.ibtnCajeros);
        ibtnIngresos = (ImageButton)findViewById(R.id.ibtnIngresos);
        ibtnTransferencias = (ImageButton)findViewById(R.id.ibtnTransferencias);
        ibtnTransferencias = (ImageButton)findViewById(R.id.ibtnTransferencias);
        btnTrans1 = (Button)findViewById(R.id.btntrans1);
        btnTrans2 = (Button)findViewById(R.id.btntrans2);



    }

    public void posicionGlobal(View view){
        Intent intent = new Intent(pantallaprincipal.this, posicionglobal.class);
        startActivity(intent);
    }

    public void cambiarContrasena(View view){
        Intent intent = new Intent(pantallaprincipal.this, cambiarContrasena.class);
        startActivity(intent);
    }

    public void irPromociones(View view){
        Intent intent = new Intent(pantallaprincipal.this, promociones.class);
        startActivity(intent);
    }
    public void irCajeros(View view){
        Intent intent = new Intent(pantallaprincipal.this, cajerosCercanos.class);
        startActivity(intent);
    }

    public void irIngresos(View view){
        Intent intent = new Intent(pantallaprincipal.this, Ingresos.class);
        startActivity(intent);
    }

    @SuppressLint("WrongConstant")
    public void irTransferencias(View view){
        btnTrans1.setVisibility(0);
        btnTrans2.setVisibility(0);
    }

    public void irMostrarTransferencias(View view){
        Intent intent = new Intent(pantallaprincipal.this, mostrarTransferencias.class);
        startActivity(intent);
    }

    public void irOrdenarTransferencias(View view){
        Intent intent = new Intent(pantallaprincipal.this, ordenarTransferencias.class);
        startActivity(intent);
    }

}