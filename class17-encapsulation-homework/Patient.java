
public class Patient{

  private String _name;

  private PatientStatus _status = PatientStatus.New;

  public Patient(String name){    
    
    _name = name;
  }

  public void setStatus(PatientStatus status){

    _status = status;
  }

  public String getName(){

    return _name;
  }

  public PatientStatus getStatus(){

    return _status;
  }

  public String toString(){

    return "Name: " + _name + " Status: " + _status;
  }

}