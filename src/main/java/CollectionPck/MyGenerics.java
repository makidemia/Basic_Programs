package CollectionPck;

import javax.xml.bind.Element;

public class MyGenerics < E >{


        public  void  printArray(E[] elements) {
            for ( E element : elements){
                System.out.println(element );
            }
            System.out.println();
        }

    public void  printArr(E[] arr){
        for (E x:arr)
        {
            System.out.println(x);
        }
        System.out.println();
        }
        public static void main( String args[] ) {
            Integer[] intArray = { 10, 20, 30, 40, 50 };
            Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

            MyGenerics mg=new MyGenerics();
            System.out.println( "Printing Integer Array" );
            mg.printArray( intArray  );

            System.out.println( "Printing Character Array" );
            mg.printArray( charArray );

            mg.printArr(intArray);
        }


    }
