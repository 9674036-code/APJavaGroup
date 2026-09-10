# APJavaGroup
## Mo
Added char weaponType argument to playerSetup() in the parent function; If your guys' player object uses a cane, pass in 'c' to the playerSetup() child class method, if its a pistol pass in 'p':

Example for players with canes:

@Override
public void playerSetup('c') {
  super.setImg("CharlesSummer.jpg", "Cane1_norm.png", "Cane1_strike.png"); //pass Charles Sumner images into the parent class setter
  super.playerSetup('c'); // call the parent class setup method to resize images
}
