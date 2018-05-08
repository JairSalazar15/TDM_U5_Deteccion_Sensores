package tdm.ittepic.edu.tdm_u5_deteccion_sensores;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView = null;
    SensorManager sensorManager;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);


        //sensores=(ListView)findViewById(R.id.lista);
        sensorManager = (SensorManager) this.getSystemService(SENSOR_SERVICE);

        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();

        for(int i=1; i<lista.size(); i++){
            data.append("Nombre :"+lista.get(i).getName() + "\n");
            data.append("Fabricante:"+lista.get(i).getVendor() + "\n");
            data.append("Version :"+lista.get(i).getVersion() + "\n");
            data.append("Rango :"+lista.get(i).getMaximumRange() + "\n");
            data.append("Retraso :"+lista.get(i).getMinDelay() + "\n");
            data.append("Poder :"+lista.get(i).getPower()+"\n"+"__________________________________________________" + "\n");

        }


        textView.setText(data);


    }

    /*
    public void verSensor() {
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < lista.size(); i++) {
            data.append("Nombre :" + lista.get(i).getName() + "\n");
            data.append("Fabricante:" + lista.get(i).getVendor() + "\n");
            data.append("Version :" + lista.get(i).getVersion() + "\n\n");
            data.append("Rango :" + lista.get(i).getMaximumRange() + "\n\n");
            data.append("Retraso :" + lista.get(i).getMinDelay() + "\n\n");
            data.append("Poder :" + lista.get(i).getPower() + "\n\n");

        }

    }
*/
}
