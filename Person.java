  
class Person {
  private String name;
  private int age;
  private String color;

  Person(String pName, int pAge, String pColor){
    name = pName;
    age = pAge;
    color = pColor;
  }

  /**
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }


}