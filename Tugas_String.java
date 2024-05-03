public class Tugas_String {
    public static void main(String[] args){
        String nama = "M Atsal Hafidz";
        String nama1 = "M Atsal Hafidz";
        String nama2 = "m atsal hafidz";


        System.out.println("=========================");
        System.out.println("hasil length adalah : " + nama.length());

        System.out.println("=========================");
        System.out.println("hasil substring adalah : " + nama.substring(0, 8));

        System.out.println("=========================");
        System.out.println("hasil charAt adalah : " + nama.charAt(10));

        System.out.println("=========================");
        System.out.println("hasil toLowerCase adalah : " + nama.toLowerCase());

        System.out.println("=========================");
        System.out.println("hasil toUpperCase adalah : " + nama.toUpperCase());

        System.out.println("=========================");
        System.out.println("hasil replace adalah : " + nama.replace("M", "Acan"));

        System.out.println("=========================");
        System.out.println("hasil contains adalah  : " + nama.contains("Atsal"));

        System.out.println("=========================");
        System.out.println("Hasil Method Equals adalah : " + nama.equals(nama1));
        System.out.println("Hasil Method Equals adalah : " + nama.equals(nama2));

        System.out.println("=========================");
        System.out.println("Hasil Method EqualsIgnorCase adalah : " + nama.equalsIgnoreCase(nama1)); 
        System.out.println("Hasil Method EqualsIgnorCase adalah : " + nama.equalsIgnoreCase(nama2));

        System.out.println("=========================");
        System.out.println("Hasil Method EndsWith adalah : " + nama1.endsWith("t"));

    }
}