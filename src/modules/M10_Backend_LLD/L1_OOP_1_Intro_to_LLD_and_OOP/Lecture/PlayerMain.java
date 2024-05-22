package modules.M10_Backend_LLD.L1_OOP_1_Intro_to_LLD_and_OOP.Lecture;

class PlayerMain {
  public static void main(String[] args) {
    Player p = new Player();
    p.name = "Harshal";
    p.setAge(26);
    p.makeGuess(20);

    int lastGuess = p.getNumber();
    System.out.println(lastGuess);
    System.out.println(p.getAge());
  }
}
