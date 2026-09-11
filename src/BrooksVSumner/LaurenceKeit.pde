// paul tokhtuev | 4B | Ap Computer Science
class LaurenceKeit extends Player
{
  public LaurenceKeit(int health, int score, int x, int y) 
  {
    super(health, score, x, y);
  }
  @Override //Override annotation; denote the follwoing method overrides the parent class method
  public void playerSetup() {
    super.setImg("LaurenceKeitt.jpeg", "Cane1_norm.png", "Cane1_strike.png"); 
    super.playerSetup(); // call the parent class setup method to resize images
  }
  
  @Override
  public void incrementCooldown() { //update cooldown (called in draw)
    super.incrementCooldown();
    if(super.getCooldown() == 150) { // able to use every 5 seconds
      super.setCooldown(0); 
      super.setAbilityUsed(false);
    } 
  }
  
  
  
  @Override
  public void useAbility(int jumpX, int jumpY) { //args unused here: these arguments only apply for PrestonBrooks, but are needed since overriding methods must be identical to the parent method definition
    if(super.getCooldown() == 0) {
      int[] position = super.position();
      rect(position[0],position[1], 220,220);
      // Somehow pass in the other player as a whole would make this method easier.
      // It would allow for this player to run hitbox checks within the player and not main. It also keeps the orginal purpose for of giving x and y of other player
      // Example if otherPlayer was passed in as the other one
      // otherPlayer.hitbox(otherPlayer.position()[0], this.y);
      super.setAbilityUsed(true);
    }
  }
}
