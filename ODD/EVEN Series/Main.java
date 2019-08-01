#include<iostream>
using namespace std;
int main()
{
	int n,a,d;
  	cin>>n;
  	if(n%2==0)
    {
      a=0,d=1;
      cout<<a+((n/2)-1)*d;
    }
  else
  {
    a=0,d=2;
    int p=(n+1)/2;
    cout<<a+(p-1)*d;
  }
	return 0;
  
}