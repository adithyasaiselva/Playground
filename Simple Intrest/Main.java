#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float p,n,r;
  cin>>p>>n>>r;
  float si=(p*n*r)/100;
  std::cout << std::fixed << std::setprecision(6) << si;
  return 0;
}