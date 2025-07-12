package Type_Conversion;

///  type casting is a method or process that converts a data type into another data types in both ways manually and automatic
///  1. implicit / automatic / widening  - widening conversions takes places when two data types are automatically converted

///  --- this happens when : two data types are compatible , when we assign  value  of smaller data type to bigger data type.
///
///  byte -> short -> int -> long -> float -> double
///
///
/// 2 . explicit / Narrowing  -  if we want to assign a value of large data type  to a smaller datatype we perform explicit type casting or narrowing.
///
/// double  -> float -> long -> int -> short -> byte

public class Type_casting {
    public static void main(String[] args) {
          // explicit / narrowing - typecasting ; also called lossy conversion may loss in data
        int lonng = 129;
        byte  bymte = (byte)lonng;
        System.out.println(bymte);

          // implicit / widening  -  automatic typecasting;
        int i = 100;
        long l  = i;
        System.out.println(l);



    }
    
}
