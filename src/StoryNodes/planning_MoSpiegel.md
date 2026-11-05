LET String location = "start"

METHOD choice(String location):
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>IF location == "end location 1":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT "end scenario 1"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>RETURN
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF location == "end location 2":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT "end scenario 2"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>RETURN
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF location == "end location 3":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT "end location 3"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>RETURN
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF location == "start":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT "scenario 1"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String decision = INPUT
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>IF decision == "decision 1":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String newLocation = "location 1"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF decision == "decision 2":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String newLocation = "location 2"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>ENDIF
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF location == "location 1":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT "scenario 2"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String decision = INPUT
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>IF decision == "decision 1":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String newLocation = "location 2"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF decision == "decision 2":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String newLocation = "end location 1"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>ENDIF
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF location == "location 2":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT "scenario 3"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String decision = INPUT
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>IF decision == "decision 1":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String newLocation = "end location 2"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>ELSE IF decision == "decision 2":
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>LET String newLocation = "end location 3"
<escape>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</escape>ENDIF
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>ENDIF

<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>// This chain of IF statements can be continued for each new location/node.
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>// However, notice that this is very syntax-inefficient.

<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>CALL choice(newLocation)
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>// Recursively call to repeat the process until the end conditions are reached.

LET Array nodeTree = [
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>\["start"\],
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>\["scenario 1", "scenario 2"\],
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>\["scenario 3", "scenario 4", "scenario 5", "scenario 6"\]
]

METHOD choice(int[] location):
<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>// Takes a location array with elements \[depth, node\]

<escape>&nbsp;&nbsp;&nbsp;&nbsp;</escape>OUTPUT nodeTree[location\[0\]\][location\[1\]\]
