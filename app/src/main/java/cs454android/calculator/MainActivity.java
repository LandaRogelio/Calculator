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
import static java.lang.Math.*;


public class MainActivity extends ActionBarActivity {
    private Button btn_1, btn_2, btn_3,
            btn_4, btn_5, btn_6, btn_7,
            btn_8, btn_9, btn_0, btn_decimal,
            btn_equal, btn_add, btn_multiply,
            btn_divide, btn_subtract, btn_delete;

    private boolean hasDecimal;
    private float num1, num2;
    private String operation;
    private EditText _output;
    private boolean[] possible = new boolean[3];
    private boolean isUnaryOn;
    private boolean nextPressClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possible[0] = true;
        possible[1] = true;
        possible[2] = false;

        _output = (EditText)findViewById(R.id.textOutput);
        disableSoftInputFromAppearing(_output);

        Intent intent = getIntent();
        _output.setText(intent.getStringExtra("output"), TextView.BufferType.EDITABLE);
        num1 = intent.getFloatExtra("num1", 0);
        num2 = intent.getFloatExtra("num2", 0);
        operation = intent.getStringExtra("operation");
        nextPressClear = intent.getBooleanExtra("nextPressClear", nextPressClear);
        hasDecimal = intent.getBooleanExtra("hasDecimal", hasDecimal);
        isUnaryOn = intent.getBooleanExtra("isUnaryOn", isUnaryOn);
        if (intent.getBooleanArrayExtra("possible") != null) {
            possible = intent.getBooleanArrayExtra("possible");
        }

