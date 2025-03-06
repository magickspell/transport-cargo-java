public class Main {
  public static void main(String[] args) {
      Transport plane = new Transport(1, "Самолет", 1);
      Transport ship = new Transport(3, "Поезд", 2);
      Cargo propane = new Cargo(1, "Газ", 1);
      Cargo gasoline = new Cargo(2, "Бензин", 2);

      TripManager tripManager = new TripManager();

      tripManager.assignCargoToTransport(plane, propane); // error
      tripManager.assignCargoToTransport(ship, propane);   // ok
      tripManager.assignCargoToTransport(plane, gasoline); // ok
  }
}