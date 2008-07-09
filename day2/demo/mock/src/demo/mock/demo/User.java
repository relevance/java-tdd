package demo.mock.demo;

public class User {
  Player player;

  public User(Player player){
    this.player = player;
  }

  public int listenToSomeTunes(){
    return player.play();
  }

}
