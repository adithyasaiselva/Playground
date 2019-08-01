#include<iostream>
using namespace std;
int main()
{
	int a=0,b=1,c,n,i;
  	cin>>n;
  	
  	for(i=0;i<n;i++)
    {
      if(i==0)
      {
        cout<<a<<" ";
      }
      else if(i==1)
      {
        cout<<b<<" ";
      }
      else
      {
      c=a+b;
      cout<<c<<" ";
      a=b;
      b=c;
      }
    }
	return 0;
  
}