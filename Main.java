class Main {
   
   public static void main(String[] args) {
      Phone newPhone = new PhoneBuilder("19220 2")
                           .setName("OPLOK A11 2")
                           .setDescription("WA LANG 2")
                           .setIsKeypad(false)
                           .build();
                           
      newPhone.print();
   }
}