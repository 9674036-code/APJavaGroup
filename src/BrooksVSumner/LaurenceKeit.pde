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
  public void useAbility(int jumpX, int jumpY) { //args unused here: these arguments only apply for PrestonBrooks, but are needed since overriding methods must be identical to the parent method definition
    if(super.getCooldown() == 0) {
      
      super.setAbilityUsed(true);
    }
  }
}
