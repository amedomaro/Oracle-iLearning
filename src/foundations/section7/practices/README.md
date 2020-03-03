# Practices - Section 7
### Date Night at the Arcade
###### Overview
Tonight is date night at the arcade.  After great evening of playing games and winning prizes, you and your 
date can’t help wondering “How are these machines programmed?”.  You discuss possible designs on the subway 
back to campus.  You enjoy the rest of the night romantically programming your ideas together.

You’ve made several observations about the arcade.  A terminal is used to convert money into game credits.  
Credits are loaded onto plastic game cards.  This data is stored in a card’s magnetic strip.  Cards may be 
swiped at any arcade game through the game’s magnetic card reader.  Games subtract credits from a card, but 
awards tickets.  Tickets are also stored on a card’s magnetic strip.  Tickets may be exchanged for prizes 
at the terminal.  The terminal is also used to check a card’s credit balance and ticket count, and to 
transfer credits or tickets between cards.

###### Tasks
Write a Java program that models the properties, behaviors, and interactions of objects at the arcade.  
You’ll also need a test class that contains a main method.  Use the main method to model actions that 
would drive the program such as object instantiations and card swipes.  All fields must be private.  
Provide getter and any necessary setter methods.

###### Cards 
The magnetic strip on game cards offers limited storage space and zero computing power.  Cards store 
information about their current credit balance, ticket balance, and card number.  Neither balance should 
ever be negative.  Individual cards are incapable of performing calculations, including simple addition, 
or realizing that their balances could go negative. 

Every card is created with a unique integer identification number.  Although each individual card is 
incapable of simple addition, it’s still possible to perform calculations with properties that belong to 
all cards.

###### Games
Games require a certain number of credits to be played.  Each game is equipped with a magnetic card 
reader and LCD display.  Swiping a card reduces its credit balance, but awards a random, non-negative 
number of tickets.  Print the card number, number of tickets won, along with the new total.  Print a 
message if a card has insufficient credits to play a game.

The “Win Random Tickets Game!” is actually a terrible game.  You’re welcome to create something more 
complex, but it’s not necessary for this assignment.

###### Prize 
CategoriesEach prize category has a name, number of tickets required to earn that prize, and a count of 
how many items of this category remain in a terminal.  Prizes know nothing about the terminal they belong to.

###### Terminals
Each terminal contains a magnetic card reader.  A terminal accepts money which is converted to credits on 
a card.  Money is accepted as whole numbers.  Credits are awarded at a rate of 2 credits for every $1.  
Players may use a Terminal to check their card’s balances.  Include the card’s number in this printout.  
All or just a portion of credits or tickets may be transferred between cards. Always print a card’s 
balances when either credits or tickets are accessed through a terminal.  Finally, tickets may be 
exchanged at terminals for prizes.  Print an error message if a card has insufficient tickets or if the 
terminal is out of a particular prize type.  Print when a prize is awarded and the remaining number of 
that prize type in the terminal.  A terminal offers 3 categories of prizes.

###### Main Method
Instantiate 2 cards and whatever other objects might be necessary to test your program.  

- Load credits onto each card.
- Play a bunch of game using both cards.
- Transfer the balance of credits and tickets from Card 1 to Card 2.
- Request prizes using Card 2.
- Try to play a game and request a prize using Card 1.
- Perform whatever other actions might be necessary to test your program.