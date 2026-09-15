// paul tokhtuev | 4B | Ap Computer Science
class LaurenceKeitt extends Player
{
  public LaurenceKeitt(int health, int score, int x, int y,int xOffset, int yOffset) 
  {
    super(health, score, x, y, xOffset, yOffset);
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
  public void drawPlayer(boolean strike) {
    
    super.drawPlayer(strike); // call the parent class draw method to display avatar image
    if(strike) 
    { //if attacking, slam cane down (call image data with getter)
      image(super.getImg()[1], super.position()[0]+ super.Offsets()[0], super.position()[1]-super.Offsets()[1]);
    } else
    { //resting cane position
      image(super.getImg()[0], super.position()[0]+super.Offsets()[0],super.position()[1] );
    }
    
    if(getAbilityUsed() && getCooldown() <=10){
      
      image(super.getImg()[2], super.position()[0]+super.Offsets()[0], super.position()[1]+30);
    int[] position = super.position();
    fill(255, 234, 0);
    if(super.Offsets()[0] <0)
    {
    rect(super.position()[0] +super.Offsets()[0],position[1]+30, -width-position[0],10);
    }else
    {
      rect(super.position()[0]+super.Offsets()[0],position[1]+30, width,10);
    }
    }
  }
  
  
  @Override
  public void useAbility(int jumpX, int jumpY) { //args unused here: these arguments only apply for PrestonBrooks, but are needed since overriding methods must be identical to the parent method definition
    if(super.getCooldown() == 0) {
      
      
      // Somehow pass in the other player as a whole would make this method easier.
      // It would allow for this player to run hitbox checks within the player and not main. It also keeps the orginal purpose for of giving x and y of other player
      // Example if otherPlayer was passed in as the other one
      // otherPlayer.hitbox(otherPlayer.position()[0], this.y);
      super.setAbilityUsed(true);
    }
  }
}
