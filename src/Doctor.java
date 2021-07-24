public class Doctor {
    int id;
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    Double weight;
    Double height;
    String blood;

    Doctor(String n){
        name = n;
    }

    public void showName(){
        System.out.println(name);
    }
}
