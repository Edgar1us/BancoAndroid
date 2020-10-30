package edbeca.simarro.aplicaciondebanco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import edbeca.simarro.aplicaciondebanco.bd.MiBancoOperacional;
import edbeca.simarro.aplicaciondebanco.pojo.Cliente;


public class pantallalogin extends AppCompatActivity {

    Button enter;
    String edtUser2;
    EditText edtPass, edtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallalogin);
        //TextView txtdatos=(TextView)findViewById(R.id.txtdatos);
        //MiBancoOperacional mbo = MiBancoOperacional.getInstance(this);

        // Volvemos a dejar la password como estaba y nos logueamos de nuevo
        edtUser = (EditText)findViewById(R.id.edtUser);
        edtUser2 = String.valueOf(edtUser);
        edtPass = (EditText)findViewById(R.id.edtPass);
        enter = (Button) findViewById(R.id.btnEnter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txtdatos=(TextView)findViewById(R.id.txtdatos);
                Cliente c = new Cliente();
                c.setNif(edtUser2);
                c.setClaveSeguridad("1234");

                //c = mbo.login(c);

                if(edtUser.getText().toString().equals("1A") && edtPass.getText().toString().equals("1234")){
                    Intent intent = new Intent(pantallalogin.this, pantallaprincipal.class);
                    startActivity(intent);
                    txtdatos.append("\n");

                }else{
                    txtdatos.append("Error , al iniciar sesión\n");
                    txtdatos.append("\n");
                }

            }
        });
    }
}