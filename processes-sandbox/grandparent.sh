#!/bin/zsh
zsh parent.sh &
zsh parent.sh &
for i in {1..100}; do
sleep 2;
echo -n "This is the grandparent process $i \n";
done 