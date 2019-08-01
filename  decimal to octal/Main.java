#include<iostream>
using namespace std;
int main()
{
	int n,a[60];
  	cin>>n;
  	int i=0;
  	while(n!=0)
    {
      	a[i]=n%8;
      	n=n/8;
      	i++;
    }
  	for(int j=i-1;j>=0;j--)
      cout<<a[j];
      	
	return 0;
  
}