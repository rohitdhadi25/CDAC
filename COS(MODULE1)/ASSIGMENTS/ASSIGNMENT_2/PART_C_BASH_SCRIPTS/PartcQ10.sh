#! /bin/bash
#echo -e "\t1\t2\t3\t4\t5"
for i in {1..10}

do
echo -n -e "$i=\t"
	for j in {1..5}
	do
		echo -n -e "$((i*j))\t"
	done
	echo ""
done

