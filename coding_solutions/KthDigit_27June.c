#include<stdio.h>
#include<math.h>
void main()
{
    int t;
    printf("enter the number of testcases:\n");
    scanf("%d",&t);
        while(t--)
        {
            int a,b,k,i,digit;
            long int c;
            printf("\nenter a,b,k:-\n");
            scanf("%d%d%d",&a,&b,&k);
            c=pow(a, b);
            for(i=0; i<k; i++)
            {
                digit=c%10;
                c=c/10;
            }
            printf("kth digit is %d",digit);
        }
