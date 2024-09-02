#include <unistd.h>
#include <stdio.h>
int main()
{
	int x=5;
	fork();
	x++;
	printf("%d\n",x);
	return 0;
}
