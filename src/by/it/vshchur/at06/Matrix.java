package by.it.vshchur.at06;

class Matrix extends AbstractVar {


    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    Matrix(String strMatrix) {
        String[] rows = strMatrix.replace("{{", "{").replace("}}", "}").split(",\\{");
        value = new double[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] row = rows[i].replace("{", "").replace("}", "").split(",\\s*");
            value[i] = new double[rows[i].length()];
            for (int j = 0; j < rows[i].length(); j++) {
                value[i][j] = Double.parseDouble(row[j]);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sbColumn = new StringBuilder("{");
        String delimeterColumn = "";
        for (int i = 0; i < value.length; i++) {
            StringBuilder sbRow = new StringBuilder("{");
            String delimeterRow = "";
            for (int j = 0; j < value[i].length; j++) {
                sbRow.append(delimeterRow).append(value[i][j]);
                delimeterRow = ", ";
            }
            sbRow.append("}");
            sbColumn.append(delimeterColumn).append(sbRow);
            delimeterColumn = ", ";
        }
        sbColumn.append("}");
        return sbColumn.toString();
    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("{");
//        String delimeter = "";
//        for (double[] element : value) {
//            sb.append(delimeter).append(Arrays.toString(element));
//            delimeter = ", ";
//        }
//        sb.append("}");
//        return sb.toString();
//    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("{");
//        String delimeter = "";
//        for (double[] element : value) {
//            StringBuilder sbRow = new StringBuilder("{");
//            String delimeterRow = "";
//            for (int i = 0; i < element.length; i++) {
//                sbRow.append(delimeterRow).append(element.toString());
//                delimeterRow = ", ";
//            }
//            sbRow.append("}");
//            sb.append(delimeter).append(element);
//            delimeter = ", ";
//        }
//        sb.append("}");
//        return sb.toString();
//    }

}
