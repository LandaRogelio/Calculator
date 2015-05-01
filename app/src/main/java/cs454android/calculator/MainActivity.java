package cs454android.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button btn_1, btn_2, btn_3,
            btn_4, btn_5, btn_6, btn_7,
            btn_8, btn_9, btn_0, btn_decimal,
            btn_equal, btn_add, btn_multiply,
            btn_divide, btn_subtract, btn_delete;

    private String output;
    private boolean hasDecimal;
    private boolean newOperation;
    private float num1, num2;
    private String operation;
    private EditText _output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = "";
        setButtons();
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
        btn_multiply=(Button)findViewById(R.id.mulitply);
        btn_divide=(Button)findViewById(R.id.divide);
        btn_subtract=(Button)findViewById(R.id.subtract);
        btn_delete=(Button)findViewById(R.id.delete);
        _output = (EditText)findViewById(R.id.textOutput);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText()+"1", TextView.BufferType.EDITABLE);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "2", TextView.BufferType.EDITABLE);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "3", TextView.BufferType.EDITABLE);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "4", TextView.BufferType.EDITABLE);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "5", TextView.BufferType.EDITABLE);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "6", TextView.BufferType.EDITABLE);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "7", TextView.BufferType.EDITABLE);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "8", TextView.BufferType.EDITABLE);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "9", TextView.BufferType.EDITABLE);
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.setText(_output.getText() + "0", TextView.BufferType.EDITABLE);
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!hasDecimal){
                    _output.setText(_output.getText()+".", TextView.BufferType.EDITABLE);
                    hasDecimal = true;
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
                num1 = Float.parseFloat(_output.getText().toString());
                operation = "+";
                _output.setText("", TextView.BufferType.EDITABLE);
            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(_output.getText().toString());
                operation = "-";
                _output.setText("", TextView.BufferType.EDITABLE);
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(_output.getText().toString());
                operation = "*";
                _output.setText("", TextView.BufferType.EDITABLE);
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(_output.getText().toString());
                operation = "/";
                _output.setText("", TextView.BufferType.EDITABLE);
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(_output.getText().toString());
                switch(operation){
                    case "+":
                        _output.setText( String.valueOf(num1 + num2), TextView.BufferType.EDITABLE );
                        break;
                    case "-":
                        _output.setText( String.valueOf(num1 - num2), TextView.BufferType.EDITABLE );
                        break;
                    case "*":
                        _output.setText( String.valueOf(num1 * num2), TextView.BufferType.EDITABLE );
                        break;
                    case "/":
                        _output.setText( String.valueOf(num1 / num2), TextView.BufferType.EDITABLE );
                        break;
                }
                operation = " ";
            }
        });
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
            Intent scientific = new Intent(MainActivity.this, ScientificActivity.class);
            scientific.putExtra("output", _output.getText().toString() );
            scientific.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(scientific);
        }

        return super.onOptionsItemSelected(item);
    }
}
