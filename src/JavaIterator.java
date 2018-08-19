import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)//Hints: use instanceof operator
                break;
        }
        return it;
    }
    public static void main(String args[]){
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Integer values to be add ");
        int n = sc.nextInt();

        System.out.println("Enter the number of String values to be add ");
        int m = sc.nextInt();
        System.out.println("Enter an integer values ");
        for(int i = 0;i<n;i++){
            myList.add(sc.nextInt());
        }

        myList.add("####");
        System.out.println("Enter the String values ");
        for(int i=0;i<m;i++){
            myList.add(sc.next());
        }

        Iterator it=func(myList);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
        sc.close();
    }
}