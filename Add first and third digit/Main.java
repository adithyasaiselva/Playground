#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int sum=(a%10)+(a/100);
  printf("%d",sum);
  return 0;
}