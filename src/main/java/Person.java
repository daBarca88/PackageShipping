public class Person {

   private String name;
   private String address;
   private String city;
   private String state;
   private String postalCode;

   public Person() {
   }

   public Person(String name, String address, String city, String state, String postalCode) {
      this.name = name;
      this.address = address;
      this.city = city;
      this.state = state;
      this.postalCode = postalCode;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getPostalCode() {
      return postalCode;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   @Override
   public String toString() {
      return name + "\n" +
              address + "\n" +
              city + "\n" +
              state + "\n" +
              postalCode;
   }
}
