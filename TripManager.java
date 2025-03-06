public class TripManager {
  public void assignCargoToTransport(Transport transport, Cargo cargo) {
    if (TransportValidator.isValidTransportForCargo(transport, cargo)) {
      System.out.println("Cargo '" + cargo.getName() + "' applied to transport '" + transport.getName() + "' trip creted");
    } else {
      System.out.println("Error: cargo '" + cargo.getName() + "' transport '" + transport.getName() + "' cant handle it");
    }
  }
}
/* как бы создаем новую грузоперевозку */