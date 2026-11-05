## Mo Spiegel: Planning doc with pseudocode
### Recursive Method
LET String location = "start"

METHOD choice(String location):
&nbsp;&nbsp;&nbsp;&nbsp;IF location == "end location 1":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OUTPUT "end scenario 1"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RETURN

&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF location == "end location 2":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OUTPUT "end scenario 2"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RETURN

&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF location == "end location 3":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OUTPUT "end location 3"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RETURN

&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF location == "start":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OUTPUT "scenario 1"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String decision = INPUT

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF decision == "decision 1":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String newLocation = "location 1"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF decision == "decision 2":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String newLocation = "location 2"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ENDIF

&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF location == "location 1":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OUTPUT "scenario 2"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String decision = INPUT

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF decision == "decision 1":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String newLocation = "location 2"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF decision == "decision 2":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String newLocation = "end location 1"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ENDIF

&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF location == "location 2":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OUTPUT "scenario 3"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String decision = INPUT

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF decision == "decision 1":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String newLocation = "end location 2"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF decision == "decision 2":
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LET String newLocation = "end location 3"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ENDIF
&nbsp;&nbsp;&nbsp;&nbsp;ENDIF

&nbsp;&nbsp;&nbsp;&nbsp;// This chain of IF statements can be continued for each new location/node.
&nbsp;&nbsp;&nbsp;&nbsp;// However, notice that this is very syntax-inefficient.

&nbsp;&nbsp;&nbsp;&nbsp;CALL choice(newLocation)
&nbsp;&nbsp;&nbsp;&nbsp;// Recursively call to repeat the process until the end conditions are reached.
