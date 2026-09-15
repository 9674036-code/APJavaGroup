class Player {
  
  private int health;
  private int score;
  private int x; //x position
  private int y; // y position
  private int xOffset; // offsets for the cane that will change if it is on either left or right side
  private int yOffset;
  private PImage img; // avatar image
  private PImage caneImg_norm; // cane image in rest form
  private PImage caneImg_strike; // cane image in striking/attacking/slamming form
  private PImage pistImg; // pistol image
  private boolean abilityUsed; //track if the ability is used 
  private int coolDown; //track cooldown for abilities (based on the 30 fps loop in draw)
  
  //Kirubashini S
  float speed = 6; //general speed
  float normalSpeed = 6; //player's normal speed
  float boostSpeed = 10; // increased speed when player click shift
  
  //constructor
  public Player(int health, int score, int x, int y,int xOffset, int yOffset) {
    this.health = health;
    this.score = score;
    this.x = x;
    this.y = y;
    this.xOffset = xOffset;
    this.yOffset = yOffset;
    this.abilityUsed = false;
    this.coolDown = 0;
  }
  
  public void powerBoost() {
  }
  
  //Setter for images
  
  // For normal players (not Laurence Keitt): no pistol image required
  public void setImg(String imgName, String caneImgName, String caneStrikeImgName) {
    this.img = loadImage(imgName);
    this.caneImg_norm = loadImage(caneImgName);
    this.caneImg_strike = loadImage(caneStrikeImgName);
  }

  // OVERLOADING method: For Laurence Keitt, pass in additional pistImg parameter
  public void setImg(String imgName, String caneImgName, String caneStrikeImgName, String pistImgName) {
    this.img = loadImage(imgName);
    this.caneImg_norm = loadImage(caneImgName);
    this.caneImg_strike = loadImage(caneStrikeImgName);
    this.pistImg = loadImage(pistImgName); // load pistol image
  }
  
  //Player setup; initialize images
  // Cannot be done in the constructor since the class is instantiated prior to 'void setup()' in the main file being called; images can only be loaded after 'void setup()' is called
  public void playerSetup() {
    if (img != null) img.resize(50,75);
    if (caneImg_norm != null) caneImg_norm.resize(70,70);
    if (caneImg_strike != null) caneImg_strike.resize(75,50);
    if (pistImg != null) {
      pistImg.resize(50,30);
    }
  }
  
  //getter for images
  public PImage[] getImg() {
    PImage[] returnVal;
    if (pistImg != null) {
      returnVal = new PImage[]{caneImg_norm, caneImg_strike, pistImg};
    } else {
      returnVal = new PImage[]{caneImg_norm, caneImg_strike};
    }
    return returnVal;
  }
  
  //Getter for retrieving player status data
  public int[] status() {
    //returns and integer array of shape 2 with the health at index 0, score at index 1
    int[] returnVal = {health,score};
    return returnVal;
  }
  
  //setter for position data
  public void setPosition(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  //Getter for retrieving position data
  public int[] position() {
    int[] returnVal = {x,y};
    return returnVal;
  }
  
  public int[] Offsets() {
    int[] returnVal = {xOffset,yOffset};
    return returnVal;
  }
  
  // check if hitbox is contacted
  public boolean hitbox(int hitX, int hitY) { //takes position of cane as argument
      if(hitX <= x+50 && hitX >=x && hitY >= y && hitY <= y+75) { //conditional statement to check if contacted
        return true; //return true if hit
      } else {
        return false;
      }
    }
    
  
  //modify health upon damage
  public void takeDamage(int damage) {
    health -= damage;
  }
  
  // modify score upon a hit
  public void addScore(int amount) {
    score += amount;
  }
  
  // move (update x and y values) based on the direction argument
  public void move(char direction) {
    if(direction == 'u') {
      if(y > 0) {  //check for screen edge before movign
        y -= speed;
       // yOffset -= 6;
      }
    } else if(direction == 'd') { 
      if(y < height-70) { //check for screen edge before movign
        y += speed;
       // yOffset += 6;
      }
    } else if(direction == 'l') {
      if(x>0) { //check for screen edge before movign
        x -= speed;
       // xOffset -= 6;
      }
    } else if(direction == 'r') {
      if(x<width-50) { //check for screen edge before movign
        x+= speed;
        //xOffset += 6;
      }
    }
  }
  
  //draw the player
  public void drawPlayer(boolean strike) { //NOTE: the arg is not used here, but is still denoted so that overriding can be done in the subclasses where the arg is used
    if (img != null) {
      image(img, x, y); //display avatar on screen
    }
  }
  public void reset(int health, int score, int x, int y) { //reset member vars
    this.health = health;
    this.score = score;
    this.x = x;
    this.y = y;
  }
  
  public void useAbility(int jumpX, int jumpY) { //unused args here taken so that overriding works where the child classes do use these args
    //No significant functionlaity here, overriden by child classes
    println("Ability used");
  }
  
  public void incrementCooldown() { //Increment cooldown for player abilities
    if(abilityUsed) {coolDown += 1;}
  }
  
  //getter for cooldown
  public int getCooldown() {
    return coolDown;
  }
  
  //setter for cooldown
  public void setCooldown(int setVal) {
    coolDown = setVal;
  }
  
  //getter for abilityUsed
  public boolean getAbilityUsed() {
    return abilityUsed;
  }
  
  //setter for abilityUsed
  public void setAbilityUsed(boolean setVal) {
    abilityUsed = setVal;
  }
  
  
}
