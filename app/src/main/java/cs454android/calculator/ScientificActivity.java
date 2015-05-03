package cs454android.calculator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ScientificActivity extends ActionBarActivity {
    private Button btn_sin, btn_cos, btn_tan, btn_i,
            btn_ln, btn_log, btn_pi, btn_e,
            btn_factorial, btn_modulus, btn_sqrt, btn_power,
            btn_lpara, btn_rpara, btn_delete;

    private boolean hasDecimal;
    private EditText output;
    private float num1, num2;
    private String operation;
    private boolean[] possible = new boolean[3];
    private boolean nextPressClear;
    private boolean isUnaryOn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific_layout);

        output = (EditText)findViewById(R.id.textOutput);
        disableSoftInputFromAppearing(output);

        Intent intent = getIntent();
        output.setText(intent.getStringExtra("output"), TextView.BufferType.EDITABLE);
        num1 = intent.getFloatExtra("num1", 0);
        num2 = intent.getFloatExtra("num2", 0);
        operation = intent.getStringExtra("operation");
        possible = intent.getBooleanArrayExtra("possible");
        nextPressClear = intent.getBooleanExtra("nextPressClear", nextPressClear);
        hasDecimal = intent.getBooleanExtra("hasDecimal", hasDecimal);
        isUnaryOn = intent.getBooleanExtra("isUnaryOn", isUnaryOn);

        setButtons();
        if (intent.getStringExtra("operation") != null) {
            setButtonHighlight();
        }
    }

    public void setButtons(){
        btn_sin = (Button)findViewById(R.id.sin);
        btn_cos = (Button)findViewById(R.id.cos);
        btn_tan = (Button)findViewById(R.id.tan);
        btn_i = (Button)findViewById(R.id.imaginary);
        btn_ln = (Button)findViewById(R.id.ln);
        btn_log = (Button)findViewById(R.id.log);
        btn_pi = (Button)findViewById(R.id.pi);
        btn_e = (Button)findViewById(R.id.e);
        btn_modulus = (Button)findViewById(R.id.modulus);
        btn_factorial = (Button)findViewById(R.id.factorial);
        btn_sqrt = (Button)findViewById(R.id.sqrt);
        btn_power = (Button)findViewById(R.id.power);
        btn_lpara = (Button)findViewById(R.id.lparan);
        btn_rpara = (Button)findViewById(R.id.rparan);
        btn_delete = (Button)findViewById(R.id.delete);

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (possible[1]){
                    if(nextPressClear){
                        nextPressClear = false;
                        output.setText("", TextView.BufferType.EDITABLE);
                    }
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = false;
                    isUnaryOn = true;
                    operation = "sin";
                    resetButtonsColor();
                    btn_sin.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (possible[1]){
                    if(nextPressClear){
                        nextPressClear = false;
                        output.setText("", TextView.BufferType.EDITABLE);
                    }
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = false;
                    isUnaryOn = true;
                    operation = "cos";
                    resetButtonsColor();
                    btn_cos.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (possible[1]){
                    if(nextPressClear){
                        nextPressClear = false;
                        output.setText("", TextView.BufferType.EDITABLE);
                    }
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = false;
                    isUnaryOn = true;
                    operation = "tan";
                    resetButtonsColor();
                    btn_tan.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No Imaginary Numbers. :(", Toast.LENGTH_LONG).show();
            }
        });
        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (possible[1]){
                    if(nextPressClear){
                        nextPressClear = false;
                        output.setText("", TextView.BufferType.EDITABLE);
                    }
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = false;
                    isUnaryOn = true;
                    operation = "ln";
                    resetButtonsColor();
                    btn_ln.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (possible[1]){
                    if(nextPressClear){
                        nextPressClear = false;
                        output.setText("", TextView.BufferType.EDITABLE);
                    }
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = false;
                    isUnaryOn = true;
                    operation = "log";
                    resetButtonsColor();
                    btn_log.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    output.setText("3.14159265359", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    output.setText("2.71828182846", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn){
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(output.getText().toString());
                    }
                    catch(NumberFormatException e){
                    }
                    operation = "%";
                    resetButtonsColor();
                    btn_modulus.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (possible[1]){
                    if(nextPressClear){
                        nextPressClear = false;
                        output.setText("", TextView.BufferType.EDITABLE);
                    }
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = false;
                    isUnaryOn = true;
                    operation = "factorial";
                    resetButtonsColor();
                    btn_factorial.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn){
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(output.getText().toString());
                    }
                    catch(NumberFormatException e){
                    }
                    operation = "sqrt";
                    resetButtonsColor();
                    btn_sqrt.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn){
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(output.getText().toString());
                    }
                    catch(NumberFormatException e){
                    }
                    operation = "power";
                    resetButtonsColor();
                    btn_power.setBackgroundColor(Color.RED);
                    output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_lpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "(", Toast.LENGTH_LONG).show();
            }
        });
        btn_rpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), ")", Toast.LENGTH_LONG).show();
            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (output.length() > 0) {
                    if(output.getText().toString().substring(output.length()-1,output.length()).equals(".")){
                        hasDecimal = false;
                    }

                    output.setText(output.getText().delete(output.length()- 1, output.length()), TextView.BufferType.EDITABLE);
                }
            }
        });
    }

    private void resetButtonsColor(){
        btn_sin.setBackgroundResource(R.drawable.large_button);
        btn_cos.setBackgroundResource(R.drawable.large_button);
        btn_tan.setBackgroundResource(R.drawable.large_button);
        btn_ln.setBackgroundResource(R.drawable.large_button);
        btn_log.setBackgroundResource(R.drawable.large_button);
        btn_modulus.setBackgroundResource(R.drawable.large_button);
        btn_factorial.setBackgroundResource(R.drawable.large_button);
        btn_sqrt.setBackgroundResource(R.drawable.large_button);
        btn_power.setBackgroundResource(R.drawable.large_button);
    }
    private void setButtonHighlight() {
        resetButtonsColor();
        switch(operation){
            case "sin":
                btn_sin.setBackgroundColor(Color.RED);
                break;
            case "cos":
                btn_cos.setBackgroundColor(Color.RED);
                break;
            case "tan":
                btn_tan.setBackgroundColor(Color.RED);
                break;
            case "ln":
                btn_ln.setBackgroundColor(Color.RED);
                break;
            case "log":
                btn_log.setBackgroundColor(Color.RED);
                break;
            case "%":
                btn_modulus.setBackgroundColor(Color.RED);
                break;
            case "factorial":
                btn_factorial.setBackgroundColor(Color.RED);
                break;
            case "sqrt":
                btn_sqrt.setBackgroundColor(Color.RED);
                break;
            case "power":
                btn_power.setBackgroundColor(Color.RED);
                break;
        }
    }

    public static void disableSoftInputFromAppearing(EditText editText){
        if(Build.VERSION.SDK_INT >= 11){
            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
            editText.setTextIsSelectable(true);
        }
        else{
            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        if (id == R.id.Scientific) {
            return true;
        }

        if (id == R.id.Basic) {
            Intent basic = new Intent(ScientificActivity.this, MainActivity.class);
            basic.putExtra("output", output.getText().toString() );
            basic.putExtra("num1", num1);
            basic.putExtra("num2", num2);
            basic.putExtra("operation", operation);
            basic.putExtra("possible", possible);
            basic.putExtra("nextPressClear", nextPressClear);
            basic.putExtra("hasDecimal", hasDecimal);
            basic.putExtra("isUnaryOn", isUnaryOn);

            basic.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(basic);
        }

        return super.onOptionsItemSelected(item);
    }
}
