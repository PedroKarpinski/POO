package Atividade04;

public class Matrix {
    private final double[][] cells;

    Matrix(double[][] cells) {
        this.cells = new double[cells.length][cells[0].length];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                this.cells[i][j] = cells[i][j];
            }
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        for (var i : this.cells) {
            for (var j : i) {
                s += String.format("%10.6f", j);
            }
            s += "\n";
        }
        return s;
    }

    public double[][] toArray() {
        double c[][] = new double[this.cells.length][this.cells[0].length];

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[0].length; j++) {
                c[i][j] = this.cells[i][j];
            }
        }

        return c;
    }

    public int getRows() {
        return this.cells.length;
    }

    public int getColumns() {
        return this.cells[0].length;
    }

    public double getAt(int i, int j) {
        if (i < 0 || i >= this.cells.length) {
            throw new IllegalArgumentException("Linha invalida");
        }
        
        if (j < 0 || j >= this.cells[0].length) {
            throw new IllegalArgumentException("Coluna invalida");
        }

        return this.cells[i][j];
    }

    public Matrix plus(Matrix b) {
        if (this.cells.length != b.cells.length || this.cells[0].length != b.cells[0].length) {
            throw new IllegalArgumentException("Dimensoes incompativeis");
        }   

        double c[][] = new double[this.cells.length][this.cells[0].length];

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[0].length; j++) {
                c[i][j] = this.cells[i][j] + b.cells[i][j];
            }
        }

        return new Matrix(c);
    }

    public Matrix minus(Matrix b) {
        if (this.cells.length != b.cells.length || this.cells[0].length != b.cells[0].length) {
            throw new IllegalArgumentException("Dimensoes incompativeis");
        }   

        double c[][] = new double[this.cells.length][this.cells[0].length];

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[0].length; j++) {
                c[i][j] = this.cells[i][j] - b.cells[i][j];
            }
        }

        return new Matrix(c);
    }

    public Matrix times(double b) {
        double c[][] = new double[this.cells.length][this.cells[0].length];
        
        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[0].length; j++) {
                c[i][j] = this.cells[i][j] * b;
            }
        }
        
        return new Matrix(c);
    }

    public Matrix times(Matrix b) {
        if (this.cells[0].length != b.cells.length) {
            throw new IllegalArgumentException("Dimensoes incompativeis");
        }

        double c[][] = new double[this.cells.length][b.cells[0].length];

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < b.cells[0].length; j++) {
                for (int k = 0; k < this.cells[0].length; k++) {
                    c[i][j] = c[i][j] + this.cells[i][k]*b.cells[k][j];
                }
            }
        }

        return new Matrix(c);
    }

    public Matrix getTranspose() {
        double c[][] = new double[this.cells[0].length][this.cells.length];

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[0].length; j++) {
                c[j][i] = this.cells[i][j];
            }
        }

        return new Matrix(c);
    }

    public boolean isSquare() {
        return this.cells.length == this.cells[0].length;
    }

    public boolean isSymmetric() {
        return this.toString().equals(this.getTranspose().toString());
    }
}