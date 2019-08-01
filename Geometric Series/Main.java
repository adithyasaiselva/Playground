#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,r;
  cin>>n;
  if(n%2==0)
  {
    r=3;
    n=n/2;
    cout<<pow(r,(n-1));
  }
  else
  {
    r=2;
    n=(n+1)/2;
    cout<< pow(r,n-1);
  }
  return 0;
}