package OOPS;

 class OOPS {
    public static void main(String[] args) {
        Pen p1=  new Pen();
        p1.setColor("Green");
        p1.setTip(10);
        System.out.println(p1.getTip()+" "+p1.getColor());
    }
}
// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd)
//     {
//         password = pwd;
//     }
// }

class Pen{
    private String color;
    private int tip;
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int math,int phy,int chem){
        percentage = (math+phy+chem)/3;
    }

}
