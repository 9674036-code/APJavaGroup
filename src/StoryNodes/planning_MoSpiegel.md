## Overall Strategy
**Plan:** Two solutions/method structures tested: One using a recursive method call and if-checks to handle decision making and node traversal, and another recursive method using a predefined dictionary/hashtable with all of the nodes, and then traversing that using the user inputs as keys.

## Pseudocode
### Method 1: Recursion with Conditional Statements
LET String location = "start"
METHOD choice(String location):
  IF location == "end location 1":
    OUTPUT "end scenario 1"
    RETURN
  ELSE IF location == "end location 2":
    OUTPUT "end scenario 2"
    RETURN
  ELSE IF location == "end location 3":
    OUTPUT "end location 3"
    RETURN
  ELSE IF location == "start":
    OUTPUT "scenario 1"
    LET String decision = INPUT
    IF decision = "decision 1":
      LET String newLocation = "location 1"
    ELSE IF decision = "decision 2":
      LET String newLocation = "location 2"
    ENDIF
  ELSE IF location == "location 1":
    OUTPUT "scenario 2"
    LET String decision = INPUT
    IF decision = "decision 1":
      LET String newLocation = "location 2"
    ELSE IF decision = "decision 2":
      LET String newLocation = "end location 1"
    ENDIF
  ELSE IF location == "location 2":
    OUTPUT "scenario 3"
    LET String decision = INPUT
    IF decision = "decision 1":
      LET String newLocation = "end location 2"
    ELSE IF decision = "decision 2":
      LET String newLocation = "end location 3"
    ENDIF
  ENDIF // This chain of if statement can be continued for each new location/node: However, notice that this is super syntax inefficient
  CALL choice(newLocation) // Recursively call to repeat the process, until the end conditions are reached
