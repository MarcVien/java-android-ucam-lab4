package com.laboratorio2.marcelo.laboratorio4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;


public class PrincipalActivity extends ActionBarActivity {

    private Button btnOk;
    private Button btnLimpar;
    private EditText acessoEditText;
    private EditText senhaEditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        acessoEditText = (EditText) findViewById(R.id.acessoUsuario);
        senhaEditText = (EditText) findViewById(R.id.senhaUsuario);
        resultadoTextView = (TextView) findViewById(R.id.resultadoUsuario);

        btnOk = (Button) findViewById(R.id.acessoButton);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okButtonAction();
            }

            private void okButtonAction() {
                String acesso = acessoEditText.getText().toString();
                String senha = senhaEditText.getText().toString();

                if (acesso.equals("marcelo") && senha.equals("123"))
                {
                    resultadoTextView.setText("Acesso OK!");
                }
                else
                {
                    resultadoTextView.setText("Acesso negado :-(");
                }
            }
        });

        btnLimpar = (Button) findViewById(R.id.limparButton);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparButtonAction();
            }

            private void limparButtonAction() {
                acessoEditText.setText(null);
                senhaEditText.setText(null);
                resultadoTextView.setText(null);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
