#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,a[100],i=0,j,sum=0,num[100];
  cin>>n;
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
  i=0;
  while(sum!=0)
  {
    num[i]=sum%8;
    sum= sum/8;
    i++;
  }
  for (int j = i - 1; j >= 0; j--) 
  {
    cout<<num[j];
  }
  return 0;
}