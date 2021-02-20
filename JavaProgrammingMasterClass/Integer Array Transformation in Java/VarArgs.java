public class VarArgs {
    static void VarArgs(int ...v){    // ... Denotes Integer as an Array When Compiling the Java Program
        System.out.println("Length of array is :"+ v.length+" Contents ");
        for(int i:v){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
