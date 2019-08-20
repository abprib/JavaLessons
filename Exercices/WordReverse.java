//Reverse words if its length is more then 5
class Main {
  public static void main(String[] args) {
    String sentence = "This sentence must be reversed";
    StringBuffer buf = new StringBuffer(sentence);
    StringBuffer word = new StringBuffer();
    StringBuffer res = new StringBuffer();
    int i = 0;
    int mark = 0;
    while(i < 30){
      while((i < 30) && (buf.charAt(i) != ' ')){
        word.append(buf.charAt(i));
        i++;        
      }  
      if((i - mark)  > 5){
        res.append(word.reverse() + " ");        
      } else {
        res.append(word + " ");
      }
      word.setLength(0);
      i++;
      mark = i;
    }
    System.out.println(res.substring(0,sentence.length()).toString());
  }
}