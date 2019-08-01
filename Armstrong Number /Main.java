#include <stdio.h>
#include<math.h>
int main() 
{
  	int n;
  	scanf("%d",&n);
  	int sum=0,last=0,count=0;
  	int temp=n;
  	while(temp>0)
    {
      temp=temp/10;
      count++;
      
    }
  int temp1=n;
  	while(temp1>0)
    {
      	last=temp1%10;
      	sum=sum+ pow(last,count);
      	temp1=temp1/10;
    }
  
  	if(sum==n)
    {
      printf("Armstrong Number");
    }
  	else
     {
      printf("Not an Armstrong Number");
    }
	
  
	return 0;
}