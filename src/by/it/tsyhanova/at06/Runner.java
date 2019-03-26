package by.it.tsyhanova.at06;

public class Runner {
    public static void main(String[] args) {
        //Var абстрактный класс
        //c v1 можно делать те действия, которые определяются интерфейсом(классом), типом которого объявлена v1
        //однако по факту переменной v1 может являться кто-то из объявленных потомков или сам класс
        //т.е. можно было бы написать Scalar v1=new Scalar(); и поведение бы не изменилось
        Var v1=new Scalar(3.14);
        Var v2=new Scalar(222);
        //т.к. в Scalar есть метод toString, то напечатается то, что записано в самом классе Scalar
        System.out.println(v1);
        //т.к. в Vector нет метода toString, то напечатается то, что записано в его родительском классе AbstractVar
        System.out.println(v2);
        //v1, v2 экземпляры


        Var var3=new Scalar(3333);
        System.out.println(var3);

        Var var4=new Vector("{1.0, 2.0, 4.0}");
        System.out.println(var4);
    }
}
