package by.it.agrinkevich.at06;

public class Runner {
    public static void main(String[] args) {
       /* Var var = new Scalar("1111.3333");
        System.out.println(var);

        Var var2 = new Scalar(222);
        System.out.println(var2);

        Scalar var3 = new Scalar(3333);
        System.out.println(var3);

        Var var4 = new Vector("{1,2,3,4,5}");
        System.out.println(var4);*/

/*        double[][] matrix = new double[][]{{1.44,2.55,3.3,4,5},{1,2,3.53,4,5}, {5, 7, 8}};
        Matrix x = new Matrix(matrix);
        System.out.println(new Matrix(x));*/



        String startString = "{{2, 4, 7}, {8, 9, 4, 7}, {7, 2, 8}}";
        System.out.println(new Matrix(startString));
       // parseString(startString);
    }

    /*public static void parseString(String startString) {
        String nextString = startString.substring(1, startString.length() - 1);
        System.out.println(nextString);
        Pattern pattern = Pattern.compile("(\\{)(.+?)(})");
        Matcher matcher = pattern.matcher(nextString);
        int count = matcher.groupCount();
        double[][] newRes = new double[count][];
        int i = 1;
        while (matcher.find() && i <= count) {
            String str = matcher.group(2);
            String[] s1 = str.split(",\\s");
            double[] d2 = new double[s1.length];
            for (int j = 0; j < s1.length; j++) {
                d2[j] = Double.parseDouble(s1[j]);
            }
            newRes[i - 1] = d2;
            i++;
        }

        for (int k = 0; k < newRes.length; k++) {
            for(int g = 0; g < newRes[k].length; g++) {
                System.out.print(newRes[k][g] + " ");
            }
            System.out.println();
        }
        System.out.println("r");

    }*/
}
