public class Mekteb {
    String telebe;
    String muellim;
    Mekteb(String telebe, String muellim){
        this.telebe = telebe;
        this.muellim = muellim;
    }
    void derse_basla(){
        System.out.println(muellim+" "+telebe +"-e ders kecir.");
    }
}
