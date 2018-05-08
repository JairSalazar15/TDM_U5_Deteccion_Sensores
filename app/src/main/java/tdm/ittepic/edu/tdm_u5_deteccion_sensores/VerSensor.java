package tdm.ittepic.edu.tdm_u5_deteccion_sensores;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

/**
 * Created by Jair on 16/11/2017.
 */

public class VerSensor extends AppCompatActivity {
    SensorManager sensorManager;

    public VerSensor() {

    }
    public void Datos() {
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();
        for (int i = 1; i < lista.size(); i++) {
            data.append("Nombre :" + lista.get(i).getName() + "\n");
            data.append("Fabricante:" + lista.get(i).getVendor() + "\n");
            data.append("Version :" + lista.get(i).getVersion() + "\n");
            data.append("Rango :" + lista.get(i).getMaximumRange() + "\n");
            data.append("Retraso :" + lista.get(i).getMinDelay() + "\n");
            data.append("Poder :" + lista.get(i).getPower() + "\n"+"__________________________________________________" + "\n");

        }
    }
}
