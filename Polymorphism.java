
//Method Overloading
//class Maths {
//
//
//    static int Multiply(int a, int b)
//    {
//        return a * b;
//    }
//    static double Multiply(double a, double b)
//    {
//        return a * b;
//    }
//}


//Method Overriding

class Maths {


    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}

class Polymorphism {
    public static void main(String[] args)
    {
        System.out.println(Maths.Multiply(12, 14,13));
        System.out.println(Maths.Multiply(8, 9,5));
    }
}






