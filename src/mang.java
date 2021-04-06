import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("enter the size:");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("Size khong qua 20");
            }

        } while (size>200);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("enter element"+(i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","elements is array:","");
        for(int j=0;j<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        for(int j=0;j<array.length/2;j++){
            int temp=array[i];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;

        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
