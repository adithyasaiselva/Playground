#include<iostream>
using namespace std;
int main()
{
  int n,a[100],b,i,count=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    	cin>>a[i];
  }
  cin>>b;
  for(i=0;i<n;i++)
  {
    	if(a[i]==b)
        {
          count++;
          break;
        }
    	else
        {
          count=0;
        }
  }
 if(count==0)
 {
   cout<<b<<" isn't present in the array.";
 }
  else
  {
    cout<<i+1;
  }
  
  return 0;
}