int main()
{
    int[] a = new int[1];
    a[0] = 10;
    return a[0] + 20;
}

/*!! metadata:
=== comment ===
array2.mx
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
30

!!*/
