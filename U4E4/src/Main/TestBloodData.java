
package Main;

import BloodData.BloodData;
import EnumBlood.sangreTipo;
import EnumRH.factor;
import Patient.Patient;

public class TestBloodData {
    BloodData sangreyo = new BloodData(sangreTipo.A,factor.positivo);
    Patient yop = new Patient(34,18,sangreyo);     
}
