int[] a = new int[4];
int main()
{
    int[] b = new int[4];
    b[2]=2;
    a=b;
    println(toString(a[2]));
    return 0;
}



/*!! metadata:
=== comment ===
lvalue2-5110379024-wuhang.mx
=== input ===

=== assert ===
output
=== timeout ===
0.1
=== output ===
2
=== phase ===
codegen pretest
=== is_public ===
True

!!*/
