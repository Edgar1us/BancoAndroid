package edbeca.simarro.aplicaciondebanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Selection;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ordenarTransferencias extends AppCompatActivity {

    private EditText edtNumeroCuenta, edtImporte, edtAjena;
    private TextView txtResTrans, lblMensaje;
    private GridView grdOpciones;
    private Spinner cmbOpciones;
    private Button btnCancelar;
    private CheckBox checkEnviarJustificante;
    private RadioButton rbtnPropia, rbtnAjena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenar_transferencias);
        rbtnPropia = (RadioButton)findViewById(R.id.rbtnPropia);
        rbtnAjena = (RadioButton)findViewById(R.id.rbtnAjena);
        cmbOpciones = (Spinner)findViewById(R.id.CmbOpciones);
        edtAjena = (EditText)findViewById(R.id.edtAjena);

        checkEnviarJustificante = (CheckBox)findViewById(R.id.checkEnviarJustificante);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        grdOpciones = (GridView) findViewById(R.id.GridOpciones);
        String[] datos = new String[4];
        datos[0]="ES20 5496 2351 1458";
        datos[1]="ES20 2134 5492 3210";
        datos[2]="ES20 5468 2014 2549";
        datos[3]="ES20 1354 9425 4021";

        final ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        grdOpciones = (GridView)findViewById(R.id.GridOpciones);
        grdOpciones.setAdapter(adaptador);


        grdOpciones.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent,
                                            android.view.View v, int position, long id) {

                        v.setBackgroundColor(Color.argb(200,108,145,209));

                      /*  Toast.makeText(getApplicationContext(),"Opción seleccionada: " + parent.getItemAtPosition(position),
                                Toast.LENGTH_SHORT).show();*/
                        

                    }
                });







        final String[] datos2 =
                new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);



        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setSelection(0, true); View v = cmbOpciones.getSelectedView(); ((TextView)v).setTextColor(Color.argb(100,100,0,0));
       /* cmbOpciones.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {
                        lblMensaje.setText("Seleccionado: " +
                                parent.getItemAtPosition(position));
                    }
                    public void onNothingSelected(AdapterView<?> parent) {
                        lblMensaje.setText("");
                    }
                });*/
    }

    public void checkAjena(View view){
        cmbOpciones.setVisibility(View.INVISIBLE);
        if (rbtnAjena.isChecked()==true){
            edtAjena.setVisibility(View.VISIBLE);
        }
    }

    public void checkPropia(View view){
        edtAjena.setVisibility(View.INVISIBLE);
        if (rbtnPropia.isChecked()==true){
            cmbOpciones.setVisibility(View.VISIBLE);
        }
    }

    public void cancelar(View view){

        rbtnPropia.setChecked(false);
        cmbOpciones.setVisibility(View.INVISIBLE);
        rbtnAjena.setChecked(false);
        edtAjena.setText("");
        edtAjena.setVisibility(View.INVISIBLE);
        checkEnviarJustificante.setChecked(false);


        //view.setBackgroundColor(Color.argb(200,108,145,109));

    }



    public void enviar(View view){

        if (checkEnviarJustificante.isChecked()==true){
            Toast toast = Toast.makeText(this, "Tranferencia realizada", Toast.LENGTH_SHORT);
            toast.show();
        }

        rbtnPropia.setChecked(false);
        cmbOpciones.setVisibility(View.INVISIBLE);
        rbtnAjena.setChecked(false);
        edtAjena.setText("");
        edtAjena.setVisibility(View.INVISIBLE);
        checkEnviarJustificante.setChecked(false);




    }
}