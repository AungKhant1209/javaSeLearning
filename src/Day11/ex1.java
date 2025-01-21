//package Day11;
//
//public class ex1  {
//    public static String text="min min phoe pyae";
//    public static String[] stringArr=text.split(" ");
//    public static int indexMain=stringArr.length;
//
//    public static void main(String[] args) {
//        String name="min";
//        int location=findIndex(name);
//        delete(location);
//        display();
//
//
//    }
//    public static int findIndex(String str){
//
//        for (int i=0; i <indexMain; i++){
//            if (str.equals(stringArr[i])){
//                return i;
//
//            }
//
//        }
//        return -1;
//    }
//    public static void delete(int index){
//        int gotNumber=findIndex(stringArr[index]);
//        while (stringArr[index+1]!=null){
//            for(int gotNumber=index+1; j<indexMain; j++){
//                stringArr[j]=stringArr[j+1];
//            }
//        }
//        stringArr[index]=null;
//        indexMain--;
//    }
//    public static void display(){
//        for (int k = 0; k < indexMain; k++) {
//            System.out.print(" ");
//            System.out.print(stringArr[k]);
//        }
//
//    }
//}
