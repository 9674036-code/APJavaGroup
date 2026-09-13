# APJavaGroup
## Mo

### Advice for Paul:
For Laurence Keit, I think that we should handle the hitbox checks in the main file. Probably Ethan can work that out: For now, focus on the draw logic for the pistol and the projectile, find an image for the pistol oriented facing right and facing left, and you can pass one of those images in as an additional parameter into setImg() to set a pistol image in the parent class (ex. super.setImg("LaurenceKeitt.jpeg", "Cane1_norm.png", "Cane1_strike.png", "Pistol.png"); this will set a pistol image in the parent class.) Then, you can call drawPlayer() in the child class and override the parent class draw function (see Charles Sumner or Preston Brooks for examples, you should include the cane drawing logic already present, just with additional pistol logic), and draw the pistol and projectile rectangle if the user is firing (meaning if abilityUsed is True, and cooldown == 0).

### NEVERMIND DONT DO THIS:
Added char weaponType argument to playerSetup() in the parent function; If your guys' player object uses a cane, pass in 'c' to the playerSetup() child class method, if its a pistol pass in 'p':

Example for players with canes:

@Override
public void playerSetup('c') {
  super.setImg("CharlesSummer.jpg", "Cane1_norm.png", "Cane1_strike.png"); //pass Charles Sumner images into the parent class setter
    super.playerSetup('c'); // call the parent class setup method to resize images
}
