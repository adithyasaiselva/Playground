#include<iostream>
#include<string.h>
#include<cstdio>
using namespace std;
int main()
{
  char a[100],i;
  int count=1;
  gets(a);
  int n= strlen(a);
  
  if(n<=20)
  {
  for(i=0;i<n;i++)
  {
    if (a[i]==a[i+1])
    {
      count++;
    }
    else{
      cout<<a[i]<<count;
      count=1;
    }
    	
  }
  }
  else
  {
    cout<<"Invalid Input";
  }
  return 0;
}