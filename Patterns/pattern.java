package Patterns;
//pyramid pattern
class pattern{
    public static void main(String[] args) {
        for(int line =1; line<=10; line++){
            for(int star= 1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// inverted pattern
// class pattern{
//     public static void main(String[] args) {
//         for(int line =10; line>0; line--){
//             for(int star= line;star>0;star--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }