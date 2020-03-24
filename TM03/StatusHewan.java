public class StatusHewan{

    public static void main(String args[]){
        Anjing anjing = new Anjing();
        Ikan ikan = new Ikan();
        
        anjing.statusSuntikRabies = false;
        ikan.statusGantiAir = true;
        
        if (anjing.status() == false) {
            System.out.println("Anjing belum suntik rabies");
        }else{
            System.out.println("Anjing sudah suntik rabies");
        }
        
        if (ikan.status() == false) {
            System.out.println("Ikan belum ganti air");
        }else{
            System.out.println("Ikan sudah ganti air");
        }
    }
}