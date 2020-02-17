
package BloodData;

import EnumBlood.sangreTipo;
import EnumRH.factor;

public class BloodData {
    private sangreTipo sangreTipo;
    private factor factor;
    
    public BloodData(){
        this.sangreTipo = sangreTipo.O;
        this.factor = factor.positivo;
    }
    public BloodData(sangreTipo sangreTipo, factor factor){
        this.sangreTipo = sangreTipo;
        this.factor = factor;    
    }
    
    public void setSangreTipo(sangreTipo sangreTipo){
        this.sangreTipo = sangreTipo;
    }
    public void setFactor(factor factor){
        this.factor = factor;
    }
    public sangreTipo getSangreTipo(){
        return this.sangreTipo;
    }
    public factor getFactor(){
        return this.factor;
    }
}
