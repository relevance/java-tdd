package demo.mock.live;

public class User {
  Player player;

  public User(Player player){
    this.player = player;
  }

  public int listenToSomeTunes(){
    //reachIntoPocket
    return player.play();
  }

}
