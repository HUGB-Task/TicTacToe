[![Build Status](https://travis-ci.org/HUGB-Task/TicTacToe.svg)](https://travis-ci.org/HUGB-Task/TicTacToe)
# TicTacToe

### Quick summary:
Welocome to the README.md file, this document demonstrates how __Tasks's__ game __TicTacToe__ works, how it is setup and tested. 

Version: **1.0**
---
### Follow the following steps:
##### Set up Git Source Control Client: 
- **To** **Install:** open terminal and type: $ sudo apt-get install git 
- **SSH** **Key:** 
    * terminal: $ ssh-keygen -> Enter -> Enter (for default file name and no password)
    * terminal: $ cat ~/.ssh/id_rsa.pub and copy the key
    * Sign up on GitHub 
    * Open profile -> settings -> SSH keys -> add SSH key
    * Verify SSH in terminal: $ ssh -T git@github.com" -> yes -> hi.. should appear
- **Clone Repository**: $ git clone with _SSH_: <git@github.com:HUGB-Task/TicTacToe.git>
or _HTTPS_: 
https://github.com/HUGB-Task/TicTacToe.git

##### Set up Java:
- **To** **Install:** terminal: $ sudo apt-get install openjdk-8-jdk


##### Run the Application Locally:
- **To** **Run:** terminal: $ cd ~/TicTacToe and $ ./gradlew run
- **Open** **URL:** open your favorite browser and type: http://0.0.0.0:4567 or just 0.0.0.0:4567. The site should run locally if "./gradlew run" has not been terminated.
- **Close** **Game**: close the browser and type "CTRL-C" in terminal.

##### Run tests:
- **To** **Run:** terminal: $ cd ~/TicTacToe and $ ./gradlew test

##### Code coverage:


##### How to play the game: 
###### The game has to be open in a browser! 
1. Click "**New** **Game**" button, then you see a clean board with 9 squares where each squeare has has a number.
2. By default your are playing the computer.
3. You move first, so, type a number rom 1-9 into the textfield below the board and click "**Make** **Move**" button.
4. An "**X**" will appear in a squeare corresponding to youre typed in number.
5. As soon as you make a move the computer will make a move.
6. Finally when you or the computer get three symbols in a row, column or diagonal you or the computer win.
7. If that does not happen there will be a tie.
8. clear the board by Clicking "**New** **Game**" again

##### Contact Information:
* [Task.ehf](https://www.google.com) 
* University of Reykjavik

