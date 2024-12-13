import java.util.Date;

class Pengguna {
    protected String id;
    protected Date tanggalLahir;

    public boolean validasiData() {
        // Logika validasi
        return id != null && !id.isEmpty() && tanggalLahir != null;
    }
}