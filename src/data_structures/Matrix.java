package data_structures;

class Dimension {
    int d1, d2;

    public Dimension(int n1, int n2) {
        this.d1 = n1;
        this.d2 = n2;
    }
}

public class Matrix {

    int[][] matrix;
    Dimension dimension;

    public Matrix(int[][] m, int d1, int d2) {
        this.matrix = m;
        this.dimension = new Dimension(d1, d2);
    }

    public void printMatrix() {
        for (int i = 0; i < this.getDimensions()[0]; i++) {
            for (int j = 0; j < this.getDimensions()[1]; j++)
                System.out.print(this.matrix[i][j] + " ");
            System.out.println();
        }
    }

    public int[] getDimensions() {
        return new int[] {this.dimension.d1, this.dimension.d2};
    }

    public int[] findTarget(int target) {
        for (int i = 0; i < this.getDimensions()[0]; ++i) {
            for (int j = 0; j < this.getDimensions()[1]; ++j) {
                if (matrix[i][j] == target)
                    return new int[] {i, j};
            }
        }

        return null;
    }

    public int[][] twoSum(int target) {



        return null;
    }

    public int[] getDimensionSizes(int[][] matrix) {
        int d1 = matrix.length;
        int d2 = 0;

        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i].length > d2) {
                d2 = matrix[i].length;
            }
        }

        return new int[] {d1, d2};
    }

}
