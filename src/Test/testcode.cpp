int main(){
  int[] a = new int[5];
  int i = 1;
  int j = 2;
  a[a[j]] = 3;
  println(toString(a[0]));
  return 0;
}