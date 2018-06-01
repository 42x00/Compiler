int main() {
    int la = 5;
    int[][] a = new int[la][2];
    a[4][1] = 2;
    return a[4][1];
}




/*!! metadata:
=== comment ===
array3.mx
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
15

!!*/
