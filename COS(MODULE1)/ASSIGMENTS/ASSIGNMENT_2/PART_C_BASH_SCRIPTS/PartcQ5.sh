#!/bin/bash
echo "Enter no."
read n
c=$((n%2))

if [ $c -eq 0 ]
then 
	echo "Even"
else
	echo "Odd"
fi 
