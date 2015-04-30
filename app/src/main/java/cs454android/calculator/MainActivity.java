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
import android.widget.Toast;

import java.util.Arrays;


public class MainActivity extends ActionBarActivity {
    private Button btn_1, btn_2, btn_3,
            btn_4, btn_5, btn_6, btn_7,
            btn_8, btn_9, btn_0, btn_decimal,
            btn_equal, btn_add, btn_multiply,
            btn_divide, btn_subtract, btn_delete;
    private String operations[] = new String[3];
    private int operationIndex;
    private String output;
    private boolean hasDecimal;

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

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=1;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=2;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=3;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=4;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=5;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=6;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=7;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=8;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=9;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output+=0;
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!hasDecimal){
                    output+=".";
                    hasDecimal = true;
                }

                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (output.length() > 0) {
                    if(output.substring(output.length()-1, output.length()).equals(".")){
                        hasDecimal = false;
                    }
                    output = output.substring(0, output.length()-1);
                }
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.length() == 0) {
                    return;
                }
                //cant get this to work.
                if( !(output.substring(output.length()-1, output.length()).equals("+")) || !(output.substring(output.length()-1, output.length()).equals("-")) ){
                    output += "+";
                }
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!output.substring(output.length()-1, output.length()).equals("+") || !output.substring(output.length()-1, output.length()).equals("-") || !output.substring(output.length()-1, output.length()).equals("*") || !output.substring(output.length()-1, output.length()).equals("/")){
                    output += "-";
                }
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!output.substring(output.length()-1, output.length()).equals("+") || !output.substring(output.length()-1, output.length()).equals("-") || !output.substring(output.length()-1, output.length()).equals("*") || !output.substring(output.length()-1, output.length()).equals("/")){
                    output += "*";
                }
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!output.substring(output.length()-1, output.length()).equals("+") || !output.substring(output.length()-1, output.length()).equals("-") || !output.substring(output.length()-1, output.length()).equals("*") || !output.substring(output.length()-1, output.length()).equals("/")){
                    output += "/";
                }
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output=calculateAnswer();
                EditText editText = (EditText) findViewById(R.id.textOutput);
                editText.setText(output, TextView.BufferType.EDITABLE);
            }
        });
    }

    public String calculateAnswer(){
        String newOutput = "";
        String[] splitOutput = output.split("(?<=[-+*/])|(?=[-+*/])");
        newOutput = Arrays.toString(splitOutput);
        while(Arrays.asList(splitOutput).contains("+") || Arrays.asList(splitOutput).contains("-") || Arrays.asList(splitOutput).contains("*") || Arrays.asList(splitOutput).contains("/")){
            for(int i = 0 ; i < newOutput.length() ; i++){
                if((splitOutput[i].equals("*")) || splitOutput[i].equals("/")){
                    
                }
            }
        }
        return newOutput;
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
            scientific.putExtra("output", output);
            scientific.putExtra("operations", operations);
            scientific.putExtra("opIndex", operationIndex);
            scientific.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(scientific);
        }

        return super.onOptionsItemSelected(item);
    }
}
