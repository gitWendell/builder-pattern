class Phone {
   private String unique_name;
   private String name;
   private String description;
   private boolean isKeypad;
   
   public Phone(PhoneBuilder builder) {
      this.unique_name = builder.getUniqueName();
      this.name = builder.getName();
      this.description = builder.getDescription();
      this.isKeypad = builder.getIsKeypad();
   }
   
   public void print() {
      System.out.println("Unique: " + this.unique_name + ", Name: " + this.name + ", Description: " + this.description + ", Is keypad: " + this.isKeypad);
   }
}