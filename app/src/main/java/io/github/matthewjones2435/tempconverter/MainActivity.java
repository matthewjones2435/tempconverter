package io.github.matthewjones2435.tempconverter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //  FAHRENHEIT VIEW/INPUT/ONCLICKLISTENERS

    final EditText fahrenheit = findViewById(R.id.enter_fahrenheit_temp);
    final TextView convertedFahrenheit = findViewById(R.id.converted_fahrenheit);
    final Button fahrToCel = findViewById(R.id.convert_f_to_celsius);
    final Button fahrToKel = findViewById(R.id.convert_f_to_kelvin);

    // FAHRENHEIT TO CELSIUS LISTENER WITH CONTROLLING CODE

    fahrToCel.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String input = fahrenheit.getText().toString();
        int convertFToCelsius = Integer.parseInt(input);
        float fahrenheit2Celsius = (convertFToCelsius - 32) * ((float) 5 / (float) 9);
        String value = String.valueOf(fahrenheit2Celsius) + "\u00B0 C";
        //Toast.makeText(MainActivity.this,value+"°C", Toast.LENGTH_LONG).show();
        convertedFahrenheit.setText(value);
      }
    });

    // FAHRENHEIT TO KELVIN LISTENER WITH CONTROLLING CODE

    fahrToKel.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String input2 = fahrenheit.getText().toString();
        int convertFToKelvin = Integer.parseInt(input2);
        double fahrenheit2Kelvin = (convertFToKelvin - 32) * (double) 5/9 + 273.15;
        convertedFahrenheit.setText("");
        String valueK = String.valueOf(fahrenheit2Kelvin) + "\u00B0 K";
        convertedFahrenheit.setText(valueK);
        //Toast.makeText(MainActivity.this,valueK+"°K", Toast.LENGTH_LONG).show();
      }
    });


    //  CELSIUS VIEW/INPUT/ONCLICKLISTENERS

    final EditText celsius = findViewById(R.id.enter_celsius_temp);
    final Button celToFahrenheit = findViewById(R.id.convert_c_to_fahrenheit);
    final Button celToKelvin = findViewById(R.id.convert_c_to_kelvin);
    final TextView convertedCelsius = findViewById(R.id.converted_celsius);

    // CELSIUS TO FAHRENHEIT LISTENER WITH CONTROLLING CODE

    celToFahrenheit.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String input3 = celsius.getText().toString();
        int celsiusToFahrenheit = Integer.parseInt(input3);
        double celsius2Fahrenheit =(celsiusToFahrenheit * (double) 9/5) + 32;
        String valueC2F = String.valueOf(celsius2Fahrenheit) + "\u00B0 F";
        convertedCelsius.setText(valueC2F);
      }
    });


    // CELSIUS TO KELVIN LISTENER WITH CONTROLLING CODE

    celToKelvin.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String input4 = celsius.getText().toString();
        int celsiusToKelvin = Integer.parseInt(input4);
        double celsius2Kelvin =celsiusToKelvin + (double) 273.15;
        convertedCelsius.setText("");
        String valueC2K = String.valueOf(celsius2Kelvin) + " \u00B0 K";
        convertedCelsius.setText(valueC2K);
      }
    });


    //  KELVIN VIEW/INPUT/ONCLICKLISTENERS


    final EditText kelvin = findViewById(R.id.enter_kelvin_temp);
    final Button KelToFahrenheit = findViewById(R.id.convert_k_to_fahrenheit);
    final Button KelToCelsius = findViewById(R.id.convert_k_to_celsius);
    final TextView convertedKelvin = findViewById(R.id.converted_kelvin);


    // KELVIN TO FAHRENHEIT LISTENER WITH CONTROLLING CODE

    KelToFahrenheit.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String input5 = kelvin.getText().toString();
        int kelvinToFahrenheit = Integer.parseInt(input5);
        double kelvin2Fahrenheit = (kelvinToFahrenheit - 273.15) * 9/5 + 32;
        String valueK2F = String.valueOf(kelvin2Fahrenheit) + "\u00B0 F";
        convertedKelvin.setText(valueK2F);
      }
    });


    // KELVIN TO CELSIUS LISTENER WITH CONTROLLING CODE

    KelToCelsius.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        String input6 = kelvin.getText().toString();
        int kelvinToCelsius = Integer.parseInt(input6);
        double kelvin2Celsius = kelvinToCelsius - 273.15;
        convertedKelvin.setText("");
        String valueK2F = String.valueOf(kelvin2Celsius) + "\u00B0 F";
        convertedKelvin.setText(valueK2F);
      }
    });


  }
}
