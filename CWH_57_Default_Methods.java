package com.company;
interface mycamera{
    void takesnap();
    void recordVideo();
    private void yeahgreet(){
        System.out.println("Good Morning");
    }
    default void recordVideo4k(){
        yeahgreet();
        System.out.println("Recording In 4k");
    }
}
interface mywifi{
    String[] getNetworks();
     void coonectNetwork(String Network);
}
class mycellphone {
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickcall(){
        System.out.println("connecting.....");
    }
}
class mySmartsPhone extends mycellphone implements mycamera,mywifi{
      public   void takesnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordVideo() {
        System.out.println("record video");
    }

    public String[] getNetworks() {
        System.out.println("Getting List Of networks");

         String [] networklinks={"Hassan","Siraj","Moiz"};
    return networklinks;
      }


    public void coonectNetwork(String Network) {
        System.out.println("connecting to The Networks"+Network);
    }
}

public class CWH_57_Default_Methods {
    public static void main(String[] args) {
mySmartsPhone samsung=new mySmartsPhone();
String []arr=samsung.getNetworks();
for (String elements:arr){
    System.out.println(elements);
}
samsung.recordVideo4k();
    }
}
