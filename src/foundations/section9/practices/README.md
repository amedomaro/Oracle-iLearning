# Practices - Section 9
### Finding a Central Location
###### Overview
Have you ever wondered where the most centrally located point on campus is? How about a centrally 
located point between you and a number of your friends? In this Problem Set, you’ll write a JavaFX 
program that answers these questions visually.

###### Tasks
Your goal is to create the CampusMap program that uses your map of campus, dorm names, dorm populations, 
and your group of friends. You’re welcome to design your own campus map (this is your background 
graphic). You’ll have to design your own campus map if your actual campus has fewer than 3 dorms, 
otherwise this Problem Set wouldn’t be too interesting.

###### The Dorms
Choose a way to visually represent dorms. The name and population of a dorm must also be visible. The 
population and location of each dorm must somehow be adjustable while the program is running.

###### The Center Points
Your program must show two center points. The first point represents the central location of all 
students in all dorms. This is essentially a center of mass problem where dorms with a larger 
population are considered more “massive” and have a greater influence over the center point’s 
location.

The second point represents the central location of your study group. Create a study group of at 
least 3 people, 1 of which must live in a different dorm.

Both center points must include a visual representation, a label, and display their location as 
numeric values. These points should automatically update as a dorm’s location or population changes. 
You’re welcome to leave these measurements as pixels or convert them into real-life units of distance.

However you choose to represent your dorms and points, remember to perform your distance calculations 
based on the geometric center of these visuals, and not the top-left corners.

###### Hints:
There are certain concepts we didn’t cover in Section 9, like how to work with a Text node. 
But we did discuss how to consult the JavaFX Ensemble.  Part of the challenge of this Problem Set is 
understanding how to consult resources.  If you have ideas about a feature you’d like to implement or 
a technique you’d like to explore, don’t be afraid to consult the JavaFX Ensemble.  It has a lot of 
fun things to show you.