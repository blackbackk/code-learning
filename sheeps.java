class Kata {
  public static String countingssheeps(int num) {
    String frase = "";
    int counter = 0;
      if (num == 0){
        return "";
      }
      while (counter != num){
        counter++;
        frase += counter+" sheep...";
      }
    return frase;
  }    
}