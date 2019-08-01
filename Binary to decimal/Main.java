#include<stdio.h>
int main()
{
  int n,a[100],i=0,j,sum=0;
  scanf("%d",&n);
  while(n>0)
  {
    	a[i]=n%10;
    	n=n/10;
      	i++;
  }
  for(j=0;j<i;j++)
  {
    sum= sum+ a[j]* pow(2,j);
  }
  printf("%d",sum);
  return 0;
}