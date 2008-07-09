package demo.mock.solution;

public class User {
  private Player player;

  public User setPlayer(Player player){
    this.player = player;
    return this;
  }

  public int listenToSomeTunes(){
    return player.play();
  }

}
