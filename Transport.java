public class Transport {
  private int id;
  private String name;
  private int type; // 1 - самолет; 2 - корабль; 3 - поезд;

  public Transport(int id, String name, int type) {
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
