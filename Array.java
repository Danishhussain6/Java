class Array {
    public static void main(String[] args) {

        // Single-dimensional array
        int[] a = {10, 20, 30, 40, 50};

        System.out.println("1D Array:");
        for (int x : a)
            System.out.print(x + " ");

        // Two-dimensional array
        int[][] b = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n\n2D Array:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}