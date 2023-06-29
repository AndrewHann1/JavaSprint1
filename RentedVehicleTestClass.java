import java.util.Random;

public class RentedVehicleTestClass {
    public static void main(String[] args) {
        RentedVehicle[] rentedVehicles = new RentedVehicle[6];
        Random random = new Random();
        
        for (int i = 0; i < rentedVehicles.length; i++) {
            int randomNum = random.nextInt(3) + 1;
            
            if (randomNum == 1) {
                double baseFee = 50.0;
                int nbKms = random.nextInt(500) + 1;
                int nbSeats = random.nextInt(5) + 1;
                
                rentedVehicles[i] = new Car(baseFee, nbKms, nbSeats);
            } else if (randomNum == 2) {
                double baseFee = 30.0;
                int nbKms = random.nextInt(500) + 1;
            }
        }
    }
}   
               

