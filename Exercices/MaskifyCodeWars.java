//make a mask of '#' for the password
class MaskifyCodeWars {
  public static void main(String[] args) {
    System.out.println(maskify("8685fgffg"));
  }
  public static String maskify(String str) {
    StringBuffer sb = new StringBuffer(str);
    for(int i = 0; i < str.length() - 4; i++){
      sb.replace(i, i + 1, "#");
    }
    return sb.toString();
  }
}
