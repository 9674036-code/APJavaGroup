class CharlesSumner extends Player {
    
  public CharlesSumner(int health, int score, int x, int y, int xOffset, int yOffset) {
     super(health, score, x, y, xOffset, yOffset); //pass in constructor variables to the parent class
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
    
  }
  
  @Override
  public void incrementCooldown() { //update cooldown (called in draw)
    super.incrementCooldown();
    if(super.getCooldown() == 60) {
      super.setCooldown(0); 
      super.setAbilityUsed(false);
    } //if the dodge is not used, cooldown halts increment, sets to 0
  }
  
  @Override
  public void useAbility(int jumpX, int jumpY) { //args unused here: these arguments only apply for PrestonBrooks, but are needed since overriding methods must be identical to the parent method definition
    if(super.getCooldown() == 0) {
      int randX = int(random(width-50)); //Select random position vars
      int randY = int(random(height-75));
      super.setPosition(randX, randY); //pass into the setter in the parent class
      super.setAbilityUsed(true);
    }
  }
  
}
