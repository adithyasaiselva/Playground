#include <iostream>
#include<cstring>

using namespace std;
int main() 
{
	char c,a;
  	cin>>c;
  	if(isupper(c)){
      	a=tolower(c);
  		cout<<a;
    }
  	else{
      	a=toupper(c);
  		cout<<a;
    }
	return 0;
}