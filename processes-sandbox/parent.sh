#!/bin/zsh
zsh child.sh & 
zsh child.sh &
for i in {1..100}; do sleep 2; echo -n "This is the parent process $i \n"; 
done