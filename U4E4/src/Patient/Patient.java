
package Patient;

import BloodData.BloodData;

public class Patient {
    private Integer id;
    private Integer age;
    private BloodData sT;
    
     public Patient(){ //consructor
         this.id = 0;
         this.age = 0;
         this.sT = new BloodData(); //constructor de BloodData :O
     }
     public Patient(Integer id, Integer edad, BloodData sT){
         this.id = id;
         this.age = edad;
         this.sT = sT;
         
     }
     
     public void setId(Integer id){
         this.id = id;        
     }
     public Integer getId(){
         return this.id;
     }
     public void setAge(Integer age){
         this.age = age;        
     }
     public Integer getAge(){
         return this.age;
     }
}
