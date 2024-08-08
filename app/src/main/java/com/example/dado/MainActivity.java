  package com.example.dado;

  import android.os.Bundle;
  import android.view.View;
  import android.widget.TextView;

  import androidx.appcompat.app.AppCompatActivity;

  import java.util.Random;

  public class MainActivity extends AppCompatActivity {

    private TextView cara_1;
    private TextView cara_2;
    private TextView cara_3;
    private TextView cara_4;
    private TextView cara_5;
    private TextView cara_6;
    private TextView result;

    private int cont1, cont2, cont3, cont4, cont5, cont6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cara_1 = findViewById(R.id.cara1);
        cara_2 = findViewById(R.id.cara2);
        cara_3 = findViewById(R.id.cara3);
        cara_4 = findViewById(R.id.cara4);
        cara_5 = findViewById(R.id.cara5);
        cara_6 = findViewById(R.id.cara6);
        result = findViewById(R.id.resultado);
        cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0;
    }


    public void tirarDado(View view) {
        int tiro = 0;
        cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            tiro = r.nextInt((6 - 1) + 1) + 1;
            switch (tiro) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;
            }
        }
        cara_1.setText(cont1 + "");
        cara_2.setText(cont2 + "");
        cara_3.setText(cont3 + "");
        cara_4.setText(cont4 + "");
        cara_5.setText(cont5 + "");
        cara_6.setText(cont6 + "");

        int[] resultados = new int[6];
        resultados [0]=cont1;
        resultados [1]=cont2;
        resultados [2]=cont3;
        resultados [3]=cont4;
        resultados [4]=cont5;
        resultados [5]=cont6;

           int mayor= 0;
           String cara = "";

        for (int j = 0; j < 6; j++) {

            if (mayor < resultados [j]){ mayor = resultados[j]; cara = "" + (j+1);}
        }

              result.setText(cara);
    }
}