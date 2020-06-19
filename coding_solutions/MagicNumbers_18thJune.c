//Write a C program to generate first N magic numbers
#include <stdio.h> 
int nthMagicNo(int n) 
{ 
	int pow=1, answer = 0; 
    while (n) 
    { 
       pow = pow*5;
        printf("%d\n",pow);
       if (n & 1) 
         answer+= pow;
       n >>= 1; 
    } 
    return answer; 
} 
void  main() 
{ 
    int n;
	  printf("enter the number of n\n");
	  scanf("%d",&n);
    printf("%d\n",nthMagicNo(n));
} 
