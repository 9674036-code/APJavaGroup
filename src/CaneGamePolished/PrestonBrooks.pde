class PrestonBrooks extends Player {

  public PrestonBrooks(int health, int score, int x, int y, int xOffset, int yOffset, float speed, float normalSpeed, float boostSpeed) {
    super(health, score, x, y, xOffset, yOffset); //pass in constructor params into the parent class
  }

  @Override
    public void drawPlayer(boolean strike) {
    super.drawPlayer(strike); // call the parent class draw method to display the avatar
    if (strike)
    { //if attacking, slam cane down (call image data with getter)
      image(super.getImg()[1], super.position()[0]+ super.Offsets()[0], super.position()[1]-super.Offsets()[1]);
    } else
    { //resting cane position
      image(super.getImg()[0], super.position()[0]+super.Offsets()[0], super.position()[1] );
    }
  }

  @Override
    public void incrementCooldown() { //update cooldown (called in draw)
    super.incrementCooldown();
    if (super.getCooldown() == 30) {
      super.setCooldown(0);
      super.setAbilityUsed(false);
    } //if the dodge is not used, cooldown halts increment, sets to 0
  }


  @Override
    public void useAbility(int jumpX, int jumpY) { //take parameters that correspond to the position of p2
    if (super.getCooldown() == 0) {
      super.setPosition(jumpX, jumpY); // jump to p2 position (use the position setter in parent class)
      super.setAbilityUsed(true);
    }
  }


  //Kirubashini S
  @Override
    public void powerBoost() {
    if (keyPressed && keyCode == SHIFT) { //if shift key is pressed increase speed
      this.speed = this.boostSpeed;
    } else {
      this.speed = this.normalSpeed; //otherwise keep normal speed for preston Brooks
    }
  }
}
