//Validate the pin by length and numbers
class PinValidate {
  public static void main(String[] args) {
    String pin = "1r34";
    boolean isValid = true;
    int k;
    if((pin.length() == 4) || (pin.length() == 6)){
      for(int i = 0; i < pin.length(); i++){
        k = pin.charAt(i) - '0';
        if((k < 0) || (k > 9)){
          isValid = false;
          break;
        }
      }
    } else {
      isValid = false;
    }
    System.out.println(isValid);
  }
}
