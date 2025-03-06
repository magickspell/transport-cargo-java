public class TransportValidator {
  public static boolean isValidTransportForCargo(Transport transport, Cargo cargo) {
    if (cargo.getType() == 1 && transport.getType() == 1) {
        return false;
    }
    /* пример как было бы c Rule классом
      Rule1 {
        transport: airplane,
        cargo: gasoline,
        allowed: false
      }
      Rule2 {
        transport: train,
        cargo: gasoline,
        allowed: true
        ...
        тут например еще поля maxHeight, maxWeight и т.д.
      }

     if (!rule.alloweAirplane) {
      return false;
     }
    */
    return true;
  }
}