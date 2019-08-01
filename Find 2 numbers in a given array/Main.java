#include<iostream>
using namespace std;
int main()
{
  int n,a[100],x,y,m=-1,l=-1,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    	cin>>a[i];
  }
  cin>>x>>y;
  for(i=0;i<n;i++)
  {
    	if(a[i]==x)
        {
          m=i;
        }
    	if(a[i]==y)
        {
          l=i;
        }
  }
  cout<<"Element 1 index = "<<m<<endl<<"Element 2 index = "<<l;
  return 0;
}