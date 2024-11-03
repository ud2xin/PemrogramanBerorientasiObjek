package No2;
public class HitungHari {
    public String Hitung(String tahun, String bulan){
        String[] bln31 = {"Januari", "Maret","Mei","Juli","Agustus","Oktober","Desember"};
        int getTahun = Integer.valueOf(tahun);
        String getHari = "";
        for (String i : bln31) {
            if(bulan == i){
                getHari = "31";
                break;
            }
        }
        if(getHari == ""){
            if(bulan == "Februari"){
                if(getTahun % 4 == 0){
                    getHari = "29";
                }else{
                    getHari = "28";
                }
            }else{
                getHari = "30";
            }
        }
            
        return "Jumlah hari pada bulan "+bulan+" tahun "+ tahun +" adalah "+getHari;
    }
}
