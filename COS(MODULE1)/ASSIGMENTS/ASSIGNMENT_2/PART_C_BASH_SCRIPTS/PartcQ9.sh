#! /bin/bash
echo "Enter any no. to check: "
read a
if [ $a -gt 10 ]
then
echo "$a is greater than 10"
else
echo "$a is smaller than 10"
fi

