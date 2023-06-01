#!/bin/zsh
for i in {1..100}; do
sleep 2;
echo -n "This is a test in child process $i \n";
done
