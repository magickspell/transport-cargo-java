public class Cargo {
  private int id;
  private String name;
  private int type; // 1 - газообразные; 2 - текучие; 3 - сыпучие;

  public Cargo(int id, String name, int type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getType() {
    return type;
  }
}