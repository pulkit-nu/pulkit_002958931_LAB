/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author pulkit
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public Observation findObservation(int id){
        for(Observation observation: this.vitalSignHistory){
            if(observation.getObservationId() == id){
                return observation;
            }
        }
        return null;
    }
    
    public Observation createObservation(int observationId, double temperature, double bloodPressure){
        Observation observation = new Observation();
        observation.setObservationId(observationId);
        observation.setTemperature(temperature);
        observation.setBloodPressure(bloodPressure);
        
        this.vitalSignHistory.add(observation);
        
        return observation;
    }
    
    public Boolean isObservationIDUnique(int id){
        for(Observation observation: this.vitalSignHistory){
            if(observation.getObservationId() == id){
                return false;
            }
        }
        return true;
    }
}
