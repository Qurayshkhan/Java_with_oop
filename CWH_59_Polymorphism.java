package com.company;
interface mycamera2{
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
interface mywifi2{
    String[] getNetworks();
    void coonectNetwork(String Network);
}
class mycellphone2 {
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickcall(){
        System.out.println("connecting.....");
    }
}
class mySmartsPhone2 extends mycellphone implements mycamera2,mywifi2{
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

public class CWH_59_Polymorphism {
    public static void main(String[] args) {
       mycamera2 cam1=  new mySmartsPhone2();
       //cam1.getnetwork(); not Allowed for good
cam1.recordVideo4k();
    }
}
