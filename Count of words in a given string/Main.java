#include<iostream>
#include<string.h>
#include<cstdio>
using namespace std;
int main()
{
  char a[100],count=0;
  gets(a);
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]==' ')
      count++;
  }
  cout<<count+1;
  return 0;
}