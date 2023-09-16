public class VendingMachine {
    private String[][][] products;

    public VendingMachine(int rows, int columns, int depth) {
        products = new String[rows][columns][depth];

    }

    public void addProduct(int row, int column, int depth) {
        if (row >= 0 && row < products.length && column >= 0 && column < products[0].length && depth >= 0) {
        } else {
            System.out.println("Invalid location for adding a product.");
        }

    }

    public String getProduct(int row, int column, int depth) {
        if (row >= 0 && row < products.length && column >= 0 && column < products[0].length) {
            String product = products[row][column][depth];
            if (product != null) {
                products[row][column][depth] = null;
                return product;
            } else {
                return "Empty slot";
            }
        } else {
            return "Invalid location";
        }

    }

    public void display() {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[0].length; j++) {
                for (int k = 0; k < products.length; k++) {
                    String product = products[i][j][k];
                    if (product == null) {
                        System.out.print("[Empty] ");
                    } else {
                        System.out.print("[" + product + "] ");
                    }
                }
                System.out.println();
            }

        }
    }
}