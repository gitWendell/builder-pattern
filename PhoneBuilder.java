class PhoneBuilder {
   private String unique_name;
   private String name;
   private String description;
   private boolean isKeypad;
   
  public PhoneBuilder(String unique_name) {
   this.unique_name = unique_name;
  }
  
  public PhoneBuilder setName(String name) {
   this.name = name;
   
   return this;
  }
  
  public PhoneBuilder setDescription(String description) {
   this.description = description;
   
   return this;
  }
  
  public PhoneBuilder setIsKeypad(boolean isKeypad) {
   this.isKeypad = isKeypad;
   
   return this;
  }
  
  public String getUniqueName() {
   return this.unique_name;
  }
  
  public String getName() {
   return this.name;
  }
  
  public String getDescription() {
   return this.description;
  }
  
  public boolean getIsKeypad() {
   return this.isKeypad;
  }
  
  public Phone build() {
   return new Phone(this);
  }
}