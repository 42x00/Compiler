int min(int a, int b)
{
    if (a <= b)
        return a;
    return b;
}

int main()
{
    int x = 10;
    int y = 20;
    return min(x, y);
}

/*!! metadata:
=== comment ===
function1.mx
=== assert ===
exitcode
=== timeout ===
0.1
=== input ===

=== phase ===
codegen pretest
=== is_public ===
True
=== exitcode ===
10

!!*/
