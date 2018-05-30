void f(int x)
{
    int y = x;
    return;
}
int main()
{
    int x = 10;
    int y = x >> x;
    f(x);
    return 0;
}