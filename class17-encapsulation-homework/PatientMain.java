
public class PatientMain{ 

  public static void main(String[] args) {

     Patient[] patients = createPatients();

     printPatients(patients);
     System.out.println();

     int numOfDoctorsNeeded = calculateNumOfDoctorsNeeded(patients);
     System.out.println("Need " + numOfDoctorsNeeded + " doctors");

     int numOfNursesNeeded = calculateNumOfNursesNeeded(patients);
     System.out.println("Need " + numOfNursesNeeded + " nurses");
    
  }

  public static Patient[] createPatients(){

    Patient[] patients = new Patient[5];

    patients[0] = new Patient("A");
    patients[0].setStatus(PatientStatus.New);

    patients[1] = new Patient("B");
    patients[1].setStatus(PatientStatus.Triaged);

    patients[2] = new Patient("C");
    patients[2].setStatus(PatientStatus.Admitted);

    patients[3] = new Patient("D");
    patients[3].setStatus(PatientStatus.Released);

    patients[4] = new Patient("E");
    patients[4].setStatus(PatientStatus.Released);

    return patients;
  }

  public static void printPatients(Patient[] patients){

    for (int i=0; i<patients.length; i++){
      System.out.println(patients[i].toString());
    }
  }

  public static int calculateNumOfDoctorsNeeded(Patient[] patients){

    int numOfDoctorsNeeded = 0;

    for (int i=0; i<patients.length; i++){
      if (patients[i].getStatus() == PatientStatus.Admitted){        
        numOfDoctorsNeeded++;
      }
    } 

    return numOfDoctorsNeeded;   
  }

  public static int calculateNumOfNursesNeeded(Patient[] patients){

    int numOfNursesNeeded = 0;

    for (int i=0; i<patients.length; i++){
      if (patients[i].getStatus() == PatientStatus.Triaged || 
        patients[i].getStatus() == PatientStatus.Released){        
        numOfNursesNeeded++;
      }
    } 

    return numOfNursesNeeded;   
  }

}