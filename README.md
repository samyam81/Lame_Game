Java Battle Game

Overview
Java Battle Game is a simple console-based game where a player battles against an enemy. The player and the enemy take turns attacking each other until one of them loses all their health points and is defeated.

How to Play
Setup: Run the Java program provided (Main.java) to start the game.
Characters: You control the player character, while the enemy character is controlled by the computer.
Battle: Each turn, you and the enemy take turns attacking each other.
Damage: The amount of damage dealt in each attack is randomly generated between 1 and 10.
Victory: The battle continues until either you or the enemy runs out of health points.
Level Up: If you defeat the enemy, you gain experience points and level up.
File Structure
Character.java: Defines the Character class, which represents both the player and the enemy.
Player.java: Defines the Player class, which extends the Character class and adds functionality specific to the player character.
Enemy.java: Defines the Enemy class, which extends the Character class and represents the enemy character.
Game.java: Defines the Game class, which manages the gameplay loop and interactions between the player and the enemy.
Main.java: Entry point of the program. It initializes the player, enemy, and game objects and starts the game loop.
Requirements
Java Development Kit (JDK) installed on your system to compile and run the Java code.
Usage
Compile the Java files using the command: javac Main.java
Run the compiled program using the command: java Main
Contributors
Samyam.81