        setButtons();
        if (intent.getStringExtra("operation") != null) {
            setButtonHighlight();
        }

    }

    public void setButtons(){
        btn_1=(Button)findViewById(R.id.one);
        btn_2=(Button)findViewById(R.id.two);
        btn_3=(Button)findViewById(R.id.three);
        btn_4=(Button)findViewById(R.id.four);
        btn_5=(Button)findViewById(R.id.five);
        btn_6=(Button)findViewById(R.id.six);
        btn_7=(Button)findViewById(R.id.seven);
        btn_8=(Button)findViewById(R.id.eight);
        btn_9=(Button)findViewById(R.id.nine);
        btn_0=(Button)findViewById(R.id.zero);
        btn_decimal=(Button)findViewById(R.id.decimal);
        btn_equal=(Button)findViewById(R.id.equal);
        btn_add=(Button)findViewById(R.id.add);
        btn_multiply=(Button)findViewById(R.id.multiply);
        btn_divide=(Button)findViewById(R.id.divide);
        btn_subtract=(Button)findViewById(R.id.subtract);
        btn_delete=(Button)findViewById(R.id.delete);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]){
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText()+"1", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "2", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "3", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "4", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "5", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "6", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "7", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "8", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "9", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;

                    if(nextPressClear){
                        nextPressClear = false;
                        _output.setText("", TextView.BufferType.EDITABLE);
                    }
                    _output.setText(_output.getText() + "0", TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[0]){
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    if(!hasDecimal) {
                        if(nextPressClear){
                            nextPressClear = false;
                            _output.setText("", TextView.BufferType.EDITABLE);
                        }
                        _output.setText(_output.getText() + ".", TextView.BufferType.EDITABLE);
                        hasDecimal = true;
                    }
                }
            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (_output.length() > 0) {
                    if(_output.getText().toString().substring(_output.length()-1,_output.length()).equals(".")){
                        hasDecimal = false;
                    }

                    _output.setText(_output.getText().delete(_output.length()- 1, _output.length()), TextView.BufferType.EDITABLE);
                }
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn){
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(_output.getText().toString());
                    }
                    catch(NumberFormatException e){
                        Toast.makeText(getApplicationContext(), "Enter Number", Toast.LENGTH_SHORT).show();
                    }
                    operation = "+";

                    resetButtonsColor();
                    btn_add.setBackgroundColor(Color.RED);
                    _output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(_output.getText().toString());
                    }
                    catch(NumberFormatException e){
                        Toast.makeText(getApplicationContext(), "Enter Number", Toast.LENGTH_SHORT).show();
                    }
                    operation = "-";
                    resetButtonsColor();
                    btn_subtract.setBackgroundColor(Color.RED);
                    _output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(_output.getText().toString());
                    }
                    catch(NumberFormatException e){
                        Toast.makeText(getApplicationContext(), "Enter Number", Toast.LENGTH_SHORT).show();
                    }
                    operation = "*";
                    resetButtonsColor();
                    btn_multiply.setBackgroundColor(Color.RED);
                    _output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(possible[2] && !isUnaryOn) {
                    possible[0] = true;
                    possible[1] = false;
                    possible[2] = true;
                    try{
                        num1 = Float.parseFloat(_output.getText().toString());
                    }
                    catch(NumberFormatException e){
                        Toast.makeText(getApplicationContext(), "Enter Number", Toast.LENGTH_SHORT).show();
                    }
                    operation = "/";
                    resetButtonsColor();
                    btn_divide.setBackgroundColor(Color.RED);
                    _output.setText("", TextView.BufferType.EDITABLE);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Action", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation.equals("")){
                    try{
                        num2 = Float.parseFloat(_output.getText().toString());
                    }
                    catch(NumberFormatException e){
                        num2 = 0;
                    }

                    switch(operation){
                        case "+":
                            _output.setText( String.valueOf(num1 + num2), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "-":
                            _output.setText( String.valueOf(num1 - num2), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "*":
                            _output.setText( String.valueOf(num1 * num2), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "/":
                            _output.setText( String.valueOf(num1 / num2), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "sin":
                            _output.setText( String.valueOf(sin(num2)), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "cos":
                            _output.setText( String.valueOf(cos(num2)), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "tan":
                            _output.setText( String.valueOf(tan(num2)), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "ln":
                            _output.setText( String.valueOf(log(num2)), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "log":
                            _output.setText( String.valueOf(log10(num2)), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "%":
                            _output.setText( String.valueOf(num1%num2), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "factorial":
                            _output.setText( String.valueOf(factorial(num2)), TextView.BufferType.EDITABLE );
                            nextPressClear = true;
                            break;
                        case "sqrt":
                            if(num1 >= 0) {
                                _output.setText(String.valueOf(Math.pow(num1, 1 / num2)), TextView.BufferType.EDITABLE);
                            }
                            nextPressClear = true;
                            break;
                        case "power":
                            _output.setText(String.valueOf(Math.pow(num1,num2)), TextView.BufferType.EDITABLE);
                            nextPressClear = true;
                            break;
                    }
                    operation = "";
                    possible[0] = true;
                    possible[1] = true;
                    possible[2] = true;
                    isUnaryOn = false;
                    resetButtonsColor();
                }
            }
        });
    }

    public double factorial (float x){
        double d = (double)x;
        double fact = 1;
        for (int i = 1; i <= d; i++){
            fact = fact*1;
        }
        return fact;
    }

    private void resetButtonsColor(){
        btn_add.setBackgroundResource(R.drawable.large_button);
        btn_multiply.setBackgroundResource(R.drawable.large_button);
        btn_divide.setBackgroundResource(R.drawable.large_button);
        btn_subtract.setBackgroundResource(R.drawable.large_button);
    }

    private void setButtonHighlight(){
        resetButtonsColor();
        switch(operation){
            case "+":
                btn_add.setBackgroundColor(Color.RED);
                break;
            case "-":
                btn_subtract.setBackgroundColor(Color.RED);
                break;
            case "*":
                btn_multiply.setBackgroundColor(Color.RED);
                break;
            case "/":
                btn_divide.setBackgroundColor(Color.RED);
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

        if (id == R.id.Basic) {
            return true;
        }

        if (id == R.id.Scientific) {
            Intent scientific = new Intent(MainActivity.this, ScientificActivity.class);
            scientific.putExtra("output", _output.getText().toString() );
            scientific.putExtra("num1", num1);
            scientific.putExtra("num2", num2);
            scientific.putExtra("operation", operation);
            scientific.putExtra("possible", possible);
            scientific.putExtra("nextPressClear", nextPressClear);
            scientific.putExtra("hasDecimal", hasDecimal);
            scientific.putExtra("isUnaryOn", isUnaryOn);

            scientific.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(scientific);
        }

        return super.onOptionsItemSelected(item);
    }
}
