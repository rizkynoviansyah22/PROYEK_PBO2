abstract class SivitasAkademika extends Pengguna {
    protected boolean statusAktif;
    protected int tahunMasuk;

    public void aktifkanAkun() {
        statusAktif = true;
    }

    public void nonaktifkanAkun() {
        statusAktif = false;
    }
}