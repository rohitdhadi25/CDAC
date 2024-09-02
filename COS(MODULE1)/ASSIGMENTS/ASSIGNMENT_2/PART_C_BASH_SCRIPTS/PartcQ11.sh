#! /bin/bash
while true

do
echo "enter any no.: "
read a
if [ $a -lt 0 ]
then
	echo "negative no. readed"
	break
else
	square=$((a*a))
	echo "square is $a is : $square "	
fi
done


