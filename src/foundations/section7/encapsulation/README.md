# Exercise 1
### Part 1
• Continue editing the `PrisonTest` project.

• Create a `Cell` class that includes the following:
- String `name` of the cell.
- Boolean describing whether the door is open.
- Two-argument constructor that sets both fields.

• Modify the `Prisoner` class so that it:
- Includes a `Cell` field.
- Sets the `Cell` field based on a constructor parameter.
- Prints the cell’s `name` as part of the `display()` method.
### Part 2
• Write an o`penDoor()` method in the `Prisoner` class.

– Access and modify the corresponding field in the `Cell` object so that:
- If the door is closed, open it.
- If the door is open, close it.

– Print whether the door opens or closes.

• From the main method:
- Instantiate a `Cell` and a `Prisoner` object.
- Call the prisoner’s `display()` method once.
- Call the `openDoor()` method a few times.