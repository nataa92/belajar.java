// Superclass
class Kendaraan {
    void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan.");
    }
}

// Subclass: Mobil
class Mobil extends Kendaraan {
    @Override
    void nyalakanMesin() {
        System.out.println("Mesin mobil menyala: Brum brum!");
    }
}

// Subclass: Motor
class Motor extends Kendaraan {
    @Override
    void nyalakanMesin() {
        System.out.println("Mesin motor menyala: Ngeng ngeng!");
    }
}

// Program utama
public class DemoOverriding {
    public static void main(String[] args) {
        Kendaraan umum = new Kendaraan();
        Kendaraan sedan = new Mobil();
        Kendaraan bebek = new Motor();

        umum.nyalakanMesin();   // Mesin kendaraan dinyalakan.
        sedan.nyalakanMesin();  // Mesin mobil menyala: Brum brum!
        bebek.nyalakanMesin();  // Mesin motor menyala: Ngeng ngeng!
    }
}

