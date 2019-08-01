#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float c;
  cin>>c;
  std::cout<<std::fixed<<std::setprecision(2)<< c* 9/5 +32;
  return 0;
}