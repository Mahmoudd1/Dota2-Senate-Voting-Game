# Dota2-Senate-Voting-Game
This program predicts which party will win in the Dota2 Senate Voting Game based on a given input string of senators from the Radiant and Dire parties.

## Problem Statement
The Dota2 senate consists of senators from two parties: the Radiant and the Dire. The voting for a change in the Dota2 game is a round-based procedure, where each senator can exercise one of two rights: ban one senator's right or announce the victory if all remaining senators are from the same party.

Given a string senate representing each senator's party belonging, the program predicts which party will announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".
## Approach
The approach taken to solve this problem was as follows:

Count the number of senators from each party (R and D) in the input string
Use a loop to simulate the round-based voting procedure
In each round, check if either party has no senators left to vote; if so, return the opposing party as the winner
Otherwise, check if the current senator is eligible to vote (i.e., has not been banned in a previous round)
If the current senator is from the Radiant party, and there are no previously banned Dire senators, ban a random Dire senator, decrement the Dire count, and mark the current senator as banned
If the current senator is from the Dire party, and there are no previously banned Radiant senators, ban a random Radiant senator, decrement the Radiant count, and mark the current senator as banned
If the current senator cannot ban another senator, mark them as ineligible to vote in the next round and move on to the next senator

## Time and Space Complexity
The time complexity of this approach is O(n), where n is the length of the input string. 
The space complexity of this approach is O(n), where n is the length of the input string. This is because a char array is created from the input string
