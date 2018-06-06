int N = 8;
int[] row = new int[8];
int[][] d = new int[2][];

void search(int c)
{
    if (c == N)
    {
    }
    else
    {
        int r;
        for (r = 0; r < N; r++)
        {
            if (row[r] == 0 && d[0][r + c] == 0 && d[1][r + N - 1 - c] == 0)
            {
                d[1][r + N - 1 - c] = 1;
            }
        }
    }
}

int main()
{
    int i;
    for (i = 0; i < 2; i++)
        d[i] = new int[8 + 8 - 1];
    search(0);
    return 0;
}